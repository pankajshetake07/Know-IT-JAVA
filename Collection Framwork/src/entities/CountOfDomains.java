package entities;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CountOfDomains {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader("E:/KNOW-IT/MyData/emails.txt"));
		String line;
		String temp="";
		Map<String, Integer> map = new HashMap<String, Integer>();
		while((line=br.readLine()) != null) {
			for(int i=0; i<line.length(); i++) {
				if(line.charAt(i) == '@') {
					temp = line.substring(i); 
					if(map.containsKey(temp)) {
						map.put(temp, map.get(temp)+1);
					}
					else {
						map.put(temp, 1);
					}
				}	
			}
		}
		Set<Entry<String, Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> me : set) {
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		br.close();
	}

}
