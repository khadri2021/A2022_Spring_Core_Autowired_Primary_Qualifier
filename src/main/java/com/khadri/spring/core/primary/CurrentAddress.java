package com.khadri.spring.core.primary;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CurrentAddress implements  Address{

    @Override
    public String getAddress() {
        return "BANGALORE";
    }
}
