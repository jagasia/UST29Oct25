import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class App2 {

	private static Product updateProduct(Integer id) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name:");
		String name = sc.nextLine();
		if (name.equals(""))
			name = sc.nextLine();
		System.out.println("Category:");
		String category = sc.nextLine();
		if (category.equals(""))
			category = sc.nextLine();
		System.out.println("Price:");
		Double price = sc.nextDouble();

		return new Product(id, name, category, price);
	}

	private static Product createProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Id:");
		Integer id = sc.nextInt();
		return updateProduct(id);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Product> products=new ArrayList<>();
		int choice=-1;
		do {
			System.out.println("1: Add Product\r\n"
					+ "2: Update Product\r\n"
					+ "3: Remove Product\r\n"
					+ "4: Display all products\r\n"
					+ "5: Find Product by Id\r\n"
					+ "6: Find Products by Categories\r\n"
					+ "7: Find the count of products by Category");
			choice=sc.nextInt();
			Product product=null;
			Integer id=-1;
			String category="";
			boolean isFound=false;
			Iterator<Product> it =null;
			switch(choice) {
			case 1:		//add
				product=createProduct();
				products.add(product);
				break;
			case 2: 	//update
				System.out.println("Enter the id of the product to update:");
				id=sc.nextInt();
				
				for(Product p : products) {
					if(p.getId().equals(id)) {
						product=updateProduct(id);
						p=product;
						isFound=true;
						break;
					}
				}
				if(!isFound) {
					System.out.println("Sorry, no such product!");
				}
				break;
			case 3:		//remove
				System.out.println("Enter the id of the product to delete:");
				id=sc.nextInt();
				
				it = products.iterator();
				while(it.hasNext()) {
					Product p = it.next();
					if(p.getId().equals(id)) {
						//found
						isFound=true;
						it.remove();
						break;
					}
				}
				if(!isFound) {
					System.out.println("Sorry, no such product!");
				}
				break;
			case 4:		//display all
				it = products.iterator();
				while(it.hasNext()) {
					Product p = it.next();
					System.out.println(p);
				}
				break;
			case 5: 	//find by id
				it = products.iterator();
				while(it.hasNext()) {
					Product p = it.next();
					if(p.getId().equals(id)) {
						System.out.println(p);
						break;
					}
				}
				if(!isFound) {
					System.out.println("Sorry, no such product!");
				}
				break;
			case 6:		//by categories
				System.out.println("Enter the category to search:");
				category=sc.nextLine();
				if(category.equals(""))
					category=sc.nextLine();
				while(it.hasNext()) {
					Product p = it.next();
					if(p.getCategory().equals(category)) {
						System.out.println(p);
						break;
					}
				}
				if(!isFound) {
					System.out.println("Sorry, no such product!");
				}
				break;
			case 7:		//count by categories
				Map<String, Integer> map = getProductsCountByCategory(products);
				for(Entry<String, Integer> e:map.entrySet()) {
					System.out.println(e.getKey()+"\t"+e.getValue());
				}
				break;
			default:
				return;
			}
		}while(true);
	}

	private static Map<String, Integer> getProductsCountByCategory(List<Product> products) {
		Map<String, Integer> map=new TreeMap<>();
		for(Product p : products) {
			map.put(p.getCategory(), map.getOrDefault(p.getCategory(), 0)+1);
		}
		return map;
	}

}
