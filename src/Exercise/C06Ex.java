package Exercise;

class Point {
	   private int x, y;
	   public Point(int x, int y) { this.x = x; this.y = y; }
	   public int getX() { return x; }
	   public int getY() { return y; }
	   protected void move(int x, int y) { this.x =x; this.y = y; }
	}

//class ColorPoint extends Point{
//	String color;
//	ColorPoint(){
//		super(0,0);
//		this.color="BLACK";
//	}
//	ColorPoint(int x, int y){
//		super(x,y);
//		this.color = "BLACK";
//	}
//	void setXY(int x, int y) {
//		move(x,y);
//	}
//	void setColor(String color) {
//		this.color=color;
//	}
//	@Override
//	public String toString() {
//		String tmp = color+"색의"+"("+getX()+","+getY()+")의 점";
//		return tmp;
//	}
	
//class Point3D extends Point{
//	int z;
//	Point3D(int x, int y, int z){
//		super(x,y);
//		this.z=z;
//	}
//	void moveUp() {
//		z++;
//	}
//	void moveDown() {
//		z--;
//	}
//	void move(int x, int y, int z) {
//		move(x,y);
//		this.z=z;
//	}
//	@Override
//	public String toString() {
//		String tmp = "("+getX()+","+getY()+","+z+") 의 점";
//		return tmp;
//	}
//	
//}

class PositivePoint extends Point{
	PositivePoint(){
		super(0,0);
	}
	PositivePoint(int x, int y){
		super(x,y);
		if(x<0 || y<0) {
			super.move(0, 0);
		}
	}
	protected void move(int x, int y) {
		if(x>0 && y>0) {
			super.move(x,y);
		}
	}
	public String toString() {
		String tmp = "("+getX()+","+getY()+")의 점";
		return tmp;
	}
	
}
	


public class C06Ex {

	public static void main(String[] args) {
//		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//		cp.setXY(10, 20);
//		cp.setColor("RED");
//		String str = cp.toString();
//		System.out.println(str+"입니다. ");
		
//		ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
//		System.out.println(zeroPoint.toString() + "입니다.");
//		ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
//		cp.setXY(5,5);
//		cp.setColor("RED");
//		System.out.println(cp.toString()+"입니다.");
		
//		Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
//		System.out.println(p.toString()+"입니다.");
//		p.moveUp(); // z 축으로 위쪽 이동
//		System.out.println(p.toString()+"입니다.");
//	    p.moveDown(); // z 축으로 아래쪽 이동
//	    p.move(10, 10); // x, y 축으로 이동
//	    System.out.println(p.toString()+"입니다.");
//	    p.move(100,  200, 300); // x, y, z축으로 이동
//	    System.out.println(p.toString()+"입니다.");
	    
	    PositivePoint p = new PositivePoint();
	    p.move(10, 10);
	    System.out.println(p.toString()+"입니다.");
	    p.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
	    System.out.println(p.toString()+"입니다.");
	    PositivePoint p2 = new PositivePoint(-10, -10);
	    System.out.println(p2.toString()+"입니다.");

	}

}
