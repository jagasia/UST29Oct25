import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		String input=new Scanner(System.in).nextLine();
		//to store this input into a java.util.Date object
		Date dt=new Date();
		//we need a method to convert String into java.util.Date
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		sdf.setLenient(false);
		dt=sdf.parse(input);
		sdf=new SimpleDateFormat("EEEE dd-MMM-yy");
		System.out.println(sdf.format(dt));
	}

}
