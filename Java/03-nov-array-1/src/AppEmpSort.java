import java.util.Arrays;
import java.util.Comparator;

class NameDescComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e2.name.compareTo(e1.name);
	}
	
}


public class AppEmpSort {

	public static void main(String[] args) {
        Employee[] employees = new Employee[20];

        employees[0] = new Employee(1, "Alice", "Engineering", 95000, 5, true, "Chips");
        employees[1] = new Employee(2, "Bob", "HR", 70000, 3, false, "Cookies");
        employees[2] = new Employee(3, "Charlie", "Marketing", 80000, 6, true, "Granola Bar");
        employees[3] = new Employee(4, "Diana", "Engineering", 120000, 10, false, "Fruit");
        employees[4] = new Employee(5, "Ethan", "Sales", 78000, 4, true, "Trail Mix");
        employees[5] = new Employee(6, "Fiona", "Finance", 110000, 8, false, "Pretzels");
        employees[6] = new Employee(7, "George", "IT", 88000, 5, true, "Chocolate");
        employees[7] = new Employee(8, "Hannah", "Design", 83000, 4, false, "Muffin");
        employees[8] = new Employee(9, "Ian", "Engineering", 99000, 6, true, "Popcorn");
        employees[9] = new Employee(10, "Jane", "Support", 65000, 2, false, "Biscuits");
        employees[10] = new Employee(11, "Kyle", "Sales", 87000, 5, true, "Donuts");
        employees[11] = new Employee(12, "Lara", "Marketing", 94000, 7, false, "Chips");
        employees[12] = new Employee(13, "Mike", "Engineering", 105000, 9, true, "Protein Bar");
        employees[13] = new Employee(14, "Nina", "HR", 71000, 3, false, "Granola");
        employees[14] = new Employee(15, "Oscar", "Finance", 115000, 11, true, "Crackers");
        employees[15] = new Employee(16, "Paula", "Design", 85000, 4, true, "Cookies");
        employees[16] = new Employee(17, "Quinn", "Engineering", 98000, 6, false, "Trail Mix");
        employees[17] = new Employee(18, "Rita", "Support", 67000, 2, true, "Candy");
        employees[18] = new Employee(19, "Sam", "Sales", 89000, 5, false, "Donuts");
        employees[19] = new Employee(20, "Tina", "Finance", 100000, 7, true, "Fruit");

        Arrays.sort(employees);
        
        System.out.printf("%-4s %-12s %-15s %-10s %-5s %-10s %-12s%n",
                "ID", "Name", "Department", "Salary", "Exp", "Remote", "Snack");
        System.out.println("-------------------------------------------------------------------");

        // Print employee data in aligned format
        for (Employee e : employees) {
            System.out.printf("%-4d %-12s %-15s $%-9.2f %-5d %-10b %-12s%n",
                    e.id, e.name, e.department, e.salary, e.yearsOfExperience, e.isRemote, e.favoriteSnack);
        }
    }

}
