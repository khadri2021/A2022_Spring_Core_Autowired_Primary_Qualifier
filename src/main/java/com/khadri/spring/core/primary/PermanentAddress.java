package com.khadri.spring.core.primary;


import org.springframework.stereotype.Component;

@Component
public class PermanentAddress implements  Address{

    @Override
    public String getAddress() {
        return "KADIRI";
    }
}
