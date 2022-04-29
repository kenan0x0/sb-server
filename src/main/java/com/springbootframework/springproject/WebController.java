package com.springbootframework.springproject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @RequestMapping("/")
    public String landing_page(){
        return "landingpage";
    }
}
