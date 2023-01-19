package Ch15;

interface C03Remocon
{
	//필드(final static)
	int MAX_VOLUMN=10;
	int MIN_VOLUMN=0;
	//기능(추상메서드)
	void turnOn();
	void turnOff();
	void setVolumn(int vol);
}
interface SearchURL{
	void Search(String url);
}
class C03TV implements C03Remocon{

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

class C03SmartTV extends C03TV implements SearchURL{

	@Override
	public void Search(String url) {
		System.out.println(url+"로 페이지 접속 합니다!");
		
	}
	
}


class C03Radio implements C03Remocon{

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

public class C03InterfaceMain {

	public static void TurnOn(C03Remocon controller) {
		controller.turnOn();
	}
	public static void TurnOff(C03Remocon controller) {
		controller.turnOff();
	}
	public static void SetVol(C03Remocon controller,int num) {
		controller.setVolumn(num);
	}
	public static void Search(SearchURL product, String url) {
		product.Search(url);
	}
	
	public static void main(String[] args) {
		C03SmartTV tv = new C03SmartTV();
		TurnOn(tv);
		SetVol(tv,5);
		Search(tv,"www.naver.com");

	}

}
