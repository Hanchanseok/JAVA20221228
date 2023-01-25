package Exercise;


abstract class Employee
{
	String name;
	String age;
	String addr;
	public Employee(String name, String age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	abstract void show();
}

class Parttimer extends Employee
{
	int hourpay;
	Parttimer(String name, String age, String addr, int hourpay){
		super(name,age,addr);
		this.hourpay = hourpay;
	}
	@Override
	void show() {
		System.out.printf("시간제근로자 :%s %s %s %d\n", name,age,addr,hourpay);
		
	}
	
}

class Regular extends Employee
{
	int salary;
	Regular(String name, String age, String addr, int salary){
		super(name,age,addr);
		this.salary=salary;
	}
	void show() {
		System.out.printf("정규근로자 :%s %s %s %d\n", name,age,addr,salary);
	}
}
public class C01Ex {
	
	public static void ShowInfo(Employee emp) {
		emp.show();
	}

	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동","25","대구",20000);
		Regular emp2 = new Regular("서길동","45","울산",50000000);
		ShowInfo(emp1);
		System.out.println("------------------------");
		ShowInfo(emp2);

	}

}
