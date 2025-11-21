
public class Employee {
	private Integer id;
	private String name;
	private String department;
	private Double salary;
	
	public Employee() {}

	public Employee(Integer id, String name, String department, Double salary) {
		super();
		setId(id);
		setName(name);
		setDepartment(department);
		setSalary(salary);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		if(id<100000 || id>999999) {
			throw new InvalidIdException(id+" is invalid!");
		}
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()<3) {
			throw new InvalidNameLengthException(name+" is less than 3 letters!");
		}
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		switch(department) {
			case "IT":
			case "CSE":
			case "AI & DS":
			case "ECE":
			break;
			default:
				throw new InvalidDepartmentException(department+" is invalid");
		}
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		if(salary<0)
			throw new InvalidSalaryException(salary+" is invalid");
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
}
