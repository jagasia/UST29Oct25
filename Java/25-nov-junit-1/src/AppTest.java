import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AppTest {

	public static void main(String[] args) {
		Result x = JUnitCore.runClasses(MathematicsTest.class);
		System.out.println(x.getFailureCount());
		List<Failure> failures = x.getFailures();
		for(int i=0;i<x.getFailureCount();i++) {
			System.out.println(failures.get(i).getMessage());
		}
		
	}

}
