package threadCommunication;

public class Stock {
	int qtyProduced;
	int qtyConsumed;
	boolean bProduced = false;
	
	//producer
	public synchronized void produce() {
		if(bProduced) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//bProduced is false
		qtyProduced++;
		System.out.println("Quantity produced : "+qtyProduced);
		bProduced = true;
		notify();    //waiting for consumer to finish its task
	}
	
	//consumer
	public synchronized void consume() {
		if(!bProduced) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//bProduced is true
		qtyConsumed++;
		System.out.println("Quantity Consumed : "+qtyConsumed);
		bProduced = false;
		notify();  //waiting for producer to finish its task;
	}
}
