package com.example.uetshare.service;

import com.example.uetshare.entity.Account;
import com.example.uetshare.repository.AccountRepository;
import com.example.uetshare.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private AccountRepository accountRepository;

    public UserDetailsServiceImpl() {
    }

    @Autowired
    private RoleRepository roleRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = this.accountRepository.getAccountByUsername(username);
        if (account == null) {
            System.out.println("User not found! " + username);
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
        List<String> roleNames =this.roleRepository.getRoleNames(account.getUsername());
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<GrantedAuthority>();
        if (roleNames != null) {
            for (String role : roleNames) {
                // ROLE_USER, ROLE_ADMIN,..
                //Crucial
                GrantedAuthority authority = new SimpleGrantedAuthority(role);
                grantedAuthorityList.add(authority);
            }
        }
        UserDetails userDetails = new User(account.getUsername(), //
                account.getPassword(), grantedAuthorityList);

        return userDetails;
    }
}
