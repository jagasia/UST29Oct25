
public class App2 {

	public static void main(String[] args) {
		Mathematics<? super Number> maths=new Mathematics<>();
		maths.add(2, 1.4);
		maths.add(1.5f, 2);
		
		
	}

}
