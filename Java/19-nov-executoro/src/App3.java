import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App3 {

	public static void main(String[] args) {
//		ExecutorService executor = Executors.newSingleThreadExecutor();
//		ExecutorService executor = Executors.newFixedThreadPool(2);
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.submit(()->{
			for(int i=0;i<5;i++) {
				try {
					System.out.println("ONE");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	
		
		executor.submit(()->{
			for(int i=0;i<5;i++) {
				try {
					System.out.println("TWO");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		for(int i=0;i<5;i++) {
			try {
				System.out.println("Main");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
