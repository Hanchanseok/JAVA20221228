package Ch12;

class C01Simple
{
	//멤버변수
	static int Num1=0;  //공유변수
	int Num2;
	//멤버함수
	void ShowNum()
	{
		System.out.printf("NUM1 : %d NUM2 : %d\n", Num1,Num2);
	}
}
public class C01Static {

	public static void main(String[] args) {
		C01Simple obj1=new C01Simple();
		C01Simple obj2=new C01Simple();
		obj1.Num1=10;
		obj1.Num2=20;
		obj2.ShowNum();
		obj2.Num1=100;
		obj2.Num2=200;
		obj1.ShowNum();
		C01Simple.Num1=123;
		obj1.ShowNum();
	}

}
