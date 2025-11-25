/**
 * 
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * 
 */
public class MathematicsTest {
	Mathematics maths;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		maths=new Mathematics();
		maths.setNo1(2);
		maths.setNo2(3);
		System.out.println("Now, before method is called");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("After method is called");
	}

	/**
	 * Test method for {@link Mathematics#addNumbers()}.
	 */
	@Test
//	@Ignore
	@Category(Add.class)
	public void testAddNumbers() {
		float expected=5.0f;
		maths.addNumbers();
		float actual=maths.getResult();
		assertEquals(expected, actual,0);
	}

	/**
	 * Test method for {@link Mathematics#subtractNumbers()}.
	 */
	@Test
//	@Ignore
	@Category(Subtract.class)
	public void testSubtractNumbers() {
		maths.subtractNumbers();
		assertEquals(-15.0f, maths.getResult(),0);

	}

}
