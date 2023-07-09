package com.khadri.spring.core.qualifier;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "current")
public class CurrentAddress implements Address {

    @Override
    public String getAddress() {
        return "BANGALORE";
    }
}
