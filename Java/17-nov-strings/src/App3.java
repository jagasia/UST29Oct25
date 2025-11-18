import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		String eid=new Scanner(System.in).nextLine();
		System.out.println((eid.matches("E[0-9]{3}")?"Valid":"Invalid"));
		
	}

}
