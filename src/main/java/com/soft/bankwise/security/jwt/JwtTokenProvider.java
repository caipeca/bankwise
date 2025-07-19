package com.soft.bankwise.security.jwt;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.*;


@Component
public class JwtTokenProvider {

    @Value("${security.jwt.secret}")
    private String secretKeyPlain;

    @Value("security.jwt.expiration")
    private long expirationInMilliseconds;

    private Key key;

    @PostConstruct
    public void init(){
        this.key = Keys.hmacShaKeyFor(secretKeyPlain.getBytes());
    }

    public String generateToken(UserDetails userDetails) {
        Date now = new Date();
        Date expirationDate = new Date(now.getTime() + expirationInMilliseconds);

        return Jwts.builder()
                .setSubject(userDetails.getUsername())
                .setIssuedAt(now)
                .setExpiration(expirationDate)
                .signWith(key,SignatureAlgorithm.HS256)
                .compact();
    }
    public String getUsernameFromToken(String token) {
        return parseClaims(token).getBody().getSubject();
    }
    public boolean validateToken(String token) {
        try {
            parseClaims(token);
            return true;
        } catch (ExpiredJwtException ex) {
            System.out.println("Token expirado");
        } catch (UnsupportedJwtException ex) {
            System.out.println("Token não suportado");
        } catch (MalformedJwtException ex) {
            System.out.println("Token mal formado");
        } catch (SignatureException ex) {
            System.out.println("Assinatura inválida");
        } catch (IllegalArgumentException ex) {
            System.out.println("Token vazio");
        }
        return false;
    }

    private Jws<Claims> parseClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build().parseClaimsJws(token);
    }
}
