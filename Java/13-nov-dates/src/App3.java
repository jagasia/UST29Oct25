import java.time.LocalDate;
import java.time.Period;

public class App3 {

	public static void main(String[] args) {
		LocalDate dt1=LocalDate.of(2003, 6, 1);
		LocalDate dt2=LocalDate.now();
		Period result = Period.between(dt1, dt2);
		System.out.printf("You are %d year(s), %d month(s) and %d day(s) young",result.getYears(), result.getMonths(), result.getDays());
	}

}
