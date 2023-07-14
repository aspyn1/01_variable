package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 사칙 연산 계산기 만들기
		// > 두 실수를 입력받아 사칙연산 결과를 모두 출력
		// > 단, 출력된 결과값은 소수점 이하 2째자리(%2f/n)까지만
		// sc.nextDouble(); : 입력받은 다음 실수를 읽어옴.
		
		// 실수 1 입력 : 1.5
		// 실수 2 입력 : 2.7
		// 1.50 + 2.70 = 4.20
		// 1.50 - 2.70 = -1.20
		// 1.50 * 2.70 = 4.05
		// 1.50 / 2.70 = 0.56
		
		System.out.print("실수 1 입력 : ");
		double input1 = sc.nextDouble();
		
		System.out.print("실수 2 입력 : ");
		double input2 = sc.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f\n", input1, input2, input1+input2);
		System.out.printf("%.2f - %.2f = %.2f\n", input1, input2, input1-input2);
		System.out.printf("%.2f * %.2f = %.2f\n", input1, input2, input1*input2);
		System.out.printf("%.2f / %.2f = %.2f\n", input1, input2, input1/input2);
		
		
		
		
		
		
	}

}
