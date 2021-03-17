package com.csgrant.brizelbeautyspacloud.controller;

import lombok.extern.slf4j.Slf4j;
import model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/create-account")
    public String makeAnAccount(final Model model) {
        return "create-account";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping
    public String getAccount() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(final Account account) {
        log.info("Processing account login: " + account);
        return "redirect:/account";
    }
}
