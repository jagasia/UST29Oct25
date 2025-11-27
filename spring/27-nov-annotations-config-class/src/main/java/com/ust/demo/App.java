package com.ust.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.demo.bean.Vehicle;
import com.ust.demo.config.MyConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
//        ctx.scan("com");
//        ctx.refresh();
        
        Vehicle v = ctx.getBean(Vehicle.class);
        v.setColor("Blue");
        System.out.println(v);
    }
}
