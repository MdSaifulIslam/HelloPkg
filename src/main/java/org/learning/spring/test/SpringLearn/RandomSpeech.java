package org.learning.spring.test.SpringLearn;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomSpeech {
	private static String[] texts = {
			"I am jamal",
			"I am kamal",
			"Get out",
			"You are good"
	};
	
	public String getText() {
		Random ran = new Random();
		return texts[ran.nextInt(texts.length)];
	}

}
