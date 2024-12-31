package entities;
import java.util.ArrayList;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		
		//Remove all duplicates characters from list 
		List<String> list = new ArrayList<>();
		list.add("hii");
		list.add("pankaj");
		list.add("java");
		list.add("hii");
		list.add("byee");
		list.add("ok");
		list.add("object");
		list.add("hello");
		list.add("hii");
		
		for(int i=0; i<list.size()-1; i++) {
			boolean flag = false;
			for(int j=1; j<list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
					flag = true;
					break;
				}
			}
			if(flag) {
				list.remove(i);
				break;
			}
		}
		System.out.println(list);
	}

}
