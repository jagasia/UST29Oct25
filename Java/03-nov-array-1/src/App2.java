import java.util.Arrays;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1={61,27,83,49,15};
		System.out.println(arr1.length);
		System.out.println(Arrays.toString(arr1));
		arr1=new int[6];
		System.out.println(arr1.length);
		System.out.println(Arrays.toString(arr1));
		
		String str="hello";
		str="world";
		String str2=new Scanner(System.in).nextLine();
		System.out.println(str2);
	}

}
