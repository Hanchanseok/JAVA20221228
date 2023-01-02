package Ch02;

public class C05상수 {

	public static void main(String[] args) {
		//상수 : 항상 같은 수
		
		//리터럴 상수 : 이름부여 X  상수pool 저장
		//심볼릭 상수 : 이름부여 O  final 예약어 사용
		
		//리터럴 접미사
		//l,L : long 접미사
		//f,F : float 접미사
		
		int n1 = 100;		//변수
		final int n2 = 100; //상수
		
		n1=200; //O : 값 변화 가능(변수)
		//n2=200; //X : 값 변화 불가능(상수)
		
		
		final double PI = 3.14;
		double result = PI*4*4;

	}

}
