package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		//구구단(2단 - 9단)
//		int dan = 2;
//		int i = 1;
//		
//		while (dan<=9)
//		{
//			i=1; //i를 1로 초기화해준다.
//			while (i<=9)
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		//2단 9단 출력 (9단부터)
//		int dan = 9;
//		int i = 1;
//		
//		while (dan>=2)
//		{
//			i = 1;
//			while (i<=9)
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan--;
//		}
		
		
		//2단 9단 출력 (9단 부터, 거꾸로)
//		int dan = 9;
//		int i = 9;
//		
//		while (dan>=2)
//		{
//			i=9;
//			while(i>=1)
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
		
		
		//N단을 입력받아 N단부터 9단까지 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int dan = n;
//		int i = 1;
//		
//		while(dan<=9)
//		{
//			i=1;
//			while(i<=9)
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
//		sc.close();
		
		
		//N,M을 입력받아 N부터 M단까지 출력(N<M and N<8,M<=9) //미완성
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		if(m>n)
//		{
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		
//		int dan = n;
//		int i = m;
//		if (n<8 && m<=9)
		
		
		//1
		//*****
		//*****
		//*****
		//*****
		//i(줄바꿈)  j(별찍기)
		//i=0	   j=0
		//i++	   j++
		//i<4	   j<5
		
//		int i=0; //줄바꿈
//		int j=0;
//		while(i<4)
//		{
//			j=0;
//			while(j<5)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//2
		//*
		//**
		//***
		//****
		//i(줄바꿈)	j(별찍기)
		//i=0		j=0
		//i++		j++
		//i<4		j<=i
		
//		int i=0; //줄바꿈
//		int j=0;
//		while(i<4)
//		{
//			j=0;
//			while(j<=i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//높이만큼의 직각삼각형별이 출력되도록 합니다.
		//높이 입력 : 3
		//*
		//**
		//***
		//i(줄바꿈)	j(별찍기)
		//i=0		j=0
		//i++		j++
		//i<h		j<=i
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0; //줄바꿈
//		int j=0;
//		while(i<h)
//		{
//			j=0;
//			while(j<=i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		//3
		//****
		//***
		//**
		//*
		//i(줄바꿈)	j(별찍기)
		//i=0		j=0
		//i++		j++
		//i<4(높이)	j<4-i 높이의 영향을 받을 수 밖에 없기 때문
		
//		int i=0; //줄바꿈
//		int j=0;
//		while(i<4)
//		{
//			j=0;
//			while(j<4-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		// 높이 : h
		//***
		//**
		//*
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		
//		while(i<h)
//		{
//			j=0;
//			while(j<h-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();
		
		
		
		
		
		//4
		//   *
		//  ***
		// *****
		//*******
		//i(개행)	j(공백)	k(별찍기)
		//0			0~2		0~0
		//1			0~1		0~2
		//2			0~0		0~5
		//3			x		0~6
		//-----------------------
		//i=0		j=0		k=0
		//i++		j++		k++
		//i<4		j<=2-i	k<=2*i
		
		int i=0; //개행(줄바꿈)
		int j=0; //공백
		int k=0; //별
		
		while(i<4)
		{
			//공백
			j=0;
			while(j<=2-i)
			{
				System.out.print(" ");
				j++;
			}
			//별
			k=0;
			while(k<=2*i)
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
		
		
		
		
		
		// 높이 : h
		//   *
		//  ***
		// *****
		
		
		//5
		//*******
		// *****
		//  ***
		//   *
		
		

	}

}
