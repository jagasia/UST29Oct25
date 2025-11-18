import java.util.Arrays;

public class AppAnagrams {

	public static void main(String[] args) {
		String str1="team";
		String str2="meta";
		
		//convert the string into char array
		char []arr1=str1.toCharArray();
		char []arr2=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String strSorted1=new String(arr1);
		String strSorted2=new String(arr2);
				
		System.out.println(Arrays.equals(arr1, arr2));
	}

}
