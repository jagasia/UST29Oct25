import java.util.Arrays;

public class AppSelection {

	public static int findIndexOfLargestAndSmallest(int arr[], int pass) {
		int smallest=Integer.MAX_VALUE;
		int index=-1;
		for(int i=pass;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
				index=i;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
//		int []arr= {51,26,73,48,95,61,17,84,29,13};
		int []arr= {1,2,3,4,5,6,7,8,9,10};
		
		int n=arr.length;
		for(int pass=0;pass<n-1;pass++) {
			System.out.println("Pass #"+pass);
			//find the largest and smallest index
			int smallestIndex=findIndexOfLargestAndSmallest(arr, pass);
			//swap the element at smallestIndex with element at pass index;
			int temp=arr[pass];
			arr[pass]=arr[smallestIndex];
			arr[smallestIndex]=temp;
			System.out.println("Array after pass#: "+pass+" is \n"+Arrays.toString(arr));
		}
	}

}
