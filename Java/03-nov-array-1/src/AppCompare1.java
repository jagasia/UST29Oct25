import java.util.Arrays;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
	
}

public class AppCompare1 {

	public static void main(String[] args) {
		Integer[] numbers = {42, 17, 89, 3, 56, 74, 22, 91, 65, 8,
                37, 49, 70, 14, 28, 93, 5, 61, 77, 10};
		
		//sort these numbers in descending order
		MyComparator comparator=new MyComparator();
		Arrays.sort(numbers, comparator);
		
		System.out.println(Arrays.toString(numbers));
	}

}
