package Ch15;

interface C01Remocon
{
	//필드(final static)
	int MAX_VOLUMN=10;
	int MIN_VOLUMN=0;
	//기능(추상메서드)
	void turnOn();
	void turnOff();
	void setVolumn(int vol);
}
class C01TV implements C01Remocon{

	int vol;
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	@Override
	public void setVolumn(int vol) {
		if(vol>=MAX_VOLUMN) {
			vol=MAX_VOLUMN;
		}else if(vol<=MIN_VOLUMN) {
			vol=MIN_VOLUMN;
		}else {
			this.vol = vol;
		}
	}
	
}
class C01Radio implements C01Remocon{

	int vol;
	@Override
	public void turnOn() {
		System.out.println("라디오를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("라디오를 끕니다");
	}
	@Override
	public void setVolumn(int vol) {
		if(vol>=MAX_VOLUMN) {
			vol=MAX_VOLUMN;
		}else if(vol<=MIN_VOLUMN) {
			vol=MIN_VOLUMN;
		}else {
			this.vol = vol;
		}
	}
	
}

public class C01InterfaceMain {

	public static void TurnOn(C01Remocon controller) {
		controller.turnOn();
	}
	public static void TurnOff(C01Remocon controller) {
		controller.turnOff();
	}
	public static void SetVol(C01Remocon controller,int num) {
		controller.setVolumn(num);
	}
	
	public static void main(String[] args) {
		C01TV tv = new C01TV();
		C01Radio radio = new C01Radio();
		
		TurnOn(tv);
		TurnOn(radio);
		SetVol(tv,7);
		System.out.println(tv.vol);

	}

}
