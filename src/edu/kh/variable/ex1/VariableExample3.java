package edu.kh.variable.ex1;

public class VariableExample3 {
	
	public static void main(String[] args) {
		
		/* 형변환(Casting) : 값의 자료형을 변환하는 것 (단, bloolean 제외)
		 * 
		 * 1. 형변환은 왜 필요할까?
		 * 컴퓨터는 기본적으로 같은 자료형끼리만 연산이 가능하다.
		 * 다른 자료형과 연산 시에는 오류가 발생하는데,
		 * 이런 상황을 해결하기위해서 필요한 기술이 형변환이다.
		 * 
		 * 2. 형변환에는 자동/강제 형변환이 존재한다.
		 */
		
		int num1 = 10;
		double num2 = 3.5;
		System.out.println("자동 형변환 결과 : "+ (num1 + num2));
		// 원래 에러가 발생해야 하지만, '자동 형변환' 덕분에 에러가 발생하지않는다.
		
		int i1 = 3;
		double d1 = i1;
		
		System.out.println("i1 : "+ i1); // 3
		System.out.println("d1 : "+ d1); // 3.0
		// double은 실수만 저장할 수 있는 자료형
		// 정수가 대입되는 연산이 수행되면, 실수로 자동 형변환 해준다.
		
		System.out.println(d1+num2);
		
		System.out.println("-----------------------");
				
		// int > long 형변환
		int i2 = 2_100_000_000; // 21억
		long l2 = 10_000_000_000L; //100억
		
		long result2 = i2 + l2;
		// int + long > long + long = long
		
		System.out.println("result2 : " + result2);
		
		System.out.println("-----------------------");
		/* char 자료형은 문자형이지만, 
		 * 실제 저장하는 값은
		 * 0부터 6만5천번 사이에 있는 숫자로 저장됨
		 */

		// char > int 형변환
		char ch3 = 'V';
		int i3 = ch3;
		System.out.println(i3);
		
		char ch4 = '조';
		int i4 = ch4;
		System.out.println(i4);		
		
		System.out.println("-----------------------");
		// 오버플로우 현상:
		// 컴퓨터가 미리 예측할 수 없어, 개발자가 예측해야함.
		
		int i6 = 2147483647; //int의 최대값
		int result6 = i6 + 1;
		System.out.println(result6);
		
		
		
	
	}
	
}
