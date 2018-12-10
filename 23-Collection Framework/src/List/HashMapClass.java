package List;

import java.util.*;

public class HashMapClass {

	public static void main(String[] args) {
		
		//HashMap ---fast, unsyncronized, works with single thread, allows one null key
		//HasTable -slow, syncronied, works with multiple thread, does not allow null key
		//linkedHashMap -- preserves the insertion order
		
		
		//Map map = new HashMap();
		
		Map<String, String> map = new HashMap<>();
		
		map.put("myName", "Mike");
		map.put("myAge", "25");
		map.put("myJob", "SDET");
		
		System.out.println(map); //there is no order
		System.out.println(map.get("myName")); 
		System.out.println(map.get("myName2"));
		
		Set<String> keys = map.keySet();
		for(String key:keys) {
			
			System.out.println(key+" "+map.get(key));
			
		}
		
	}

}
