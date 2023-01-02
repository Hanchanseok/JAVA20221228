package Ch02;

public class C04변수자료형 {

	public static void main(String[] args) {
		//------------------------
		//정수 int-4byte 정수
		//------------------------
//		int n1 = 0b10101101;	//2진수값
//		int n2 = 173;			//10진정수값
//		int n3 = 0255;			//8진수
//		int n4 = 0xad;			//16진수
//		System.out.printf("%d %d %d %d\n", n1,n2,n3,n4);
		
		//------------------------
		//정수 int-1byte 정수 부호 ㅇ
		//------------------------
//		byte n1 = -128;
//		byte n2 = -30;
//		byte n3 = 30;
//		byte n4 = 127;
//		//byte n5 = 128;	//문제발생.. 왜?? : 바이트가 담아 낼 수 없는 범위
//		byte n5 = (byte)128;
//		System.out.printf("%d\n", n5); //왜 ??
		
		//------------------------
		//정수 short-2byte 정수 부호ㅇ | char-2byte정수 부호x(양수만)
		//------------------------
//		char n1 = 65535;  //(0~2^16-1)	(0~65535)
//		short n2 = 32767; //(-2^15 ~ +2^15-1)(-32768 ~ + 32767)
//		
//		char n3 = 60000;
//		//short n4 = n3; //문제발생... 왜?? : short은 저장범위가 -32768 ~ + 32767까지
//		short n4 = (short)n3;
//		System.out.printf("%d\n", n4);
		
		//------------------------
		//정수 long-8byte 정수 부호o
		//------------------------
//		long n1 = 10;   //컴파일러가 자동으로 자료형을 맞춰줌 : 작은공간에 있는 값을 큰 공간에 넣으니까...
//		long n2 = 20L;	//L,l(리터럴접미사) : long 자료형 사용하여 값 저장. 8바이트 공간으로 형변환 해줌.
//		
//		long n3 = 10000000000;  //문제발생.. 왜?? : 애초에 int 자료형에 초과하는 값이 들어가서
//		long n4 = 10000000000L;
		
		//------------------------
		//실수
		//------------------------
		//유리수와 무리수의 통칭
		//소숫점이하값을 가지는 수 123.456
		//float : 4byte 실수(6-9자리)
		//double : 8byte 실수(15-18자리)
		
		//정밀도 확인
//		float n1 = 0.123456789123456789F; //f,F:float형 접미사
//		double n2 = 0.123456789123456789;
//		
//		System.out.println(n1); //0.12345679
//		System.out.println(n2); //0.12345678912345678
		
//그냥   //고정 소수점 : 속도빠름, 메모리공간 효율성 떨어짐
		//부동 소수점 : 위의 고정 소수점과 반대
		
		//------------------------
		//단일문자 char 2byte 정수  //ASCII코드, 유니코드 구글에 검색하고 대조해보기
		//------------------------
//		char ch1 = 'a'; //단일문자는 ''로
//		System.out.println(ch1);
//		System.out.println((int)ch1);  // 011000001
//		
//		char ch2 = 98;
//		System.out.println(ch2);
//		System.out.println((int)ch2);  // 011000010
//		
//		char ch3 = 'b'+1;
//		System.out.println(ch3);
//		System.out.println((int)ch3);  // 011000011
//		
//		byte ch4 = 'c'+2;
//		System.out.println((char)ch4);
//		System.out.println(ch4);  // 011000011
//		
//		char ch5 = '가';
//		char ch6 = 0xac00;
//		System.out.printf("%c %c\n", ch5,ch6);
//		
//		// \\u' : 유니코드값 이스케이프문자
//		System.out.printf("%c\n", '\uac80');
//		
//		char ch7 = '\ud7fb';
//		System.out.printf("%c\n", ch7);
		
		//------------------------
		//문자열 : String (클래스자료형)
		//------------------------
		
		//기본자료형(원시타입)
//		byte n1;
//		short n2;
//		double n3;
//		long n4;
		
		//클래스자료형
		//클래스자료형으로 만든변수는 '참조변수'라고 하고
		//참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
//		int n1 = 10;
//		String name = "홍길동";
//		String job = "프로그래머";
//		System.out.println(name);
//		System.out.println(job);
		
		//------------------------
		//boolean : 논리형(true/false 저장)
		//------------------------
		
		boolean flag = true;  // 참(긍정)
		if(flag)
		{
			System.out.println("참인경우 실행");
		}
		else
		{
			System.out.println("거짓인경우 실행");
		}
		
	}

}
