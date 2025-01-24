package com.example.springBootProjectt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    private Autowiring auto;

    public  void build(){

        auto.linking();
        System.out.println(" ClassName = Dev && MethodName = build working fine ");
    }
}
