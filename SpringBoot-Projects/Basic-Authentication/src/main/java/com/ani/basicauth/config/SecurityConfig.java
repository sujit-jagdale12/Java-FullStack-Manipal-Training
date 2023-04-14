package com.ani.basicauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
// @EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/user/**").hasAnyRole("ADMIN", "USER")
                .anyRequest().authenticated()
                .and()
                .httpBasic();
        // .authenticationEntryPoint(authenticationEntryPoint);
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        UserDetails user1 = User
                .withUsername("user")
                .password(encoder.encode("123"))
                .roles("USER_ROLE")
                .build();
        
        UserDetails user2 = User
                .withUsername("admin")
                .password(encoder.encode("456"))
                .roles("ADMIN_ROLE")
                .build();
        UserDetails user3 = User
                .withUsername("sujit")
                .password(encoder.encode("12345"))
                .roles("ADMIN_ROLE")
                .build();

        return new InMemoryUserDetailsManager(user1, user2,user3);
    }
}
