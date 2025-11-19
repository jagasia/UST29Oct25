
public class App {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new One());
		Thread t2=new Thread(new Two());
		Thread t3=new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println("This is lambda: "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(Thread.MIN_PRIORITY);
//		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("Priority:"+t1.getPriority());
		t3.start();
		t1.setName("Gokul C");
		t1.start();
		t2.setName("Gokul K");
		t2.start();
		
		for(int i=0;;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
