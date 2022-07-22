package org.learning.spring.test.SpringLearn;

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
    	
        Logger logger = (Logger) context.getBean("logger");
        
        logger.writeConsole("console write");
        logger.writeFile("File write");

        ((ClassPathXmlApplicationContext) context).close();
        
    }
}
