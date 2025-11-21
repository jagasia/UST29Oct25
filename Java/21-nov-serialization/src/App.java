import java.io.FileNotFoundException;
import java.io.FileReader;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("emp.csv");
//		CSVReaderBuilder cr = new CSVReaderBuilder(fr);
		
		
		
		
		
		CsvToBean<Employee> ctb=new CsvToBeanBuilder<Employee>(fr).withType(Employee.class).build();
		
//		ctb.setCsvReader(cr);
		ctb.forEach(System.out::println);
	}

}
