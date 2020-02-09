package com.tomatoclock.taskserver.config;

import com.tomatoclock.taskserver.config.filter.UserInfoFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
  @Bean
  public FilterRegistrationBean<UserInfoFilter> userInfoFilterRegistration() {
    FilterRegistrationBean<UserInfoFilter> registration = new FilterRegistrationBean<>();
    registration.setFilter(new UserInfoFilter());
    registration.addUrlPatterns("/*");//配置过滤路径
    registration.setName("userInfoFilter");//设置filter名称
    registration.setOrder(1);//请求中过滤器执行的先后顺序，值越小越先执行
    return registration;
  }
}
