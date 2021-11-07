package com.example.uetshare.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private DataSource dataSource;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);

    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();
        /**
         * Cấp phép truy cập cho các request tới các url.
         */
        http.authorizeRequests()
                .antMatchers("/", "/login", "/logout","/webjars/**","/register").permitAll()
                .antMatchers("/userInfo").hasAnyRole("USER", "ADMIN")
                .antMatchers("/admin").hasRole("ADMIN")
                .and()
                .exceptionHandling().accessDeniedPage("/403");
        http.formLogin()
                .loginProcessingUrl("/security_check")
                .loginPage("/login")
                .defaultSuccessUrl("/")
                .failureUrl("/")//
                .usernameParameter("username")//
                .passwordParameter("password")
                .and()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/logoutSuccessful");
        /**
         * cấu hình remember me
         */
        http
                .rememberMe().tokenRepository(this.persistentTokenRepository()) //
                .tokenValiditySeconds(1 * 24 * 60 * 60); // 24h
        //http.oauth2Login();

    }

    /**
     * Tạo bean trả về đối tượng lưu login token
     * @return
     */
    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        /**
         * Lưu trữ login token vào DB dựa trên JDBC
         */
//        JdbcTokenRepositoryImpl db = new JdbcTokenRepositoryImpl();
//        db.setDataSource(dataSource);
//        return db;
        /**
         * Lưu trữ login token vào memory
         */
        InMemoryTokenRepositoryImpl memory = new InMemoryTokenRepositoryImpl();
        return memory;
    }
}