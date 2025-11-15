import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App2 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(31);
		list.add(14);
		list.add(51);
		list.add(16);
		list.add(71);
		list.add(18);
		list.add(91);
		list.add(110);
		list.add(11);
		
		//to sort the elements of list?
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
