import java.util.Scanner;

public class AppLongestSeq {

	public static void main(String[] args) {
		//get inputs
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//lets start logic here
		int count = 0;
		int largest=Integer.MIN_VALUE;
		int startIndex=-1;
		int startIndexOfLargest=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0)
			{
				count++;
				if(count==1) {
					startIndex=i;
				}
				if(count>largest) {
					largest=count;
					startIndexOfLargest=startIndex;
				}
				
			}else {
				count=0;
			}
		}
		System.out.println(largest);
		System.out.println(startIndexOfLargest);
	}

}
