import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	private static void display(List<? extends Number> list) {
		for(Number n : list) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		List<? super Number> list=new ArrayList<>();
		list.add(1);
		list.add(1.5);
//		list.add(new Byte(20));
		list.add(20L);
		list.add(2.5f);
		
		
//		for(Object x: list) {
//			System.out.println(x);
//		}
		
		
		List<Number> list2=Arrays.asList(1,2,3,4,5,6,7);
		display(list2);
		
	}

}
