package org.learning.spring.test.testproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("org/learning/spring/test/testproject/beans/beans.xml");
    	
        Patient patient = (Patient) context.getBean("patient");
        System.out.println(patient);
        
        ((ClassPathXmlApplicationContext) context).close();
        
    }
}
