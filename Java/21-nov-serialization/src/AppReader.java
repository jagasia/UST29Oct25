import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppReader {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("emp.csv");
		Long idLong=0L;
		String name="UnKnown";
		String department="UnKnown";
		Double salary=0.0;
		
		BufferedReader br=new BufferedReader(fr);
		String str=br.readLine();
		System.out.println(str);
		String[] arr = str.split(",");
		Employee emp=new Employee(Long.parseLong(arr[0]), arr[1], arr[2], Double.parseDouble(arr[3]));
		System.out.println(emp);
	}

}
