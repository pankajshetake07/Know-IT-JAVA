package entities;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ArrangedStringByVowels {
	
	public static int countVowels(String str) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		Comparator<String> c = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				
				int c1 = countVowels(o1);
				int c2 = countVowels(o2);
				int diff = c2-c1;
				if(diff==0) {
					diff = o1.compareTo(o2);
				}
				return diff;
			}
		};
		
		
		Set<String> set = new TreeSet<String>(c);
		set.add("pankaj");
		set.add("shetake");
		set.add("java");
		set.add("object");
		set.add("final");
		set.add("super");
		set.add("aeio");
		set.add("aei");
		set.add("aeiou");
		
		for(String s : set) {
			System.out.println(s);
		}
	}
}
