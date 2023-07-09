package com.khadri.spring.core.primary;

public interface Address {
    default  String getAddress(){
        return "Homeless";
    }
}
