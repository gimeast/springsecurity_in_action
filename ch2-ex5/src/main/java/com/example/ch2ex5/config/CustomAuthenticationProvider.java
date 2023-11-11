package com.example.ch2ex5.config;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        //인증 논리를 추가할 위치
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        //Authentication 형식의 구현을 추가할 위치
        return false;
    }
}
