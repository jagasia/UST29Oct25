
public class MyThread extends Thread
{
	FibanocciGenerator fg;
	
	public MyThread(FibanocciGenerator fg) {
		this.fg=fg;
		this.fg.name=getName();
	}
	
	public void run() {
		fg.generate(getName());
	}
}
