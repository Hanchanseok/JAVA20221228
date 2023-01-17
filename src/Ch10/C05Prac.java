package Ch10;

import java.util.Scanner;

public class C05Prac {

	public static void main(String[] args) {
		//[문제]1차원 배열
		//10 크기의 int형 배열을 만들어서
		//반복문과 함께 해당배열의 0 - 9 까지 요소에 각각 정수값을 입력
		//합,평균,최대값,최소값을 구합시다
//		Scanner sc = new Scanner(System.in);
//		int [] ar1 = new int[10];
//		
//		int sum = 0;
//		for(int i=0; i<ar1.length; i++)
//		{
//			ar1[i] = sc.nextInt();
//			sum += ar1[i];
//		}
//		double avg = (double)sum/ar1.length;
//		System.out.println("합 : " + sum);
//		System.out.println("평균 : " + avg);
//		
//		int max = ar1[0];
//		for(int i=0; i<ar1.length; i++)
//		{
//			if(max < ar1[i])
//			{
//				max = ar1[i];
//			}
//		}
//		System.out.println("최댓값 : " +max);
//		
//		int min = ar1[0];
//		for(int i=0; i<ar1.length; i++)
//		{
//			if(min > ar1[i])
//			{
//				min = ar1[i];
//			}
//		}
//		System.out.println("최솟값 : " +min);
		
		
		
		//[문제]2차원 배열
		//문제 
		//5명의 학생의 국/영/수 점수를 입력받아 출력을 해봅시다
		//학생별 평균 구하기
		//과목별 평균 구하기
		//각 행의 합 과 전체 합 // 각행의 평균 전체 평균을 출력하세요
		
		
		//출력예
		//1 학생 점수입력(국/영/수 순서) : 100 70 60
		//2 학생 점수입력(국/영/수 순서) : 99 98 66
		//3 학생 점수입력(국/영/수 순서) : 99 88 77 
		//4 학생 점수입력(국/영/수 순서) : 100 55 66
		//5 학생 점수입력(국/영/수 순서) : 55 66 77
		//1 학생 총점 : ? 평균 ? 
		//2 학생 총점 : ? 평균 ?
		//3 학생 총점 : ? 평균 ?
		//4 학생 총점 : ? 평균 ?
		//5 학생 총점 : ? 평균 ?
		//국어 총점 : ? 국어 평균 :?
		//영어 총점 : ? 영어 평균 :?
		//수학 총점 : ? 수학 평균 :?
		
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int[5][3];
		
		int sum = 0;
		int stcount = 1;
		for (int i=0; i<arr.length; i++)
		{
			sum = 0;
			System.out.printf("%d 학생 점수입력(국/영/수 순서) : ", stcount);
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
			}
			stcount++;
		}
		double avg = (double)sum/arr.length;
		System.out.printf("%d 학생 총점 : %d", sum);

	}

}
