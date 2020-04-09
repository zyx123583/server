package com.spring.security.server.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
    @Override
    public void configure(ClientDetailsServiceConfigurer clientDetailsService) throws Exception {
        clientDetailsService.inMemory()
                .withClient("client")
                .secret("123456")
                .scopes("all")
                .autoApprove(true)
                .authorizedGrantTypes("authorization_code")
                .redirectUris("http://127.0.0.1:8081/login/oauth2/code/A");
    }


}
