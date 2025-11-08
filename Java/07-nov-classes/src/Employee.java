public class Employee {
	private Long id;
	private String name;
	
	public Employee() {
		System.out.println("No arg construction");
	}

	public Employee(Long id) {		
		this();
		
		this.id = id;
		
	}
	
	public Employee(Long id, String name) {		
		this(id);
		this.name = name;
		System.out.println("2 args constructor");
	}

	public Long getId() {		
		return id;
	}
	
	public void setId(Long id) {
		//if conditions
		//reject or approve
		this.id = id;
	}
	
	public void method1() {
		this.id=20L;
	}
	
}
