package edu.kh.variable.ex2;

// import : 다른 패키지에 존재하는 클래스를 얻어오는 구문
import java.util.Scanner; 
//java.util 패키지에서 Scanner 설계도를 가져온 것

public class ScannerExample {
	
	public static void main(String[] args) {
		
		// Scanner : 프로그램 실행 중 키보드입력을 받을 수 있게하는 역할
		// Scanner 생성 > 프로그램 안에 스캐너라는 기계를 만드는 것과 같음
		
		Scanner sc = new Scanner(System.in);
		// 오류 원인 > 만들고싶은데 설계도(class)가 없어서 못만들수있음
		// > import 구문 작성 시 오류 해결 가능
		
		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt(); 
		// netxInt(); 키보드로 입력된 정수를 읽어오는 문구
		// 콜솔창에 직접 입력하는 정수를 input1 변수에 대입하여 저장해둠
		
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();
		// 여기까지 코딩해서 실행해보면 정수 1 입력 : 만 나옴
		// 정수를 콜솔창에 입력해줘야 정수 2 입력 : 이 나올 수 있음
	
		System.out.printf("%d + %d = %d\n", input1, input2, input1+input2);
		
	}
	
	
}
