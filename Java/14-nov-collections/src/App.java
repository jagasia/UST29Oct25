import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("India");
		list.add("China");
		list.add("Sri lanka");
		list.add("Pakistan");
		list.add("China");
		list.add("USA");
		list.add("Bangladesh");
		list.add(1, "Afghanistan");
		
		
		System.out.println(list);
		
	}

}
