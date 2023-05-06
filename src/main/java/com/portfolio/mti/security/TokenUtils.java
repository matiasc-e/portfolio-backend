package com.portfolio.mti.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class TokenUtils {

    private static String secretKey;
    private static final long EXPIRE_DURATION = 3600 * 1000;

    @Value("${app.jwt.secret}")
    public void setSecretKey(String secretKey) {
        TokenUtils.secretKey = secretKey;
    }

    public static String createToken(String name, String email) {
        Date expirationDate = new Date(System.currentTimeMillis() + EXPIRE_DURATION);

        Map<String, Object> extra = new HashMap<>();

        extra.put("name", name);

        return Jwts.builder()
                .setSubject(email)
                .setExpiration(expirationDate)
                .addClaims(extra)
                .signWith(SignatureAlgorithm.HS256, secretKey.getBytes())
                .compact();
    }

    public static UsernamePasswordAuthenticationToken getAuthentication (String token) {
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(secretKey.getBytes())
                    .parseClaimsJws(token)
                    .getBody();

            String email = claims.getSubject();
            return new UsernamePasswordAuthenticationToken(email, null, Collections.emptyList());
        } catch (JwtException e) {
            return null;
        }
    }

}
