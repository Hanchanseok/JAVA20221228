package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		
		//탈출용 변수 지정
	
//		int i=0;    //탈출용 변수 지정
//		while(i<10)	//조건식
//		{
//			System.out.println("HELLO WORLD");
//			i++;	//조건식이 거짓이 되게끔 하기 위한 연산
//		}
		
		
		// 1부터 10까지의 합 구하기
//		int i = 1;
//		int sum=0;
//		while(i<=10)
//		{
//			System.out.println("i 값 : " +i);
//			sum = sum+i;
//			i++;
//		}
//		System.out.println("1부터 10까지 합 : " + sum);
		
		
		//1부터 n까지(키보드부터 입력) 수의 합
//		Scanner sc = new Scanner(System.in);
//		int i = 1;
//		int sum=0;
//		int n = sc.nextInt();
//		while(i<=n)
//		{
//			sum = sum + i;
//			i++;
//		}
//		System.out.printf("1부터 %d 까지 합 : %d" ,n,sum);
//		sc.close();
		
		
		//N부터 M까지의 합(N,M은 키보드로부터 입력)
//		Scanner sc = new Scanner(System.in);
//		int sum=0;
//		int n = sc.nextInt();  //초기값
//		int m = sc.nextInt();  //마지막값
//		
//		int i = n;  //i로 계산
//		while(i<=m)
//		{
//			sum = sum + i;
//			i++;
//		}
//		System.out.printf("%d부터 %d 까지 합 : %d" ,n,m,sum);
//		sc.close();

		
		//N부터 M까지의 합(N,M은 키보드로부터 입력), 조건 N>M
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int n = sc.nextInt();  //초기값
		int m = sc.nextInt();  //마지막값
		
		if(n>m) {
			//Swap : 서로 바꾸기
			int tmp = n;  //tmp라는 공간에 n의 값을 넣어줌
			n = m;		  //빈 n에 m의 값을 넣어줌
			m = tmp;      //빈 m에 tmp의 값을 넣어줌
		}
		
		int i = n;  //i로 계산
		while(i<=m)
		{
			sum = sum + i;
			i++;
		}
		System.out.printf("%d부터 %d 까지 합 : %d" ,n,m,sum);
		sc.close();

	}

}
