package cn.enjoy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping(name = "/image")
@RestController
public class imageController {
    @RequestMapping("/hello")
    public String compress()
    {
        int i = 0;
        return "hello";
    }
}
