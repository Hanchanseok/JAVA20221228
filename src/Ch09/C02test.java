package Ch09;

public class C02test {
	/* getter, setter 생성 할 것 */
	private String name;
	private int age;
	private short grade;
	private double avg;
	private int[] numArr;
	
	
	//getter 생성
	String getName() {
		return this.name;
	}
	
	int getAge() {
		return this.age;
	}
	
	short getGrade() {
		return this.grade;
	}
	
	double getAvg() {
		return this.avg;
	}
	
	int[] getNumArr() {
		return this.numArr;
	}
	
	//setter 생성
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void setGrade(short grade) {
		this.grade = grade;
	}
	
	void setAvg(double avg) {
		this.avg = avg;
	}
	
	void setNumArr(int[] numArr) {
		this.numArr = numArr;
	}
	
}
