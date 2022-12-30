package Ch02;

public class C03변수자료형 {

	public static void main(String[] args) {
		//leftValue=RightValue - 대입연산자(=)를 기준으로 왼쪽은 lv(공간) 오른쪽은 rv(값)
		//lv(공간)=rv(값)
		
		int num1;	//4byte정수 공간 생성+num1 이름 부여 (변수 선언 or 정의)
		num1=10;	// 10값을 상수Pool에 저장 하고 num1공간에 복사(대입)
		int num2=4;
		int num3=num1+num2;
		System.out.println(num3);

	}

}
