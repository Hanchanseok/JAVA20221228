package Ch12;

class C03Company {
	int x;
	int y;
	
	private static C03Company instance;
	//생성자
	private C03Company() {}
	//멤버함수
	public static C03Company getInstance() {
		if(instance ==null) {
			instance = new C03Company();
		}
		return instance;
	}		// 잘 모르겠으면 일단은 외우기
}

public class C03Singleton {

	public static void main(String[] args) {
		//C03Company myCompany0 = new C03Company();  //불가능
		C03Company myCompany1 = C03Company.getInstance();
		C03Company myCompany2 = C03Company.getInstance();
		System.out.println(myCompany1 ==myCompany2);
		myCompany1.x=10;
		myCompany2.y=20;
		C03Company myCompany3 = C03Company.getInstance();
		System.out.println(myCompany3.x+" " + myCompany3.y);

	}

}
