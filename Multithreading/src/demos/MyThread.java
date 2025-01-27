package demos;

public class MyThread {

	public static void main(String[] args) {
		
		Thread t = new Thread();
		t.setName("Main thread");
		t.setPriority(t.NORM_PRIORITY);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
	}
}
