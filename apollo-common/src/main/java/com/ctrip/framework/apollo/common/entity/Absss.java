package com.ctrip.framework.apollo.common.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public  class Absss {

    public ArrayList getArryObj(){
        return new ArrayList<>();
    }

    @Autowired
    public ArrayList arr;


}
