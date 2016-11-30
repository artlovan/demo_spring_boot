package org.javadriven.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mvc {

    @RequestMapping("/viewresolver")
    public String getIndex() {
        return "viewresolver";
    }
}
