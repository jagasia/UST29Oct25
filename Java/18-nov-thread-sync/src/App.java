
public class App {

	public static void main(String[] args) {
		FibanocciGenerator fg = new FibanocciGenerator("T1", 15);
		MyThread t1=new MyThread(fg);
		MyThread t2=new MyThread(fg);
		
		t1.setName("T1");
		t1.start();
		t2.setName("T2");
		t2.start();
	}

}
