package Ch13;

//오버라이딩(함수재정의)
//상속관계에서 상위클래스의 메서드를 하위클래스가 재정의(고쳐사용하기)하는 것을 허용하는 문법
//메서드의 헤더부분은 동일하나 바디{} 부분의 로직이 다를 수 가 있다.
//

class Animal{
	public void Sound(){
		System.out.println("소리를 냅니다");
		}
}
class Dog extends Animal{
	public void Sound(){
		System.out.println("멍멍 소리를 냅니다"); //이걸 지우면 위에 것이 출력됨
	}
}
class Cat extends Animal{
	public void Sound(){
		System.out.println("야옹 소리를 냅니다"); //이걸 지우면 위에 것이 출력됨
	}
}
public class C03Overriding {
	public static void main(String[] args) {
		Dog Poppi = new Dog();
		Cat Yummi = new Cat();
		
		
		Poppi.Sound();
		Yummi.Sound();	
		
	
		
		
	}
}
