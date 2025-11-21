
public class Bank {
	public String withdraw(int amount) throws InvalidAmountException   {
		if(amount<40000) {
			return "Remember to collect the cash";
		}else {
			
				throw new InvalidAmountException(amount+" is greater than the allowed limit of 40k");
//				System.out.println("This is unreachable code");
		}
		
	}
}
