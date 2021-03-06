package com.rivis.feng.website.common.config;

import com.rivis.feng.website.common.encoder.SystemPasswrodEncoder;
import com.rivis.feng.website.common.handle.AuthenctiationFailureHandle;
import com.rivis.feng.website.common.handle.AuthenctiationSuccessHandle;
import com.rivis.feng.website.common.provider.SystemAuthenticationProvider;
import com.rivis.feng.website.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthenctiationSuccessHandle authenctiationSuccessHandle;

    @Autowired
    private AuthenctiationFailureHandle authenctiationFailureHandle;

    @Bean
    UserDetailsService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new SystemPasswrodEncoder();
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        return new SystemAuthenticationProvider();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService())
                .passwordEncoder(passwordEncoder());
    }

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                /*.authorizeRequests()
                .antMatchers("/index", "/signUp", "loginIn").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")
                .anyRequest().authenticated()
                .and()*/
                .formLogin().loginPage("/website/user/loginIn")
                .successHandler(authenctiationSuccessHandle)
                .failureHandler(authenctiationFailureHandle)
                .and().authorizeRequests()
                .antMatchers("/loginIn").permitAll() // 登录请求路径不进行过滤
                .anyRequest()
                .authenticated()
                .and().csrf().disable(); // 取消跨站请求伪造防护
                /*.defaultSuccessUrl("/index")
                .failureUrl("/login?error")
                .permitAll()
                .and()
                .rememberMe().tokenValiditySeconds(60 * 60 * 24 * 7).key("signKey")
                .and()
                .logout()
                .logoutUrl("/website/user/loginOut")
                .logoutSuccessUrl("/index")
                .permitAll();*/
        /*httpSecurity.formLogin()                    //  定义当需要用户登录时候，转到的登录页面。
                .and()
                .authorizeRequests()        // 定义哪些URL需要被保护、哪些不需要被保护
                .anyRequest()               // 任何请求,登录后可以访问
                .authenticated();*/

    }

    /*@Override
    public void configure(WebSecurity webSecurity) throws Exception {
        super.configure(webSecurity);
    }*/
}
