package com.example.crudclienteback.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/api/clientes/salvar").hasRole("ADMIN")
                .antMatchers("/api/clientes/editar").hasRole("ADMIN")
                .antMatchers("/api/clientes/deletar/**").hasRole("ADMIN")
                .antMatchers("/api/clientes/find-all").permitAll()
                .antMatchers("/api/login").permitAll();
    }
}
