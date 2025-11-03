import java.util.Scanner;

public class AppLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements?");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.printf("Give input for index: %d",i);
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Finding largest element of the array...");
		int largest = Integer.MIN_VALUE;
		for(int x:arr) {
			if(x>largest) {
				largest=x;
			}
		}
		System.out.printf("Found. The largest element is: %d",largest);
	}

}
