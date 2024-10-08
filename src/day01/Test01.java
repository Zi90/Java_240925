package day01;

public class Test01 {

	public static void main(String[] args) {
		// 한 줄 주석
		/* 여러줄 주석 */
		// System.out.println("콘솔 출력 테스트") => sysout (ctrl + space)
		// ctrl + F11 실행 단축키
		System.out.println("Hello World~!!");
		System.out.println("그럼 제가 선배 맘에 ~");
		
		// let const javascript
		// 타입별로 변수 유형을 결정해야 함.
		// String 문자형 => 기본타입이 아님. 참조형 타입
		// 변수타입 8가지
		// 변수는 범위(scope) { } 를 벗어나면 변수는 사용할 수 없음.
		
		int num = 10; // 타입 변수명 = 값;
		System.out.println(num);
		{
			int num2 = 20;
			System.out.println(num2);
		}
		
		// System.out.println(num2); // 범위를 벗어나서 Exception
		// java에서 error (프로그램(코드) 적으로 손댈 수 없는 에러)
		// Exception 프로그램적으로 발생할 수 있는 에러(내가 코드를 잘못 짠 경우)
		
		// char : 한 글자만 저장 가능. ' '
		// String : 단어 장문 가능. " "
//		char ch = "a"; // Type mismatch
//		String s = 'a'; // Type mismatch
		
		char ch = 'a';
		System.out.println((int)ch); // 유니코드(아스키) 표에 의해 변환된 10진수를 출력

		// long / float은 L(l)-생략가능 / F(f) 를 접미사로 표현
		// java 정수의 기본자료형 int 실수의 기본자료형 double
		long l = 1L; // long 형의 특징
		System.out.println(l);
		
		float f = 0.1f;
		System.out.println(f);
		
		// 사칙연산자 : + - * / %(나머지)
		// 증감연산자 : ++ -- +=
		// 논리연산자 : && || !
		// 대입연산자 : = == !=
		// 조건선택연산자 : (조건식) ? true : false 연결해서 다중 사용가능
		
		// + : 산술연산자, 연결연산자
		// 숫자 + 숫자 => 산술연산자로 인지
		// 숫자 + 문자 => 연결연산자로 인지 이후부터 문자로 인식
		System.out.println(1 + 2);
		System.out.println(1 + 2 + "가나다");
		System.out.println("가나다" + (1 + 2));
		
	}

}
