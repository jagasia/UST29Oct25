import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App5 {

	public static void main(String[] args) {
		String str=new Scanner(System.in).nextLine();
		Pattern pattern = Pattern.compile("\\d{10}");
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
