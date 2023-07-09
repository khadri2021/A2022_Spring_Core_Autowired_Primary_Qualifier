package com.khadri.spring.core.qualifier;


import org.springframework.stereotype.Component;

@Component(value = "permanent")
public class PermanentAddress implements Address {

    @Override
    public String getAddress() {
        return "KADIRI";
    }
}
