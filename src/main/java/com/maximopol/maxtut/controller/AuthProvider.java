package com.maximopol.maxtut.controller;

import com.maximopol.maxtut.entity.Role;
import com.maximopol.maxtut.entity.User;
import com.maximopol.maxtut.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Component
public class AuthProvider implements AuthenticationProvider {
    private final Logger logger = LoggerFactory.getLogger(AuthProvider.class);
    @Autowired
    private UserService userService;
    private final PasswordEncoder passwordEncoder;

    public AuthProvider(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        logger.info("Logged in user with mail:" + username);
        User user= userService.findUserByEmail(username);

        if(user!=null &&user.getEmail().equals(username)){
            if (!passwordEncoder.matches(password, user.getPassword())) {
                logger.info(user.toString());
                logger.info(password);
                logger.info(user.getPassword());
                logger.info("This user entered the wrong password!");
                throw new BadCredentialsException("Wrong password");
            }
            Set<Role> roles= new HashSet<>();
            roles.add(new Role());

            user.setRoles( roles);


            Collection<? extends GrantedAuthority> authorities = user.getAuthorities();

            logger.info("User logged in");

            return new UsernamePasswordAuthenticationToken(user, password, authorities);
        }
        else{
            logger.info("User not found");
            throw new BadCredentialsException("Username not found");
        }

    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
