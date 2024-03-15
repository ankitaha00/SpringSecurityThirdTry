package com.SecurityConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@Controller
@RequestMapping("/home")
public class SpringController {

    @Autowired
    private UserDetailsService userDetailsService;

//    @Autowired
//    private final AuthenticationManager authenticationManager;
//
//
//    public SpringController(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }

    @GetMapping("/")
    public String home() {
        System.out.println("This is Home Handler");
        return "index";
    }

    @GetMapping("/admin")
    public String admin() {
        System.out.println("This is Admin Home Handler");
        return "admin";
    }

    @GetMapping("/user")
    public String user() {
        System.out.println("This is User Home Handler");
        return "user";
    }

    @GetMapping("/public")
    public String publicc(){
        System.out.println("This is Public Handler");
        return "public";
    }
    @GetMapping("/success")
    public String success() {
        System.out.println("This is Success Handler");
        return "success";
    }

    @GetMapping("/login")
    public String login() {
        System.out.println("This is Login Handler");
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(AuthenticationManagerBuilder auth, @RequestParam("username") String username, @RequestParam("password") String password) throws Exception {

        System.out.println("This is Login Process Handler");
        auth.inMemoryAuthentication()
                .withUser("user").password("password").roles("USER")
                .and()
                .withUser("admin").password("password").roles("ADMIN");

        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
        return "redirect:/success";
    }

//    @PostMapping("/process_login")
//    public String processLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
//
//        System.out.println("This is Login Process Handler");
//        System.out.println("Username : " + username);
//        System.out.println("Password : " + password);
//        return "success";
//    }

//    @PostMapping("/login")
//    public String processLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(username, password));
//        return "redirect:/success";
//    }
}

