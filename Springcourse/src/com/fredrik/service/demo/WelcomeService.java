package com.fredrik.service.demo;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService {

	
	public List<String> getWelcomeMessage(String name){
		List<String> mywelcomeMessage = new ArrayList<String>();
		//Add data to List
		
		mywelcomeMessage.add("HEllo ");
		mywelcomeMessage.add(name);
		mywelcomeMessage.add(", welcome to this course");
		return mywelcomeMessage;
	}
}
