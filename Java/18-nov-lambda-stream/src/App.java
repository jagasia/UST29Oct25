import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NumDescComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
	
}

public class App {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(11,1,22,2,5,3,4);
//		Collections.sort(nums,new NumDescComparator());
		Collections.sort(nums, (x,y)-> y.compareTo(x));
		System.out.println(nums);
	}

}

