package Ch16;


class A{
	int x;
	int y;
	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}
	
}
public class C01Object {

	public static void main(String[] args) {
		Object ob1 = new Object();
		System.out.println(ob1.toString()); //toString은 객체에 대한 설명(생략가능)
		System.out.println(ob1);
		System.out.println(ob1.getClass());
		System.out.printf("%x\n", ob1.hashCode());
		System.out.println();
		
		A ob2 = new A();
		System.out.println(ob2.toString()); 
		System.out.println(ob2);
		System.out.println(ob2.getClass().getName());
		System.out.printf("%x\n", ob2.hashCode());
		
		Object ob3 = new A();  //Upcasting
		System.out.println(ob3.toString()); 
		System.out.println(ob3);
		System.out.println(ob3.getClass().getName());
		System.out.printf("%x\n", ob3.hashCode());

	}

}
