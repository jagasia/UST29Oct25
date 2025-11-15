import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class Product implements Comparable<Product> {
	private Long id;
	private String name;
	private String category;
	private Date mfgDate;
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
	
	public Product() {}
	
	public Product(Long id, String name, String category, Date mfgDate) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.mfgDate = mfgDate;
	}
	
	public Product(Long id, String name, String category, String dateStr) throws ParseException {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		
		this.mfgDate = sdf.parse(dateStr);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", mfgDate=" + sdf.format(mfgDate) + "]";
	}
	
	



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.getId().compareTo(o.getId());
	}
	
}
