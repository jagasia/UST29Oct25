import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.CSVReader;

public class App2 {

	public static void main(String[] args) {
		try(Reader reader=Files.newBufferedReader(Paths.get("emp.csv"))){
			try(CSVReader cr=new CSVReader(reader)){
				cr.forEach(System.out::println);
			}
		}catch(Exception ex) {
			
		}
	}

}
