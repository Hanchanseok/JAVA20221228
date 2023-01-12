package Ch09;

class C03Simple
{
	int x;
	int y;
	
	C03Simple getThis() {
		return this;
	}
}

public class C03This {

	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple();
		System.out.println("ob1 : " + ob1);
		System.out.println("this : " + ob1.getThis());
		System.out.println();
		C03Simple ob2 = new C03Simple();
		System.out.println("ob2 : " + ob2);
		System.out.println("this : " + ob2.getThis());

	}

}
