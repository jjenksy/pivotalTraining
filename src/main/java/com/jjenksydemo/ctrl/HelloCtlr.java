package com.jjenksydemo.ctrl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jenksy on 4/24/17.
 */

@RestController()
public class HelloCtlr {


    @RequestMapping("/getHello")
    public HttpEntity<String> getHello(){
        return new ResponseEntity<String>("Hello to you sir", HttpStatus.OK);
    }
}
