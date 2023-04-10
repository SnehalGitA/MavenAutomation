package com.testMethods;

public class CheckHomePage extends ValidateUI{
	
	
	
	public static void GetTitle() {
		
		ValidateUI v = new ValidateUI();
		
		String s = v.driver.getTitle();		
		
		System.out.println(s);
	}
	
	
	
	

}
