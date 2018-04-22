package com.pintu.iocXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	//Coach theCoach = new BaseBallCoach();
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Coach bBCoach = context.getBean("bBCoach",Coach.class);
        System.out.println( bBCoach.getDailyWorkOut() );
        Coach trackCoach = context.getBean("trackCoach",Coach.class);
        System.out.println( trackCoach.getDailyWorkOut() );
        //Car car = new Car();
        Car car = (Car)context.getBean("car");
        System.out.println(car.toString()+ "\n##The End##");
    }
}
