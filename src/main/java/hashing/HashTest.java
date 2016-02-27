package hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTest {

	static Integer i = 10;
	static Integer j = 20;
	
	public static void main(String[] args){
		int a = 2147483647;
		a=a+1;
		System.out.println(a);
		System.out.println(i.hashCode());
		System.out.println(j.hashCode());
		HashTest test  = new HashTest();
		System.out.println(test.hashCode());
		/*Map<String, String> map= new HashMap<>();
		map.put("India", "IND");
		map.put("Pakistan", "PAK");
		map.put("America", "AME");
		map.put("Australia", "AUS");
		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()){
			
			
		}
		map = Collections.synchronizedMap(map);
		System.out.println(map.get("IND"));*/
		
		
	}
}
