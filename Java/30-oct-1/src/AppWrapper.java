import java.util.Scanner;

public class AppWrapper {

	public static void main(String[] args) {
		char c;
		Scanner sc=new Scanner(System.in);
		c=sc.next().charAt(0);
		
		if(Character.isLetter(c)) {
			System.out.println("Alphabet");
		}else if(Character.isDigit(c)) {
			System.out.println("Number");
		}else {
			System.out.println("Are you entering a symbol?");
		}
		
	}

}
