package edu.kh.variable.practice;

import java.util.Scanner;

public class CatingPractice3 {
	
	public static void main(String[] args) {
		
		/*
		 * 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
			이 때 총점과 평균은 정수형으로 처리하세요.
		 * 국어 : 90.0
			영어 : 90.0
			수학 : 90.0
			
			총점 : 270
			평균 : 90
		 */
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double input1 = sc.nextDouble();
		
		System.out.print("영어 : ");
		double input2 = sc.nextDouble();
		
		System.out.print("수학 : ");
		double input3 = sc.nextDouble();
		
		System.out.printf("총점 : %d\n", (int)(input1 + input2 + input3));
		System.out.printf("평균 : %d\n", (int)(input1 + input2 + input3)/3);
	}

}
