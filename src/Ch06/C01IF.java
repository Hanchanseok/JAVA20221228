package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		//01 단순 IF
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if(age >= 8)
//		{
//			System.out.println("학교에 다닙니다");
//		}
//		System.out.println("첫번째 IF 블럭 종료");
//		if(age < 8)
//		{
//			System.out.println("학교에 다니지 않습니다.");
//		}
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다");
		
		
		
		//02 IF-ELSE
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if(age >= 8)
//		{
//			System.out.println("학교에 다닙니다");
//		}
//		else
//		{
//			System.out.println("학교에 다니지 않습니다");
//		}
		
		
		
		//정수하나 받아 입력받은수가 짝수인지 홀수인지 확인
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		if (num%2==0)
//		{
//			System.out.println("짝수입니다");
//		}
//		else
//		{
//			System.out.println("홀수입니다");
//		}
//		sc.close();
		
		
		//정수하나 받아 입력받은수가 3의배수인지 아닌지 확인
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		if (num1%3==0)
//		{
//			System.out.println("3의배수입니다");
//		}
//		else
//		{
//			System.out.println("3의배수가아닙니다");
//		}
//		sc.close();
		
		
		//두수를 입력받아 큰수를 출력
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if (a > b)
//		{
//			System.out.println(a);
//		}
//		else
//		{
//			System.out.println(b);
//		}
//		sc.close();
		
		
		//세수를 입력받아 큰수를 출력(&& 연산자를 사용해보세요~)
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a>=b && a>=c)
		{
			System.out.println(a);
		}
		
		if (b>=a && b>=c)		// else if 로 수정
		{
			System.out.println(b);
		}
		
		if (c>=a && c>=b)		// else if 로 수정
		{
			System.out.println(c);
		}							//만약 같은 값이 2개가 나오면 2번 출력되는 문제 발생
		sc.close();					// '='이 빠지만 같은값 입력시 출력 안됨(중복)
									// 그래서 해결법이 else if
	}

}
