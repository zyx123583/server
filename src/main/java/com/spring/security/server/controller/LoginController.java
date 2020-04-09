package com.spring.security.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class LoginController {

    @RequestMapping("userDetails")
    public Principal getUserDetails(Principal principal){
        return principal;
    }


}
