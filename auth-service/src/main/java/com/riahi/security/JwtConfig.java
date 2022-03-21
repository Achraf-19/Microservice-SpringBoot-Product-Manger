package com.riahi.security;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

/**
 * @authored by Jalel Eddine on 29 nov. 2018 
 * 
 */

@Data
public class JwtConfig {

		@Value("${security.jwt.uri:/auth/**}")
	    private String Uri;

	    @Value("${security.jwt.header:Authorization}")
	    private String header;

	    @Value("${security.jwt.prefix:Bearer }")
	    private String prefix;

	    @Value("${security.jwt.expiration:#{24*60*60}}")
	    private int expiration;

	    @Value("${security.jwt.secret:JllJDSecretKey}")
	    private String secret;
}
