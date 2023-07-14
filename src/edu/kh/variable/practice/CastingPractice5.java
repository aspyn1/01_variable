package edu.kh.variable.practice;

import java.util.Scanner;

public class CastingPractice5 {
	
	public static void main(String[] args) {
		
		/*
		 * 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱
			나누기한 몫과 나머지 출력
			
			입력 예
			첫 번째 정수 : 23
			두 번째 정수 : 7
			
			더하기 결과 : 30.0
			빼기 결과 : 16.0
			곱하기 결과 : 161.0
			나누기한 몫 : 3
			나누기한 나머지 : 2
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int input1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("더하기 결과 : %.1f\n", (double) (input1 + input2));
		System.out.printf("빼기 결과 : %.1f\n", (double) (input1 - input2));
		System.out.printf("곱하기 결과 : %.1f\n", (double) (input1 * input2));
		System.out.printf("나누기한 몫 : %d\n", input1 / input2);
		System.out.printf("나누기한 나머지 : %d\n", input1 % input2);
		
	}

}
