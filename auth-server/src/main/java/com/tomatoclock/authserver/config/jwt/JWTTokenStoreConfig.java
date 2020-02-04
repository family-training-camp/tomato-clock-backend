package com.tomatoclock.authserver.config.jwt;

import com.tomatoclock.authserver.config.jwt.JWTTokenEnhancer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * 告诉认证服务如何生成和解析JWT令牌
 * 管理JWT令牌的创建，签名和装换
 */
@Configuration
public class JWTTokenStoreConfig {

  @Bean
  public TokenStore tokenStore(){
    return new JwtTokenStore(jwtAccessTokenConverter());
  }

  /**
   * 使用默认的令牌服务实现
   * @return
   */
  @Bean
  @Primary
  public DefaultTokenServices tokenServices(){
    DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
    defaultTokenServices.setTokenStore(tokenStore());
    defaultTokenServices.setSupportRefreshToken(true);
    return defaultTokenServices;
  }

  /**
   * 定义了令牌将如何被装换，并设置了用户签名的签名密钥
   * @return
   */
  @Bean
  public JwtAccessTokenConverter jwtAccessTokenConverter(){
    JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
    converter.setSigningKey("test");
    return converter;
  }

  @Bean
  public TokenEnhancer jwtTokenEnhancer(){
    return new JWTTokenEnhancer();
  }

}
