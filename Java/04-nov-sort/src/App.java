import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int []arr= {61,27,83,49,15};
		int n=arr.length;

		for(int pass=0;pass<n-1;pass++) {
			for(int i=0;i<n-1-pass;i++) {
				if(arr[i]>arr[i+1]) {
					//swap
					System.out.printf("arr[%d] > arr[%d]. So swapping\n",i,i+1);
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				
			}
			System.out.println("End of pass:"+pass);
			System.out.println(Arrays.toString(arr));
		}
	}

}
