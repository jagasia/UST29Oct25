import java.util.Arrays;
import java.util.LinkedHashSet;

public class App51 {

	private static boolean isFound(int arr[], int element) {
		boolean result=false;
		for(int x : arr) {
			if(x==element) {
				result=true;
				break;
			}
		}
		return result;
	}
	
	public static int[] removeDuplicates(int[] arr) {
		int temp[]=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			//check if current element is found in the result array or not.
			if(!isFound(temp, arr[i])) {
			//if not then only add.
				temp[index++]=arr[i];
			}
		}
		
		//result array size to be trimmed
		int result[]=new int[index];
		result=Arrays.copyOf(temp, index);
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 22, 3, 3, 4, 5, 3, 6, 1, 1, 7 };
		arr = removeDuplicates(arr);
		System.out.println(Arrays.toString(arr));
	}
}


