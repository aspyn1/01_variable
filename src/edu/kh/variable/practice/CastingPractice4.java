package edu.kh.variable.practice;

public class CastingPractice4 {
	
	public static void main(String[] args) {
		
		int i = 1;
		short s = 2;
		boolean b = true;
		char c = 'C';
		
		// int result1 = i + b; boolean 은 int로 연산될 수 없다
		int result2 = s + c;
		
		System.out.println(s + c);
				
	}
	

}
