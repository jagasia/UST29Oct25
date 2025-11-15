import java.util.Comparator;

public class ProductCategoryComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getCategory().compareTo(o2.getCategory());
	}

}
