package Ch13Ex;

class Computer{	
	void PowerOn(){ System.out.println("전원을 켭니다");}
	void PowerOff(){System.out.println("전원을 끕니다");}	
}

 
class Notebook extends Computer
{
	String Owner;
	static int ProductNumber=1000;//->ProductNum의 초기값은 1000으로 설정	
	Notebook(){
		//->생성자를 쓸때마다 ProductNumber 값이 증가 해야함
		ProductNumber++;
	}
	void setOwner(String name){
		this.Owner = name;
	}
	String getOwner(){
		return Owner;
	}
	int getProductNumber(){
		return ProductNumber;
	}
	void move(){System.out.println("이동합니다");}
	
	
}


class Tablet extends Notebook{
	String PenNumber; 
	
	void Write(){System.out.println("펜을 씁니다");}
	void SetPenNumber(String Pen){
		this.PenNumber = Pen;
	}
	String getPenNumber(){
		return PenNumber;
	}
	
}


public class C02PracAnswer{
	public static void main(String[] args) {
		Notebook Kim = new Notebook();
		Kim.setOwner("김성주");
		System.out.println("소유자:"+Kim.getOwner()+"PN"+Kim.getProductNumber());
		Kim.PowerOn();
		Kim.move();
		Kim.PowerOff();
		Tablet Lee = new Tablet();
		Lee.setOwner("이승기");
		System.out.println("소유자:"+Lee.getOwner()+"PN"+Lee.getProductNumber());
		Lee.SetPenNumber("1-2-3-4");
		Lee.PowerOn();
		Lee.move();
		Lee.Write();
		Lee.PowerOff();
	}
}