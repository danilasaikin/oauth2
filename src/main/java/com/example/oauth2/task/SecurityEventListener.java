package com.example.oauth2.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.authentication.event.LogoutSuccessEvent;
import org.springframework.stereotype.Component;

@Component
public class SecurityEventListener {
    private static final Logger logger = LoggerFactory.getLogger(SecurityEventListener.class);

    @EventListener
    public void onAuthenticationSuccess(AuthenticationSuccessEvent event) {
        logger.info("User {} has logged in", event.getAuthentication().getName());
    }

    @EventListener
    public void onLogoutSuccess(LogoutSuccessEvent event) {
        logger.info("User {} has logged out", event.getAuthentication().getName());
    }
}
