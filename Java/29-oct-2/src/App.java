import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//how to find if a given number is prime or not
		//get input number from the user.
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		//if the input is <=3, say "Prime"
		if(input<=3) {
			System.out.println("Prime number");
			return;
		}
		//if not, 4 onwards, will undergo this verification
		//loop denominators from 2 onwards until it is sqrt of n
		for(int i=2;i<=Math.sqrt(input);i++) {
			if(input%i==0) {
				//conclusion. It cannot be a prime number
				System.out.println("Not a prime number");
				return;
			}
		}
		System.out.println("Prime number");
	}

}
