package com.example.ch2ex2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService() {
        var userDetailsService = new InMemoryUserDetailsManager(); //InMemoryUserDetailsManager는 간단한 테스트를 위하여 사용하였다.

        var user = User.withUsername("gimeast")
                .password("123")
                .authorities("read")
                .build();

        userDetailsService.createUser(user);

        return userDetailsService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance(); //운영에서는 절대 사용하면 안되는 encoder 방식이다. 여기서는 간단한 테스트를 위해 사용하였다.
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        http.authorizeRequests()
//                .anyRequest().authenticated(); //모든 요청에 인증이 필요하다고 설정하였다.
                .anyRequest().permitAll(); //모든 요청에 인증이 필요없다고 설정하였다.
    }
}
