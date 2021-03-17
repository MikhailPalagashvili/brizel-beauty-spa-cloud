package com.csgrant.brizelbeautyspacloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

    @GetMapping
    public String makeAnAppointment() {
        return "appointment";
    }
}
