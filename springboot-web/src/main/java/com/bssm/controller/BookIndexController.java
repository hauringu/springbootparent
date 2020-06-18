package com.bssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookIndexController {
    @RequestMapping(value = "/bookindex")
    public String bookIndex(){
        return "book_index";
    }
}
