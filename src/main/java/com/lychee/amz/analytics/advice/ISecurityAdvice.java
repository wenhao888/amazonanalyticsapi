package com.lychee.amz.analytics.advice;

import com.lychee.amz.analytics.features.auth.model.AuthUser;
import org.springframework.security.core.Authentication;


public interface ISecurityAdvice {
    Authentication getAuthentication();
    AuthUser getPrinciple();
}


