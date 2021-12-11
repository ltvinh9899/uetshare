package com.example.uetshare.security;

import com.example.uetshare.entity.Account;
import com.example.uetshare.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Primary()
@Log4j2
public class MyUserDetails implements UserDetailsService {
    @Autowired
    private  AccountRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final Account appUser = userRepository.getAccountByUsername(username);

        if (appUser == null) {
            throw new UsernameNotFoundException("User '" + username + "' not found");
        }
        for(GrantedAuthority i :appUser.getAuthorities()){
            log.info(i.getAuthority());
        }
        log.info(appUser.getAccountRole().size());
        return org.springframework.security.core.userdetails.User//
                .withUsername(username)//
                .password(appUser.getPassword())//
                .authorities(appUser.getAuthorities())//
                .accountExpired(false)//
                .accountLocked(false)//
                .credentialsExpired(false)//
                .disabled(false)//
                .build();
    }

}