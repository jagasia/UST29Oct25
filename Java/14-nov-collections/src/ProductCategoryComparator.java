import java.util.Comparator;

public class ProductCategoryComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getCategory().equals(o2.getCategory())) {
			return o2.getId().compareTo(o1.getId());
		}else
		{
			return o1.getCategory().compareTo(o2.getCategory());
		}
	}

}
