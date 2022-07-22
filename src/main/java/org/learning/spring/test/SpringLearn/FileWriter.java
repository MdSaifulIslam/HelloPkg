package org.learning.spring.test.SpringLearn;

public class FileWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println("In file "+ text);

	}

}
