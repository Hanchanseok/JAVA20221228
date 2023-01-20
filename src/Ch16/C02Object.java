package Ch16;

class Simple
{
	int x;
	int y;
	Simple(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class B{}
class C{}
public class C02Object {

	public static void main(String[] args) {
		Simple ob1 = new Simple(10, 20);
		Simple ob2 = new Simple(30, 40);
		Simple ob3 = new Simple(10, 20);
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		System.out.println(ob2.equals(ob3));
		

	}

}
