package Ch02;

public class C01진수 {

	public static void main(String[] args) {
		//문제 
		//2진수 -> 10진수
		//01100010 -> 64 + 32 + 2 = 98
		//01010001 -> 64 + 16 + 1 = 81
		//01100110 -> 64 + 32 + 4 + 2 = 102
		
		//문제
		//10진수 -> 2진수
		//31 -> 00011111
		//25 -> 00011001
		
		//진법변환 서식문자
		//%d	:10진정수 서식문자
		//%o	:8진수 서식문자
		//%x	:16진수 서식문자
		System.out.printf("10진수 : %d\n", 0b1111);	//2진수(0b : 2진수를 의미하는 접두사)
		System.out.printf("10진수 : %d\n", 173);		//10진수
		System.out.printf("10진수 : %d\n", 0255);	//8진수 (0 : 8진수를 의미하는 접두사)
		System.out.printf("10진수 : %d\n", 0xAD);	//16진수(0x:16진수를 의미하는 접두사)
		
		System.out.printf("8진수 : %o\n", 173);		//10진수
		System.out.printf("8진수 : %o\n", 0255);		//8진수 (0 : 8진수를 의미하는 접두사)
		System.out.printf("8진수 : %o\n", 0xAD);		//16진수(0x:16진수를 의미하는 접두사)
		
		System.out.printf("16진수 : %x\n", 173);		//10진수
		System.out.printf("16진수 : %x\n", 0255);	//8진수 (0 : 8진수를 의미하는 접두사)
		System.out.printf("16진수 : %x\n", 0xAD);	//16진수(0x:16진수를 의미하는 접두사)
		

	}

}
