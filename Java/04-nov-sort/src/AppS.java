import java.util.Arrays;

public class AppS{
	private static void squareIt(int ...arr){
		for(int i=0;i<arr.length;i++){
			//arr[i]=arr[i]*arr[i];
			arr[i]=(int) Math.pow(arr[i],2);
		}
	}
	public static void main(String []args){
		int []numbers={1,2,3,4,5,6};
		squareIt(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}