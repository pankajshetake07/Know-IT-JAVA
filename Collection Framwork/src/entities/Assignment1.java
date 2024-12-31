package entities;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment1 {

	public static void main(String[] args) throws Exception {
		List<String> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter quit to exit");
		String str;
		do{
			
			System.out.println("Enter string : ");
			str = br.readLine();
			if(!str.equals("quit")) {
				list.add(str);
			}	
		}
		while(!str.equals("quit"));
		System.out.println(list);
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter index to be removed : ");
		int index = Integer.parseInt(br1.readLine());
		list.remove(index);      //removed element through index
		System.out.println("\n------------------------------------------");
		System.out.println(list);
		System.out.println("Size of the list is : "+list.size()); // size of the list
		for(String s : list) {										//print using advanced for loop
			System.out.print(s+" ");
		}
		System.out.println("\n------------------------------------------");
		
		//using iterator
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("\n------------------------------------------");
		//display last to first
		ListIterator<String> lit = list.listIterator();
		while(lit.hasPrevious()) {
			lit.previous();
		}
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println();
		System.out.println("\n------------------------------------------");
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println();
		Collections.sort(list);
		for(String s : list) {
			System.out.println(list);
		}
		System.out.println();
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String that you want to search : ");
		String str1 = br2.readLine();
		for(int i=0; i<list.size(); i++) {
			if(str1.equals(list.get(i))) {
				System.out.println(i);
			}
		}
	}
}
