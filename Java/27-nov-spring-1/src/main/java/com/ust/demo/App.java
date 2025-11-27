package com.ust.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle v1 = ctx.getBean(Vehicle.class);
    	Vehicle v2 = ctx.getBean(Vehicle.class);
    	
    	v1.setId(1);
    	v1.setName("Train");
    	v1.setColor("Red");
    	System.out.println(v2);
    	System.out.println(v1);
    	
    	
        System.out.println( "Hello World!" );
    }
}
