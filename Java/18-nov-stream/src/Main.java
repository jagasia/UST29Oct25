import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1L, "Alice Johnson", "IT", 75000.0));
        employees.add(new Employee(2L, "Bob Martinez", "HR", 62000.0));
        employees.add(new Employee(3L, "Charlie Kim", "Finance", 83000.0));
        employees.add(new Employee(4L, "Diana Lopez", "Marketing", 68000.0));
        employees.add(new Employee(5L, "Ethan Walker", "IT", 77000.0));
        employees.add(new Employee(6L, "Fiona Patel", "Operations", 71000.0));
        employees.add(new Employee(7L, "George Brown", "IT", 90000.0));
        employees.add(new Employee(8L, "Hannah Davis", "Finance", 81000.0));
        employees.add(new Employee(9L, "Ian Thompson", "HR", 60000.0));
        employees.add(new Employee(10L, "Julia Smith", "Marketing", 69500.0));

//        employees.stream()
//        .filter((e)->e.getDepartment().equals("Finance"))
//        .forEach(System.out::println);
//        
        
//        employees.stream()
//        .sorted((e1, e2)->e1.getName().compareTo(e2.getName()))
//        .forEach(System.out::println);
        
//        employees.stream()
//        .map((e)->e.getName().toUpperCase())
//        .forEach(System.out::println);
        
        //display the departments and the sum of their salaries
        
        Map<String, Double> map = employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        
        for(Entry<String, Double> e:map.entrySet()) {
        	System.out.format("%-20s\t%.2f\n", e.getKey(),e.getValue());
        }
    }
}
