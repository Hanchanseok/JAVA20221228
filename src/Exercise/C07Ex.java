package Exercise;

import java.util.Scanner;

interface Stack {
	   int length(); // 현재 스택에 저장된 개수 리턴
	   int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	   String pop(); // 스택의 톱(top)에 실수 저장
	   boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
	}

class StringStack implements Stack{
	int num; // 저장 가능한 개수
	int set; // 저장 인덱스
	String[] stack;
	StringStack(int num){
		this.num=num;
		this.set=0;
		stack = new String[num];
	}
	public int length() {
		return set;
	}
	public int capacity() {
		return stack.length;
	}
	public String pop() {
		if(set-1<0)
			return null;
		set--;
		String s = stack[set];
		return s;
	}
	public boolean push(String val) {
		if(set<num) {
			stack[set] = val;
			set++;
			return true;
		}
		else
			return false;
	}
}

public class C07Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int num = sc.nextInt();
		StringStack stack = new StringStack(num);
		while(true){
			System.out.print("문자열 입력 >> ");
			String val = sc.next();
			if(val.equals("그만"))
				break;
			if(!stack.push(val)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int len = stack.length();
		for(int i=0; i<len; i++) {
			String s = stack.pop();
			System.out.print(s+" ");
		}
		sc.close();

	}

}
