package Ch18;

abstract class 호빵재료{
	
}

class 팥 extends 호빵재료{
	String meterial;
	팥(String meterial){this.meterial=meterial;}
	@Override
	public String toString() {
		return "팥 [meterial=" + meterial + "]";
	}
}

class 야채 extends 호빵재료{
	String meterial;
	야채(String meterial){this.meterial=meterial;}
	@Override
	public String toString() {
		return "야채 [meterial=" + meterial + "]";
	}
}

class 피자 extends 호빵재료{
	String meterial;
	피자(String meterial){this.meterial=meterial;}
	@Override
	public String toString() {
		return "피자 [meterial=" + meterial + "]";
	}
}

class 민초 {
	String meterial;
	민초(String meterial){this.meterial=meterial;}
	@Override
	public String toString() {
		return "민초 [meterial=" + meterial + "]";
	}
}

class 호빵<T extends 호빵재료>  //기본적으로 T라는 타입을 씀, T에 팥/야채/피자 가 들어옴
{							 //호빵재료의 하위클래스만 재료로 쓸 수 있음
	private T meterial;
	호빵(T meterial){
		this.meterial = meterial;
	}
	void ShowInfo() {
		System.out.println(meterial.toString()+" 으로 만든 호빵!");
	}
}

public class C01Generic {

	public static void main(String[] args) {
		호빵<팥> 단팥호빵 = new 호빵<팥>(new 팥("단팥"));  //오른쪽<팥>은 생략가능
		단팥호빵.ShowInfo();
		
		호빵<야채> 만두피호빵 = new 호빵(new 야채("만두피"));
		만두피호빵.ShowInfo();
		
//		호빵<민초> 민초호빵 = new 호빵(new 민초("치약맛"));
//		민초호빵.ShowInfo();								//호빵재료의 하위클래스가 아니어서 오류

	}

}
