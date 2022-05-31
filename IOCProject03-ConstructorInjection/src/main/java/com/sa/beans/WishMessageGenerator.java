package com.sa.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;
	
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator-1-Param COnstructor");
		this.date=date;
	}
	
	public String generateWishMessage(String name) {
		
		int hour = date.getHours();
		if(hour < 12)
			return "Good Morning :: "+name;
		else if(hour < 16)
			return "Good Afternoon :: "+name;
		else if(hour < 20)
			return "Good Evening :: "+name;
		else
			return "Good night :: "+name;
		
	}

}
