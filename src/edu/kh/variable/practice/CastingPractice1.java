package edu.kh.variable.practice;

public class CastingPractice1 {
	
	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		//-----------------------------------------------//
		System.out.println(iNum1 / iNum2); // 2
		
		int iNum3 = (int) dNum;
		System.out.println(iNum3); // 2
		
		System.out.println(iNum2 * dNum); // 10.0
		
		double dNum1 = (double) iNum1;
		System.out.println(dNum1); // 10.0
		
		double dNum2 = (double) iNum1;
		double dNum3 = (double) iNum2;
		System.out.println(dNum2 / dNum3); // 2.5
		
		System.out.println(dNum); // 2.5
		
		int iNum4 = (int) fNum;
		System.out.println(iNum4); // 3
		System.out.println(iNum1 / iNum4); // 3
		
		float fNum1 = (float) iNum1;
		System.out.println(fNum1 / fNum);// 3.3333333
		
		double dNum4 = (double) iNum1;
		System.out.println(dNum4 / fNum); // 3.3333333333333335
		//double형은 뒤가 5로 끝나는 이유?
		// 컴퓨터는 숫자를 2진수로 표현하는데
		// 3.3333....이런 실수도 11.0101011101100.... 이런식으로
		// 2진수로 실수를 표현하면 무한히 반복되는 경우가 많다.
		// 따라서 일정한 크기만큼 계산하고 적당한 위치에서 잘라내어 반올림하는데
		// 2진수 -> 10진수로 변환했을 때
		// float은 7~8자리까지 자르고, double은 15~16자리까지 자름
		// 자르는 위치가 다라 숫자가 다르게 나올 수 있음
		// -> 2진수로 소수점 이하를 정확하게 표현하지 못하는 경우가 많아서
		// 근사치가 출력되게 된다. 
		
		System.out.println(ch); // 'A'
		System.out.println( (int)ch ); // 65
		
		System.out.println( (int)ch + iNum1 ); // 75
		
  		char ch1 = 'K';
		System.out.println( (int)ch1 ); // 75

		System.out.println( (char) ((int)(ch+iNum1)) ); // 'K'
		// ch 와 iNum1 더하기 > int로 자동 형변환됨
		// int로 변환된 숫자를 다시 char로 강제형변환 해줌
		
	}
	
}