
public class App {

	public static void main(String[] args) throws InterruptedException {
		FibanocciGenerator t1=new FibanocciGenerator("Thread 1", 20);
		FibanocciGenerator t2=new FibanocciGenerator("Thread 2", 20);
		FibanocciGenerator t3=new FibanocciGenerator("Thread 3", 10);
		FibanocciGenerator t4=new FibanocciGenerator("Thread 4", 10);
		
		t1.start();
		t2.start();
//		t2.join();			//
		t3.start();
		t3.join(); 			//
		t4.start();
	}

}
