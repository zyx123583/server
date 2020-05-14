package com.spring.security.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(value = "user")
public class UserAction {

    @GetMapping(value = "me")
    public Principal me(Principal principal) {
        return principal;
    }


}
