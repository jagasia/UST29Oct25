import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<String> countries=new HashSet<>();
		countries.add("India");
		countries.add("Pakistan");
		countries.add("Sri lanka");
		countries.add("China");
		countries.add("Bangladesh");
		countries.add("China");
		countries.add("Afghanistan");
		countries.add("Indonesia");
		countries.add("Italy");
		
		for(String c:countries) {
			System.out.println(c);
		}
		
	}

}
