package com.khadri.spring.core.primaryqualifier;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PermanentAddress implements Address {

    @Override
    public String getAddress() {
        return "KADIRI";
    }
}
