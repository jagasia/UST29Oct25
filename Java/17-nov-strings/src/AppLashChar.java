import java.util.Arrays;
import java.util.Scanner;

public class AppLashChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		char []arr=new char[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.next().charAt(0);
		}
		
		int n=sc.nextInt();
		
		int count=0;
		char result='\0';
		for(int i=0;i<len;i++) {
			count=0;
			for(int j=0;j<len;j++) {
				if(arr[i]==arr[j])
					count++;
			}	
			if(count==n) {
				result=arr[i];
			}
		}
		System.out.println((result!='\0')?result:-1);
	}

}
