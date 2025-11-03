public class Employee implements Comparable<Employee> {
    int id;
    String name;
    String department;
    double salary;
    int yearsOfExperience;
    boolean isRemote;
    String favoriteSnack;

    // Constructor with arguments
    Employee(int id, String name, String department, double salary,
             int yearsOfExperience, boolean isRemote, String favoriteSnack) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
        this.isRemote = isRemote;
        this.favoriteSnack = favoriteSnack;
    }

	@Override
	public int compareTo(Employee o) {
		if(this.department.compareTo(o.department)==0) {
			return this.name.compareTo(o.name);
		}else {
			return this.department.compareTo(o.department);
		}
	}

    
}
