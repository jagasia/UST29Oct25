class Employee {
    Long id;
    String name;
    String department;
    static final String COMPANY_NAME = "UST Healthproof";

    public void display() {
        // display all of them
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    // create a static method to display company name
    public static void displayCompanyName() {
        System.out.println("Company Name: " + COMPANY_NAME);
    }

    // create a toString method

    public String toString(String str) {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
    }
}

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.id = 101L;
        emp.name = "John Doe";
        emp.department = "Engineering";
        // emp.display();
        // emp.displayCompanyName();
        System.out.println(emp);

    }
}