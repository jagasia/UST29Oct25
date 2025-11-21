import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppWrite {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Id:");
		Long id=sc.nextLong();
		System.out.println("Name:");
		String name=sc.nextLine();
		if(name.equals(""))
			name=sc.nextLine();
		System.out.println("Department:");
		String department=sc.nextLine();
		System.out.println("Salary:");
		Double salary=sc.nextDouble();
		
		FileWriter fw=new FileWriter("emp.csv");
		fw.write(id+"");
		fw.write(',');
		fw.write(name);
		fw.write(',');
		fw.write(department);
		fw.write(',');
		fw.write(salary+"");
		fw.write('\n');
		fw.flush();
		fw.close();
		System.out.println("The entry is added to the file");
		
	}

}
