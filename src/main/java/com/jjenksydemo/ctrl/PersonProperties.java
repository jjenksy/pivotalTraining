package com.jjenksydemo.ctrl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by jenksy on 4/25/17.
 *@PersonProperties is the class for interfacing with the person data in the application properties file.
 */
@Component
@ConfigurationProperties(prefix = "person")
public class PersonProperties {

    private String greeting;
    private String farewell;

    public PersonProperties() {
    }

    public String getFarewell() {
        return farewell;
    }

    public void setFarewell(String farewell) {
        this.farewell = farewell;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
