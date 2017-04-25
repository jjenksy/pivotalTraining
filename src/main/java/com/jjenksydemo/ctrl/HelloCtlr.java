package com.jjenksydemo.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jenksy on 4/24/17.
 * Controller for testing the various spring boot
 * features in depth
 */

@RestController()
public class HelloCtlr {

    @Autowired
    PersonProperties personProperties;//person calls for getting the person configurations

    @Value("${custom.message}")
    private String message;

    @RequestMapping("/getHello")
    public HttpEntity<String> getHello(){
        return new ResponseEntity<String>("Hello to you,  "+message + "Person greeting "+ personProperties.getGreeting()+" and person" +
                "farewell " + personProperties.getFarewell(), HttpStatus.OK);
    }
}
