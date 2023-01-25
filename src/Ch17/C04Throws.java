package Ch17;

public class C04Throws {
	
	public static void Ex1() {
		try {
		throw new NullPointerException("Ex1의 예외처리!!!"); //throw는 예외를 고의로 발생시킴
		}catch(Exception e) {
		System.out.println("Ex1 예외처리!");
		}
		System.out.println("Ex1 실행코드");
	}
	
	public static void Ex2() throws Exception { //메인함수로 예외처리를 넘긴다
		
		throw new NullPointerException("Ex2의 예외처리!!!");
		
	}

	public static void main(String[] args) {
		Ex1();
		
		try {
		Ex2();
		}catch(Exception e) {
			System.out.println("Ex2 예외처리!");
		}

	}

}
