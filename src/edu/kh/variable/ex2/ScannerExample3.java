package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문자열(String) 입력
		// 문자열을 3번 입력받아 한줄로 출력하기
		
		// ex)_
		// 입력1 : 안녕?
		// 입력2 : 반가워!
		// 입력3 : 점심뭐먹을래?
		// 출력 : 안녕? 반가워! 점심뭐먹을래?
	
		System.out.print("입력 1 : ");
		String input1 = sc.next();
		
		System.out.print("입력2 : ");
		String input2 = sc.next();		
		
		System.out.print("입력3 : ");
		String input3 = sc.next();
		
		System.out.printf("%s %s %s\n", input1, input2, input3);
		
		// 숫자써도 가능, 입력한 숫자는 문자열로 인식하기 때문
		
	}
	
}
