import java.util.Comparator;

public class ProductIdDescComparator implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o2.getId().compareTo(o1.getId());
	}

}
