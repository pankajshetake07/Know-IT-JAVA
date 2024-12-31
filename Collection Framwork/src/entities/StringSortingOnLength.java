package entities;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StringSortingOnLength {

	public static void main(String[] args) throws Exception{
		
		Comparator<String> strcmp = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				int diff = o1.length() - o2.length();
				if(diff == 0) {
					diff = o1.compareTo(o2);
				}
				return diff;
			}
		};
		
		Set<String> str = new TreeSet<String>(strcmp);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1;
		System.out.println("Enter \"stop\" to exit : ");
		while(!(str1=br.readLine()).equals("stop")) {
			str.add(str1);
		}
		
		System.out.println(str);
	}

}
