package com.jjenksydemo.domain;

/**
 * Created by jenksy on 5/1/17.
 * This class represents a domain concept
 * for our application. to show advertising slogans on the main page.
 */
public class Marketing {
    private String header;
    private String description;

    public Marketing(String header, String description) {
        this.header = header;
        this.description = description;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
