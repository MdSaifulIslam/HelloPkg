package org.learning.spring.test.SpringLearn;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println("IN console " + text);

	}

}
