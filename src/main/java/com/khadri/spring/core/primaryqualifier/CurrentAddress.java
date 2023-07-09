package com.khadri.spring.core.primaryqualifier;


import org.springframework.stereotype.Component;


@Component
public class CurrentAddress implements Address {

    @Override
    public String getAddress() {
        return "BANGALORE";
    }
}
