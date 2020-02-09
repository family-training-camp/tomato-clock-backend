package com.tomatoclock.taskserver.config.filter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.tomatoclock.taskserver.config.UserContext;
import com.tomatoclock.taskserver.dto.CurrentUser;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Slf4j
public class UserInfoFilter implements Filter {

  @Override
  public void doFilter(
      ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
      throws IOException, ServletException {
    HttpServletRequest request = (HttpServletRequest) servletRequest;
    String token = request.getHeader("Authorization");
    if (token != null) {
      DecodedJWT jwt = JWT.decode(token.split(" ")[1]);
      Long userId = jwt.getClaim("user_id").asLong();
      String username = jwt.getClaim("user_name").asString();
      List<String> roles = jwt.getClaim("authorities").asList(String.class);
      CurrentUser currentUser = new CurrentUser();
      currentUser.setId(userId);
      currentUser.setUsername(username);
      currentUser.setRoles(roles);
      UserContext.setCurrentUser(currentUser);
      filterChain.doFilter(servletRequest, servletResponse);
    }
    log.info(token);
  }
}
