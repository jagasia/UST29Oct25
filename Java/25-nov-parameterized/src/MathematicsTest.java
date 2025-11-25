
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MathematicsTest {
	Mathematics maths=new Mathematics();
	int no1=0;
	int no2=0;
	float result=0.0f;
	
	public MathematicsTest(int no1, int no2, float result) {
		this.no1=no1;
		this.no2=no2;
		this.result=result;
	}
	
	@Parameterized.Parameters
	public static Collection parameters(){
		return Arrays.asList(new Object[][] {
			{2,3,5},
			{5,3,8},
			{120,3,123},
			{4,9,13},
			{40,9,49},
			{1,9,10}
		});
	}
	
	@Test
	public void test1() {
		maths.setNo1(no1);
		maths.setNo2(no2);
		maths.addNumbers();
		Float actual = maths.getResult();
		float expected = result;
		assertEquals(expected, actual,0);
	}
}
