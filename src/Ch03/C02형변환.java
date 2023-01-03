package Ch03;

public class C02형변환 {

	public static void main(String[] args) {
		
		//강제 형변환
		//좁은범위공간에 큰값을 넣으려고 하는 경우
		//기본적으로 불가능하기 때문에 강제로 자료형을 바꾸어 전달한다
		//데이터 손실의 염려가 있다
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		//데이터 손실!
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		//char vs short
		char ch = '가';
		//short ch2 = ch;  //왜 안되나요??.. 자료형이 일치하지 않고 char와 short는 같은 사이즈지만 범위가 다름
		short ch2 = (short)ch;
		System.out.printf("%d %d\n", (int)ch,ch2);

	}

}
