package org.learning.spring.test.SpringLearn;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"org/learning/spring/test/SpringLearn/beans/beans.xml");

		NoticesDAO noticesDao = (NoticesDAO) context.getBean("noticesDao");

		try {
			List<Notic> notices = noticesDao.getNotices();

			for (Notic notic : notices) {
				System.out.println(notic);
			}
			
			System.out.println(noticesDao.getNotice(2));

		} catch (DataAccessException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}

		((ClassPathXmlApplicationContext) context).close();

	}
}
