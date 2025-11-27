package com.ust.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.demo.bean.Car;
import com.ust.demo.bean.Sony;
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
    	Car car= (Car) ctx.getBean("car");
//    	Sony sony=ctx.getBean(Sony.class);
//    	car.setAudio(sony);
    	
    	car.playMusic();
    }
}
