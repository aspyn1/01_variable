package edu.kh.variable.ex1;

public class VariableExample2 {
	
	public static void main(String[] args) {
		
		/* Java 기본 자료형 8가지
		 * 논리형 : bloolean(1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : char(2byte, 유니코드)
		 */

		// 변수 선언 : 메모리에 값을 저장할 공간을 할당하는 것 (int iNum;)
		// 변수 값 대입 : 변수에 값을 넣는 것 (iNum = 3;)
		// (int iNum = 3;) : 선언과 동시에 값 대입할 수도 있다
		
		// 카멜(낙타)표기법
		// 변수 작성 시 연결되는 두 단어 중 후속단어의 첫 문자를 대문자로 표기한다
		
		boolean booleanData; // 변수 선언
		// 메모리에 논리 값(T/F)을 저장할 공간을 1byte 할당하고
		// 할당 된 공간을 blooleanData로 정하겠다 라는 뜻이다.
		
		booleanData = true; // 변수 값 대입
		//blooleanData 변수에 true 값을 넣었다.
		
		System.out.println("booleanData : " + booleanData);
		System.out.println("---------------------------");

		byte byteNumber = 127; // 128 넣으면 에러 > int로 사용해야함
		// 메모리에 정수 값을 저장할 공간을 1byte 할당하고
		// 할당된 공간을 byteNumber라고 정하겠다.
		// 그리고 선언된 byteNumber에 127의 값으로 초기화 하겠다.
		// -> 선언과 동시에 초기화
		
		System.out.println("byteNumber : " + byteNumber);
		System.out.println("---------------------------");
		
		short shortNumber = 32767; // 32768 넣으면 에러 > int 사용해야함
		// -> 선언과 동시에 초기화
		int intNumber = 2147483647; 
		// -> 선언과 동시에 초기화
		// 정수 자료형의 기본형! (short, byte는 옛날 코드의 잔재, 잘 사용하지않음)
		
		//int intNumber = 2147483647;
   // ㄴ자료형  변수명  =   리터럴;
		// 프로그래밍에서는 대입되는 이 데이터(값 자체)를 리터럴이라는 단어로도 표현한다.
		
		
		// 리터럴 : 변수에 대입되거나 작성 되어지는 값 자체
		// 리터럴은 자료형에 따라 표기법이 다름.
		
		long longNumber = 10000000000L;
		// the literal 10000000000 of type int is out of range
		// -> 100억이라는 값은 int의 범위를 벗어났다는 뜻.
		// 리터럴 뒤에 L을 붙이지 않으면 int(정수 기본형)값으로 인색함
		// -> 뒤에 L을 붙여줌으로써 long 자료형인 것을 나타냄.
		
		float floatNumber = 1.2345f;
		// 1.2345까지만 쓰면 에러남. 실수형 기본자료형인 double로 인식
		// 리터럴 뒤에 f를 붙여줘야함.
		
		double doubleNumber = 3.141592;
		// 실수 자료형의 기본형!
		// 리터럴 표기법이 없는 실수는 double로 인식한다.(리터럴 뒤에 d를 쓸수는 있음)
		// 실수형은 float, double 2가지이므로
		// 자바는 double을 리터럴표기법 안붙이고 사용하는 자료형으로 정함.
		
// 문자형 리터럴 표기법 : ''(홑따옴표)
		char ch = 'A';
		// -> 홑따옴표 안에 문자 하나만 작성 가능
		char ch2 = 66;
		System.out.println("ch : "+ch);
		System.out.println("ch2 : "+ch2);
		
		/* cha 자료형에 숫자가 대입될 수 있는 이유?
		 * - 컴퓨터에는 문자표가 존재하고
		 * 	 숫자에 따라 지정된 문자 모양이 매핑되어있음(유니코드)
		 * - 'B' 문자 그대로가 ch에 대입되면 변수에 '숫자 66'으로 변환되어 저장됨
		 *    -> 결국, 변수에 애초에 66이라는 숫자를 저장하는 것임
		 */
		
		// 변수 명명 규칙
		// 1. 대소문자 구분하며, 길이제한은 없다
		int abcdefghijklmnop123456;
		int abcdefghijklmnoP123456; // P가 다름
		
		// 2. 예약어 사용이 안됨
		// double double; (x)
		
		// 3. 숫자로 시작하면 안됨
		// char 1abc; (x)
		char abc1; // (o)

		// 4. 특수문자는 $,_ 만 사용가능(하지만 쓰지 않는다)
		int $intNumber; //문제는 없지만 이렇게 쓰지 않는다
		int int_Number; // 카멜표기법을 사용하여 intNumber로 사용
						// _표기는 DB에서 사용 (MEMBER_NAME)
		
		// 5. 카멜 표기법을 사용한다
		// 변수명을 여러 단어를 이어서 작성하는 경우
		// 띄워쓰지않고 후속 단어 첫 글자를 대문자로 작성한다
		char hellWorlddAppleBananaTomato;
		
		// 6. 변수명은 언어를 가리지않아 한글로도 사용 가능하지만, 쓰지않음
		int 정수1번;
		double 실수2번 = 3.14;
		System.out.println(실수2번);
		
		System.out.println("---------------------------");
		
		int number = 10;
		System.out.println("number : "+ number); // 10
		
		number = 20;
		System.out.println("number : "+ number); // 20
		
		/* 상수 (항상 같은 수)
		 * - 변수의 한 종류
		 * - 한 번 값이 대입되면 다른 값을 재대입할 수 없음
		 * - 자료형 앞에 final이라는 키워드를 작성
		 * - 상수의 명명 규칙
		 *   : 리터럴은 모두 대문자로 작성, 여러단어 작성시 _사용
		 * - 상수를 사용하는 경우
		 *   : 변하면 안되는 고정된 값을 저장할 때
		 *   : 특정한 값에 의미를 부여할 때 (게임에서 'final int LEFT_MOVE = -1;' 등)
		 */

		final double PI_VALUE = 3.14;
		System.out.println("PI_VALUE : "+ PI_VALUE); // 3.14		
		// PI_VALUE = 2.14; -> 에러! 재대입 불가
				
	}

}
