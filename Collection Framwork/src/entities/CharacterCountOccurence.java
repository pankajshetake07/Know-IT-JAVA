package entities;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CharacterCountOccurence {

	public static void main(String[] args) {
		String str = "coccacola";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++) {
//			if(map.containsKey(str.charAt(i))) {
//				map.put(str.charAt(i), map.get(str.charAt(i))+1);
//			} 
//			else {
//				map.put(str.charAt(i), 1);
//			}
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
		}
		
		Set<Entry<Character, Integer>> set = map.entrySet();
		for(Map.Entry<Character, Integer> me : set) {
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
		for(Character keys : map.keySet()) {
			if(map.get(keys)>str.length()/3) {
				System.out.println("Most occurence of character : "+keys);
			}
		}
	}

}
