package org.learning.spring.test.SpringLearn;

public class ConsoleWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println("IN console " + text);

	}

}
