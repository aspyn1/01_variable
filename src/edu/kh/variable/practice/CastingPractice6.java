package edu.kh.variable.practice;

import java.util.Scanner;

public class CastingPractice6 {

	public static void main(String[] args) {
		
		/*
		 * 키보드로 가로, 세로 값을 실수형으로 입력받아
	        사각형의 면적과 둘레를 계산하여 출력
			계산공식 - 
			면적 : 가로 * 세로
	        둘레 : (가로 + 세로) * 2
			
			가로 : 13.5
			세로 : 41.7
	
			면적 : 562.95
			둘레 : 110.4
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		float input1 = sc.nextFloat();
		
		System.out.print("세로 : ");
		float input2 = sc.nextFloat();
	
		System.out.println("면적 : " + (input1 * input2));
		System.out.println("둘레 : " + ((input1 + input2)*2));
		
		System.out.printf("면적 : %.2f\n", input1 * input2);
		System.out.printf("둘레 : %.1f", (input1 + input2)*2);
		
	}
	
}
