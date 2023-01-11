package Ch07;

import java.util.Scanner;

public class C04For {

	public static void main(String[] args) {
		
//		for(int i=0; i<10; i++)  //초깃값; 조건식; 증감연산;
//		{
//			System.out.println("HELLO WORLD");
//		}
		
		//1부터 10까지의 합
//		int sum = 0;
//		for(int i=1; i<=10; i++)
//		{
//			sum += i;
//		}
//		System.out.println("1부터 10까지의 합 : " + sum);
		
		
		
		//1부터 N까지의 합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int sum = 0;
//		for (int i=1; i<=n; i++)
//		{
//			System.out.println("i 값 : " +i);
//			sum += i;
//		}
//		System.out.printf("1부터 %d까지의 합 : %d", n,sum);
//		sc.close();
		
		
		
		//N부터 M까지의 합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		if(n>m)
//		{
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		int sum = 0;
//		for (int i=n; i<=m; i++)
//		{
//			System.out.println("i 값 : " +i);
//			sum += i;
//		}
//		System.out.printf("%d부터 %d까지의 합 : %d", n,m,sum);
//		sc.close();
		
		
		
		//2단 출력
//		int dan = 2;
//		for (int i=1; i<=9; i++)
//		{
//			System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//		}
		
		
		
		//N단 출력
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		for (int i=1; i<=9; i++)
//		{
//			System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//		}
		
		
		
		//2-9단 출력
//		for (int dan=2; dan<=9; dan++)
//		{
//			for(int i=1; i<=9; i++)
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			}
//			System.out.println();
//		}
		
		
		
		//2-N단 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for (int dan=2; dan<=n; dan++)
//		{
//			for(int i=1; i<=9; i++)
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			}
//			System.out.println();
//		}
//		sc.close();
		
		
		
		//N~M단 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		for (int dan=n; dan<=m; dan++)
//		{
//			for (int i=1; i<=9; i++)
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			}
//			System.out.println();
//		}
//		sc.close();
		
		
		
		//별찍기~
		//****
		//****
		//****
		//****
//		for (int i=0; i<4; i++)
//		{
//			for (int j=0; j<4; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		//*
		//**
		//***
		//****
//		for (int i=0; i<4; i++)
//		{
//			for(int j=0; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		//*
		//**
		//***
		//****
		//...
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for (int i=0; i<n; i++)
//		{
//			for(int j=0; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		sc.close();
		
		
		
		//   *
		//  ***
		// *****
		//*******
//		for (int i=0; i<4; i++)
//		{
//			for(int j=0; j<3-i; j++)
//			{
//				System.out.print(" ");
//			}
//			for (int k=0; k<=2*i; k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		//   *
		//  ***
		// *****
		//*******
		//...	
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		for (int i=0; i<h; i++)
//		{
//			for(int j=0; j<(h-1)-i; j++)
//			{
//				System.out.print(" ");
//			}
//			for (int k=0; k<=2*i; k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		sc.close();

	}

}
