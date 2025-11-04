import java.util.Arrays;
import java.util.LinkedHashSet;

public class App5 {

	public static int[] removeDuplicates(int[] arr) {
		Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(boxed));
		int[] result = set.stream().mapToInt(Integer::intValue).toArray();
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 4, 5, 3, 6, 1, 1, 7 };
		arr = removeDuplicates(arr);
		System.out.println(Arrays.toString(arr));
	}
}