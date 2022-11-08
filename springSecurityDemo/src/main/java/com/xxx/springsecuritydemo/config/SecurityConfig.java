package com.xxx.springsecuritydemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected  void configure(HttpSecurity http) throws Exception {
        http.formLogin()

                .failureForwardUrl("/toError");
        //授权认证
        http.authorizeHttpRequests()
                .antMatchers("/error.html").permitAll()
                .antMatchers("/login.html").permitAll()
                .anyRequest().authenticated();
        //关闭防火墙
        http.csrf().disable();
    }
    @Bean
    public PasswordEncoder getPw(){
        return new BCryptPasswordEncoder();
    }
}
