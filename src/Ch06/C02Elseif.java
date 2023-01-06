package Ch06;

import java.util.Scanner;

public class C02Elseif {

	public static void main(String[] args) {
		//국어 , 영어 , 수학
		//각 과목당 40점 미만 불합격
		//평균이 60미만이면 불합격
		//그게 아니라면 합격
		
		//국어<40 -> 불합격
		//영어<40 -> 불합격
		//수학<40 -> 불합격
		//평균<60 -> 불합격
		
//		int kor=0, eng=0, mat=0, sum=0;
//		double avg=0.0;
//		Scanner sc = new Scanner(System.in);
//		kor = sc.nextInt();
//		eng = sc.nextInt();
//		mat = sc.nextInt();		
//		sum = kor+eng+mat;
//		avg=(double)sum/3;
//		if(kor<40)
//		{
//			System.out.println("불합격!");
//		}
//		else if(eng<40)
//		{
//			System.out.println("불합격!");
//		}
//		else if(mat<40)
//		{
//			System.out.println("불합격!");
//		}
//		else if(avg<60)
//		{
//			System.out.println("불합격!");
//		}
//		else {
//			System.out.println("합격!");
//		}
//		sc.close();
		
		
		//나이별로 요금을 부과하는 else if문 만드세요.
		//나이는 정수값으로 입력받습니다.
		//8세 미만 : 요금 1000원
		//14세 미만 : 요금 2000원
		//20세 미만 : 요금 2500원
		//20세 이상 : 요금 3000원
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age<8)
		{
			System.out.println("요금 1000원");
		}
		else if (age<14)
		{
			System.out.println("요금 2000원");
		}
		else if (age<20)
		{
			System.out.println("요금 2500원");
		}
		else
		{
			System.out.println("요금 3000원");
		}
		sc.close();

	}

}
