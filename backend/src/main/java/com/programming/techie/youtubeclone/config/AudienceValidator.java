package com.programming.techie.youtubeclone.config;

import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.core.OAuth2TokenValidator;
import org.springframework.security.oauth2.core.OAuth2TokenValidatorResult;
import org.springframework.security.oauth2.jwt.Jwt;

public class AudienceValidator implements OAuth2TokenValidator<Jwt> {

    private final String audience;

    public AudienceValidator(String audience) {
        this.audience = audience;
    }

    @Override
    public OAuth2TokenValidatorResult validate(Jwt jwt) {
        System.out.println("vao day ko");
        System.out.println(jwt.getAudience());
        if (jwt.getAudience().contains(audience)) {
            System.out.println("vao day");
            return OAuth2TokenValidatorResult.success();
        }
        System.out.println("loi roi");
        return OAuth2TokenValidatorResult.failure(new OAuth2Error("invalid audience for the given token"));
    }
}
