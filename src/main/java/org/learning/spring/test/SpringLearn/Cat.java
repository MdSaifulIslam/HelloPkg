package org.learning.spring.test.SpringLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {
	
	private int id = 0;
	private String speech = "Cats's speech";
	
//	@Autowired
	public void setId(@Value("12345") int id) {
		this.id = id;
	}
	
	@Autowired
	public void setSpeak(@Value("maow") String speech) {
		this.speech = speech;
	}
	
	public void speak() {
		System.out.println(id + " : " + speech);
	}

}
