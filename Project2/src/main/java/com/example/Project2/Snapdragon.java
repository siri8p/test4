package com.example.Project2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Snapdragon implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("world best cpu");
		
	}

}
