package com.example.Project2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MediaTek implements MobileProcessor{

	@Override
	public void process() {
		System.out.println("second best");
		
	}

}
