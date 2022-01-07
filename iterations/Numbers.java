package com.qa.iteration;

public class Numbers {

	public static boolean play = true;
	
	public void myValue(int num1) {
		do {
			int val1 = num1/10 + num1%10;
	
			if ((num1 >= 10) && (num1 <= 99)) {
				System.out.println(val1);
				play = true;
			} else {
				System.out.println("Invalid number");
			}
		
			
		} while(!play);
		
		
		
	}
	
}
