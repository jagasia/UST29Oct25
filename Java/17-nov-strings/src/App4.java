import java.util.Arrays;
import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		String ip=new Scanner(System.in).nextLine();
		String[] arr = ip.split("\\.");
		System.out.println(Arrays.toString(arr));
	}

}
