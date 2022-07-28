package org.learning.spring.test.SpringLearn;

import org.springframework.stereotype.Component;

@Component
public interface LogWriter {
	public void write(String text);
}
