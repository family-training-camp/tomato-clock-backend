package com.tomatoclock.authserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

import javax.sql.DataSource;

// 声明此服务作为Oauth2服务
@EnableAuthorizationServer
@Configuration
/** 定义哪些应用程序在OAuth2认证服务中注册 */
public class Oauth2Config extends AuthorizationServerConfigurerAdapter {

  @Autowired private AuthenticationManager authenticationManager;

  @Qualifier("userDetailServiceImpl")
  @Autowired
  private UserDetailsService userDetailsService;

  /**
   * 定义哪些客户端将被你的服务注册
   *
   * @param clients
   * @throws Exception
   */
  @Override
  public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
    clients
        .inMemory()
        .withClient("client")
        .secret("{noop}client")
        .authorizedGrantTypes("refresh_token", "password", "client_credentials")
        .scopes("webclient");
  }

  /**
   * 告诉spring使用spring自带的默认身份验证管理器和用户详细信息服务
   *
   * @param endpoints
   * @throws Exception
   */
  @Override
  public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
    endpoints.authenticationManager(authenticationManager).userDetailsService(userDetailsService);
  }
}
