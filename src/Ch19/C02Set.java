package Ch19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {

	public static void main(String[] args) {
		Set<String> set = new HashSet();	//hashcode(), equals() 이용하여 동일객체여부 판단
		
		//추가
		set.add("Java");	    
		set.add("JDBC");		
		set.add("OracleDB");    
		set.add("JSP");		    
		set.add("Servlet");	    
		set.add("JSP");		    //나중에 저장되는 값 적용(디폴트)
		
		//확인(저장 수)
		System.out.println("총 개체수 : " +set.size());
		
		//조회
		for(String tmp : set) {
			System.out.println(tmp);
		}
		System.out.println("-------------------");
		
		//조회(복잡)
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String tmp = iter.next();
			System.out.println(tmp);
		}
		System.out.println("-------------------");
		
		//삭제
		set.remove("Java");
		System.out.println("총 개체수 : " +set.size());
		

	}

}
