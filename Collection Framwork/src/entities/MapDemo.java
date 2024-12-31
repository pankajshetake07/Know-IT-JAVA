package entities;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "java");
		map.put(2, "javascript");
		map.put(3, "python");
		map.put(4, "React js");
		map.put(5, "Go lang");
		map.put(6, "Node js");
		map.put(null, null);
		map.put(7, null);
		System.out.println("-------------");
		
		System.out.println(map.get(4));
		
		System.out.println("------------");
		
		Set<Entry<Integer, String>> set = map.entrySet(); //converting map into set for iterating
		//using advance for loop
		for(Map.Entry<Integer, String> me : set) {
			System.out.println(me.getKey()+":"+me.getValue());
		}
		//using iterator method
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> me = itr.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
	}

}
