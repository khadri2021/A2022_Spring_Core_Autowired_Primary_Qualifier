package com.khadri.spring.core.primaryqualifier;

public interface Address {
    default  String getAddress(){
        return "Homeless";
    }
}
