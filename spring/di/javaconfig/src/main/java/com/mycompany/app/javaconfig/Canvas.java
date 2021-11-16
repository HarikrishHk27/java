package com.mycompany.app.javaconfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Canvas {

    private IShape shape;

    @Autowired
    public void setShape(IShape shape){
        this.shape = shape;
    }

    @PostConstruct
    public void afterInit(){
        System.out.println("inside Canvas's after init , shape area="+shape.area());
    }

    public void drawArea(){
       double area= shape.area();
        System.out.println("drawn area="+area);
    }


}
