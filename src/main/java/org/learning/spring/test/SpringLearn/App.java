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
    	
        Patient patient = (Patient) context.getBean("patient");

        for (EmergencyContact contacts : patient.getEmergencyContacts()) {
			System.out.println(contacts.getPhoneNumber());
		}
        
        ((ClassPathXmlApplicationContext) context).close();
        
    }
}
