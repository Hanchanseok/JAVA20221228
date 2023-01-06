package Ch06;

import java.util.Scanner;

public class C03Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ranking = sc.nextInt();
		char medalColor;
		switch(ranking)
		{
		case 1:						//case는 상수값만 가능(제한적)
			medalColor = 'G';
			System.out.println("메달색상 : G");
			break;					//break문을 쓰지 않으면 다음 결과들도 실행됨
		case 2:
			medalColor = 'S';
			System.out.println("메달색상 : S");
			break;
		case 3:
			medalColor = 'B';
			System.out.println("메달색상 : B");
			break;
		default:
			medalColor = 'C';
			System.out.println("메달색상 : C");
		}
		System.out.println(ranking + "등 메달의 색은 "+ medalColor + " 입니다.");

	}

}
