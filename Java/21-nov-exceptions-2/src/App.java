import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		do {
			System.out.println("Enter the Id:");
		Integer id=sc.nextInt();
		try {
			emp.setId(id);
			break;
		}catch(InvalidIdException ex) {
			System.out.println(ex.getMessage()+"\nTry again");
		}
		}while(true);
		
		do {
			System.out.println("Enter the Name:");
			String name=sc.nextLine();
			if(name.equals(""))
				name=sc.nextLine();
		try {
			emp.setName(name);
			break;
		}catch(InvalidNameLengthException ex) {
			System.out.println(ex.getMessage()+"\nTry again");
		}
		}while(true);
		
		do {
			System.out.println("Enter the Department:");
			String department=sc.nextLine();
			if(department.equals(""))
				department=sc.nextLine();
		try {
			emp.setDepartment(department);
			break;
		}catch(InvalidDepartmentException ex) {
			System.out.println(ex.getMessage()+"\nTry again");
		}
		}while(true);
		
		
		do {
			System.out.println("Enter the salary:");
			Double salary=sc.nextDouble();
		try {
			emp.setSalary(salary);
			break;
		}catch(InvalidSalaryException ex) {
			System.out.println(ex.getMessage()+"\nTry again");
		}
		}while(true);
		
		System.out.println(emp);
	}

}
