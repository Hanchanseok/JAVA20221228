package Ch04;

import java.util.Scanner;

public class C03scanner {

	public static void main(String[] args) {
		// 이름을 입력하세요? 홍길동(키보드로부터 받는값)
		// 홍길동 님의 나이를 입력하세요? 35
		// 홍길동 님의 주소를 입력하세요? 대구광역시 달서구 000
		// 홍길동 님의 나이는 35세 주소는 대구광역시 ~~ 입니다.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름을 입력하세요?");
//		String name = sc.next();
//		
//		System.out.printf("%s 님의 나이를 입력하세요?", name);
//		int age = sc.nextInt();
//		
//		sc.nextLine();
//		System.out.printf("%s 님의 주소를 입력하세요?", name);
//		String address = sc.nextLine();
//		
//		System.out.printf("%s님의 나이는 %d세 주소는 %s 입니다.", name, age, address);
//		
//		sc.close();
		
		
		
		//예제 문제1
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("첫번째 수 : ");
//		String strNum1= scanner.nextLine();
//		
//		System.out.print("두번째 수 : ");
//		String strNum2= scanner.nextLine();
//		
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);
//		
//		int result = num1 + num2;
//		System.out.println("덧셈 결과 : " + result);
//		scanner.close();
		
		
		
		//예제 문제2
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1.이름 : ");
		String name = sc.nextLine();
		System.out.print("2.주민번호 6자리 : ");
		String num = sc.nextLine();
		System.out.print("3.전화번호 : ");
		String tel = sc.nextLine();
		
		System.out.println();
		
		System.out.println("[입력된 내용]");
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + num);
		System.out.println("PH : " + tel);
		
		sc.close();

	}

}
