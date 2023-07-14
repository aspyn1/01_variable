package edu.kh.variable.practice;

import java.util.Scanner;

public class CastingPractice7 {
	
	public static void main(String[] args) {
		
		/*
		 * 영어 문자열 값을 키보드로 입력받아
			각 자리의 문자를 출력

			문자열을 입력하시오 : apple

			첫번째 문자 : a
			두번째 문자 : p
			세번째 문자 : p
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 : \n");
		
		
		String st1 = sc.next();
		System.out.println("첫번째 문자 : " + st1.charAt(0));
		System.out.println("두번째 문자 : " + st1.charAt(1));
		System.out.println("두번째 문자 : " + st1.charAt(2));
		
		
		char input1 = sc.nextLine().charAt(0);
		System.out.println((char)input1);

		char input2 = sc.nextLine().charAt(1);
		System.out.println((char)input2);
		
		char input3 = sc.nextLine().charAt(2);
		System.out.println((char)input3);
	
	}

}
