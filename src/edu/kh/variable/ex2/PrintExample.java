package edu.kh.variable.ex2;

public class PrintExample {
	
	// main작성 ctrl + space + enter 누르면 자동 완성
	public static void main(String[] args) {
		
		//System.out.print() : 단순 출력 (출력 후 줄바꿈 x)
		//System.out.println() : 한 줄 출력 (출력 후 줄바꿈 수행)
		//줄바꿈이라는 차이점은 있지만 괄호안의 내용이 그대로 나온다는 것은 같음
		
		System.out.println("테스트1");
		System.out.println("테스트2");
		//syso작성 ctrl + space 누르면 자동 완성
		
		System.out.print("테스트3");
		System.out.println(); //내용없는 println은 단순 줄바꿈이다
		System.out.print("테스트4");
		
		// System.out.printf() : 출력될 문자열 형식을 패턴으로 지정하는 출력 구문
		
		System.out.println();
		
		int iNum1 = 10;
		int iNum2 = 5;
		
		// 10 + 5 = 15로 출력하고싶음
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1+iNum2));
		// println 사용 시 복잡하고 귀찮음
		
		/* printf
		 * 
		 * %d : 정수형, %0 : 8진수, %x : 16진수
		 * %c : 문자, %s : 문자열
		 * %f : 실수(소수점 아래 6자리), %e : 지수형태 표현, %g : 대입값그대로
		 * %A : 16진수 실수
		 * %b : 논리형
		 */
		
		// System.out.printf("패턴", 패턴에 들어갈 값);
 		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1+iNum2);
 		System.out.printf("%d + %d = %d\n", 10,5,15);
 		// 줄바꿈하려면 \n 붙여줘야한다.
 		
 		// 10 + 10 * 5 / 2 = 35
 		System.out.printf("%d + %d * %d / 2 = %d\n", iNum1, iNum1, iNum2, 2, iNum1+iNum1*iNum2/2);
	
		// 패턴연습
 		int iNum3 = 3;
 		System.out.printf("%d\n", iNum3);
 		System.out.printf("%5d\n", iNum3); //5칸 공간 확보 후 오른쪽 정렬
 		System.out.printf("%-5d\n", iNum3); //5칸 공간 확보 후 왼쪽 정렬
 		
 		// 소수점 자리 제어
		System.out.printf("%f\n", 10 / 4.0); // 2.500000
		System.out.printf("%.2f\n", 10 / 4.0); // 2.50
		System.out.printf("%.0f\n", 10 / 4.0); // 3 > 반올림 됨
 		
		
		// 문자, 문자열, bloolean
		boolean isTrue = false;
		char ch = '조';
		String str = "안녕하세요"; // 참조형

		// false / 조 / 안녕하세요 출력하기
		System.out.printf("%b / %c / %s\n", isTrue, ch, str);
				
 		
		// escape(탈출) 문자 : 일반문자가아닌 특수문자 표현

		// \ 하나만 출력이 불가해서 두개를 넣으면 하나가 출력됨
		System.out.println("\\"); // \ 으로 출력됨
		System.out.println("\\0/"); // \0/ 으로 출력됨
		
		System.out.println("a\tb\tc\td\t"); // tab 사용 : \t
		
		// 유니코드 escape
		System.out.println("\u0041"); // A
		// 유니코드(16진수)
		// A는 65이고, 65를 16진수로 표현하면
		// 65/16 : 몫 4, 나머지 1이라 0041로 표현
 		
	}
	
}
