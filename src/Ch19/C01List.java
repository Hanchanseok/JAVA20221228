package Ch19;

import java.util.ArrayList;
import java.util.List;

public class C01List {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		
		//추가
		list.add("Java");	    //0
		list.add("JDBC");		//1
		list.add("OracleDB");   //2
		list.add("JSP");		//3
		list.add("Servlet");	//4
		list.add("JSP");		//5  중복허용
		
		//확인(저장 수)
		System.out.println("총 개체수 : " +list.size());
		
		//조회(요소)
		System.out.println("확인 idx 2 : " +list.get(2));	//2번째 인덱스 OracleDB
		System.out.println("--------------------------");
		
		//전체 조회
		for(String i : list) {
			System.out.println(i);
		}
		
		//삭제
		list.remove(2);
		System.out.println("--------------------------");
		
		//전체 조회
		for(String i : list) {
			System.out.println(i);
		}
		
		//전체 삭제
		list.clear();
		System.out.println("--------------------------");
		
		//전체 조회
		for(String i : list) {
			System.out.println(i);
		}

	}

}
