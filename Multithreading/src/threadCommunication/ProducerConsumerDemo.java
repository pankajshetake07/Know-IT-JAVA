package threadCommunication;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		Stock s = new Stock();
		
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		
		p.getThread().start();
		c.getThread().start();
		
		p.stopNow();
		c.stopNow();
		
		System.out.println("qty of producer : "+s.qtyProduced);
		System.out.println("qty of consumer : "+s.qtyConsumed);
	}

}
