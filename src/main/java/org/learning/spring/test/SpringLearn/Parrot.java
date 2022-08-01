package org.learning.spring.test.SpringLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
	
	private int id;
	private String name;
	
	@Autowired
	public void setId( @Value("#{randomSpeech.getText()?.length()}") int  id) {
		this.id = id;
	}
	@Autowired
	public void setName (@Value("#{randomSpeech.getText() + new java.util.Date().toString() + (T(Math).sin(5) lt 2 ? 'big' : 'small') }") String name) {
		this.name = name;
	}
	public void speek() {
		System.out.println(id + ": " + name);
	}

}
