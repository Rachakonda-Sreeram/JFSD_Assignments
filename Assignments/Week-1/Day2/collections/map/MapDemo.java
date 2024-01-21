package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String args[]) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(103,"Ravi");
		map.put(102,"Smith");
		map.put(101,"Tom");
		map.put(102,"Sai");
		map.put(13,"Ravi");
		System.out.println(map);
		
		Map<Integer,String> map1 = new LinkedHashMap<Integer,String>();
		map1.put(103,"Ravi");
		map1.put(102,"Smith");
		map1.put(101,"Tom");
		map1.put(102,"Sai");
		map1.put(13,"Ravi");
		System.out.println(map1);
		
		Set<Integer> kset =  map1.keySet();
		
		Iterator<Integer> it = kset.iterator();
		while(it.hasNext()) {
			Integer k = it.next();
			System.out.println(k+" "+ map1.get(k));
		}
		
		
		
	}
}
