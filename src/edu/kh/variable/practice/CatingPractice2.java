package edu.kh.variable.practice;

import java.util.Scanner;

public class CatingPractice2 {
	
	public static void main(String[] args) {
		
		// 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
		// 문자 : A / A unicode : 65
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		
		// String input1 = sc.next(); 
		// char result = input1.charAt(0);
		// 이렇게 써도 되지만 좀 더 간단하게 쓸 수 있다.
		
		char result2 = sc.next().charAt(0);
		
		System.out.printf("%s unicode : %d", result2, (int)result2);
		
	}

}
