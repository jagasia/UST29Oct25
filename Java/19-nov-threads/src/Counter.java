
public class Counter {
	private Integer count=0;
//	final Lock rl=new ReentrantLock();
	
	public synchronized void increment() {
		
		try {
//			rl.lock();
			count++;
		}
		finally {
//		rl.unlock();
		}
	}
	
	public Integer getCount() {
		return count;
	}
	
}
