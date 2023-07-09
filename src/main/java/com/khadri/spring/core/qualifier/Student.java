package com.khadri.spring.core.qualifier;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {


    @Autowired
    @Qualifier("current")
    private Address address;

    public Student(){
        System.out.println("zero-arg student constructor");
    }

    public Student(Address address){
        this.address=address;
        System.out.println("constructor injection");
    }

    public void setAddress(Address address) {
        this.address = address;
        System.out.println("setter injection");
    }

    public Address getAddress() {
        return address;
    }
}
