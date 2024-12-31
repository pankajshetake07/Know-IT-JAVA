package entities;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<String> words = new PriorityQueue<String>();
		words.add("hello");
		words.add("my");
		words.add("name");
		words.add("is");
		words.add("pankaj");
		words.add("shetake");
		words.add("know");
		words.add("it");
		words.add("cdac-acts");
		System.out.println("poll: "+words.poll());
		
//		System.out.println(words.remove());
//		System.out.println(words.remove());
//		System.out.println(words.remove());
//		System.out.println(words.remove());
//		System.out.println(words.remove());
//		System.out.println(words.remove());
		
		System.out.println("----------------------");
		Iterator<String> itr = words.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
