package Ch03;

public class C04형변환덧셈연산시 {

	public static void main(String[] args) {
		//정수 연산식(int 보다 작은 변수자료형(short, char, byte))
		//int 로 자동 형변환
		byte x = 10;
		byte y = 20;
		//byte result1 = x + y;			//컴파일 에러 x,y는 각각 int형 자료로 담아서 처리가 되고
										//왼쪽 byte형으로 저장시 작은 공간에 큰자료형타입넣으려는 문제 발생
		int result1 = x + y;
		//혹은
		//byte result1 = (byte)(x + y);
		System.out.println(result1);
		
		
		//정수 연산식(int 보다 작은 변수자료형(long))
		//큰 타입으로 자동 형변환
		byte var1 = 10;
		int var2 = 100;
		long var3 = 1000L;
		//int result = var1 + var2 + var3;   //오른쪽 변수들은 long 으로 자동형변환
											 //but 왼쪽 공간이 작은공간이기 때문에 컴파일 에러
		
		long result2 = var1 + var2 + var3;
		//혹은 int result2 = (int)var1 + (int)var2 + (int)var3;
		System.out.println(result2);
		
		
		//실수연산식
		//큰 타입으로 자동 형변환
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
		double result3 = intvar + flvar + dbvar;	//intvar, flvar 가 각각 double 형으로 형변환된값이다.
		
		System.out.println(result3);
		
	}

}
