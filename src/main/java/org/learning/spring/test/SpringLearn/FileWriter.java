package org.learning.spring.test.SpringLearn;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fileWriter")
public class FileWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println("In file "+ text);

	}

}
