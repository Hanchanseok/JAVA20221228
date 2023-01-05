package Ch05;

public class C04Shift연산자 {

	public static void main(String[] args) {
		int num1 = 15;				//00000000 00000000 00000000 00001111
		int num2 = 20;				//00000000 00000000 00000000 00010100
		int num3 = num2<<2;
		int num4 = num2>>2;  // 20 x 2^-2
		
		System.out.println("<<Shift 연산결과 : " + num3);
		System.out.println(">>Shift 연산결과 : " + num4);

	}

}
