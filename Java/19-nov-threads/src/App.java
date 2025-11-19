import java.util.concurrent.locks.ReentrantLock;

public class App {

	public static void main(String[] args) throws InterruptedException {
		Thread tarr[]=new Thread[10];
		Counter counter=new Counter();
		
		for(int i=0;i<tarr.length;i++) {
			tarr[i]=new Thread(()->{
				for(int j=0;j<1000;j++) {
					counter.increment();
//					System.out.println("Count is: "+counter.getCount());
				}
			});
		}
		
		for(Thread t:tarr) {
			t.start();
		}
		
		 // Wait for all threads to finish
//        for (Thread t : tarr) {
//            t.join();
//        }
		
		System.out.println(counter.getCount());
	}

}
