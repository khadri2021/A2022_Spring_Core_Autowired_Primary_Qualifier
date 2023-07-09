package com.khadri.spring.core.primaryqualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

        Student student = context.getBean(Student.class);
        System.out.println(student.getAddress().getAddress());
    }
}
