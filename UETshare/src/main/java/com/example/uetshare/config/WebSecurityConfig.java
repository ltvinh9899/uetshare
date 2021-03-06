package com.example.uetshare.config;

import com.example.uetshare.service.UserDetailsServiceImpl;
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
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        return bCryptPasswordEncoder;
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//        auth.inMemoryAuthentication()
//                .withUser("admin").password("admin").roles("ADMIN")
//        .and()
//                .withUser("user").password("user").roles("USER");
//    }
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.csrf().disable();
//        /**
//         * C???p ph??p truy c???p cho c??c request t???i c??c url.
//         */
//        http.authorizeRequests()
//                .antMatchers("/", "/login", "/logout","/register","/loginPage").permitAll()
//                .antMatchers("/admin").hasRole("ADMIN")
//                .anyRequest().authenticated()
//                .and()
//                .exceptionHandling().accessDeniedPage("/403");
//        http.formLogin()
//                .loginProcessingUrl("/security_check")
//                .loginPage("/login")
//                .defaultSuccessUrl("/login-success")
//                .failureUrl("/login-failed")//
//                .usernameParameter("username")//
//                .passwordParameter("password")
//                .and()
//                .logout().logoutUrl("/logout").logoutSuccessUrl("/logoutSuccessful");
//        /**
//         * c???u h??nh remember me
//         */
//        http
//                .rememberMe().tokenRepository(this.persistentTokenRepository()) //
//                .tokenValiditySeconds(1 * 24 * 60 * 60); // 24h
//        //http.oauth2Login();
//
//    }
//
//    /**
//     * T???o bean tr??? v??? ?????i t?????ng l??u login token
//     * @return
//     */
//    @Bean
//    public PersistentTokenRepository persistentTokenRepository() {
//        /**
//         * L??u tr??? login token v??o DB d???a tr??n JDBC
//         */
////        JdbcTokenRepositoryImpl db = new JdbcTokenRepositoryImpl();
////        db.setDataSource(dataSource);
////        return db;
//        /**
//         * L??u tr??? login token v??o memory
//         */
//        InMemoryTokenRepositoryImpl memory = new InMemoryTokenRepositoryImpl();
//        return memory;
//    }
    /**
     *
     */
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

        // S??t ?????t d???ch v??? ????? t??m ki???m User trong Database.
        // V?? s??t ?????t PasswordEncoder.
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();

        // C??c trang kh??ng y??u c???u login
        http.authorizeRequests().antMatchers("/","welcome", "/login", "/logout").permitAll();

        // Trang /userInfo y??u c???u ph???i login v???i vai tr?? ROLE_USER ho???c ROLE_ADMIN.
        // N???u ch??a login, n?? s??? redirect t???i trang /login.
        http.authorizeRequests().antMatchers("/user").access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')");

        // Trang ch??? d??nh cho ADMIN
        http.authorizeRequests().antMatchers("/admin").access("hasRole('ROLE_ADMIN')");

        // Khi ng?????i d??ng ???? login, v???i vai tr?? XX.
        // Nh??ng truy c???p v??o trang y??u c???u vai tr?? YY,
        // Ngo???i l??? AccessDeniedException s??? n??m ra.
        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

        // C???u h??nh cho Login Form.
        http.authorizeRequests().and().formLogin()//
                // Submit URL c???a trang login
                .loginProcessingUrl("/security") // Submit URL
                .loginPage("/login")//
                .defaultSuccessUrl("/login-success")//
                .failureUrl("/login-failed")//
                .usernameParameter("username")//
                .passwordParameter("password")
                // C???u h??nh cho Logout Page.
                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/logout-success");

        // C???u h??nh Remember Me.
        http.authorizeRequests().and() //
                .rememberMe().tokenRepository(this.persistentTokenRepository()) //
                .tokenValiditySeconds(1 * 24 * 60 * 60); // 24h

    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl db = new JdbcTokenRepositoryImpl();
        db.setDataSource(dataSource);
        return db;
    }
}