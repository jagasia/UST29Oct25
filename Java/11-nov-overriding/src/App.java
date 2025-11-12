import java.util.Objects;

class Employee{
	private Long id;
	private String name;
	private Long experience;
	
	public Employee(){}
	
	public Employee(Long id, String name, Long experience) {
		super();
		this.id = id;
		this.name = name;
		this.experience = experience;
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
	public Long getExperience() {
		return experience;
	}
	public void setExperience(Long experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", experience=" + experience + "]";
	}


	@Override
	public boolean equals(Object o) {
		Employee arg=(Employee) o;
		return this.getId().equals(arg.getId())
	}
	
	
}

public class App {

	public static void main(String[] args) {
		Employee e1=new Employee(1L, "Raja", 10L);
		Employee e2=new Employee(1L, "Raja", 10L);
		
		if(e1.equals(e2)) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}
		
	}

}
