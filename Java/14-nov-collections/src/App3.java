import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) throws ParseException {
		List<Product> list=new ArrayList<>();
		//dd-MMM-yyyy
		list.add(new Product(15L, "Pencil", "Stationary", "11-Nov-2025"));
		list.add(new Product(1L, "Pen", "Stationary", "04-Nov-2025"));
		list.add(new Product(12L, "Sharpner", "Stationary", "14-Sep-2025"));
		list.add(new Product(31L, "Eraser", "Stationary", "14-Nov-2024"));
		list.add(new Product(14L, "Scale", "Stationary", "14-Nov-2000"));
		list.add(new Product(55L, "Special Laddu", "Food", "13-Nov-2025"));
		list.add(new Product(16L, "Veg Fried rice", "Food", "14-Nov-2025"));
		list.add(new Product(7L, "Malabar Parotta", "Food", "14-Nov-2025"));
		
//		for(Product p:list) {
//			if(p.getId().equals(14L))
//				list.remove(p);
//			else
//				System.out.println(p);
//		}
//
//		Collections.sort(list);
		
		Scanner sc=new Scanner(System.in);
		int choice=-1;
		do {
			System.out.println("1) Sort by Id\r\n"
					+ "2) Sort by Id Desc\r\n"
					+ "3) Sort by Name\r\n"
					+ "4) Sort by MfgDate\r\n"
					+ "5) Sort by Category\r\n"
					+ "");
			choice=sc.nextInt();
			switch(choice) {
			case 1:	//id
				Collections.sort(list);
				break;
			case 2: //id desc
				Collections.sort(list, new ProductIdDescComparator());
				break;
			case 3: //name
				System.out.println("Under construction");
				break;
			case 4: //mfgDate
				System.out.println("Coming soon...");
				break;
			case 5: //category
				Collections.sort(list, new ProductCategoryComparator());
				break;
			default:
				return;
			}
			Iterator<Product> it = list.iterator();
			while(it.hasNext()) {
				Product p = it.next();
				if(p.getId().equals(14L))
					it.remove();
				else
					System.out.println(p);
			}
		}while(true);
		
		
		
	}

}
