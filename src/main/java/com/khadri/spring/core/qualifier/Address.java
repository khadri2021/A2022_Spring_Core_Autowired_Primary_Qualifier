package com.khadri.spring.core.qualifier;

public interface Address {
    default  String getAddress(){
        return "Homeless";
    }
}
