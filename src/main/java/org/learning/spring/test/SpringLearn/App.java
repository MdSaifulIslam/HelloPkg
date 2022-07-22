package org.learning.spring.test.SpringLearn;

import java.util.Iterator;

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
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("org/learning/spring/test/SpringLearn/beans/beans.xml");
    	
        ContactBook contacts = (ContactBook) context.getBean("contactbook");
        
        System.out.println(contacts);

        ((ClassPathXmlApplicationContext) context).close();
        
    }
}
