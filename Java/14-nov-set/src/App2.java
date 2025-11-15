import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

public class App2 {

	public static void main(String[] args) throws ParseException {
		Set<Product> set=new HashSet<>();
		set.add(new Product(15L, "Pencil", "Stationary", "11-Nov-2025"));
		set.add(new Product(1L, "Pen", "Stationary", "04-Nov-2025"));
		set.add(new Product(12L, "Sharpner", "Stationary", "14-Sep-2025"));
		set.add(new Product(31L, "Eraser", "Stationary", "14-Nov-2024"));
		set.add(new Product(1L, "Pen", "Stationary", "04-Nov-2025"));
		set.add(new Product(14L, "Scale", "Stationary", "14-Nov-2000"));
		set.add(new Product(55L, "Special Laddu", "Food", "13-Nov-2025"));
		set.add(new Product(1L, "Pen", "Stationary", "04-Nov-2025"));
		set.add(new Product(16L, "Veg Fried rice", "Food", "14-Nov-2025"));
		set.add(new Product(7L, "Malabar Parotta", "Food", "14-Nov-2025"));
		for(Product p:set)	System.out.println(p);
	}

}
