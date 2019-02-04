package befaster.solutions.CHK;

import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CheckoutSolutionTest {
	
	private CheckoutSolution checkout;

	@Before
	public void setUp() throws Exception {
		checkout = new CheckoutSolution();
	}

	@Test
	public void testA() {
		assertThat(checkout.checkout("A"), equalTo(50));
	}
	@Test
	public void testB() {
		assertThat(checkout.checkout("B"), equalTo(30));
	}
	
	@Test
	public void testC() {
		assertThat(checkout.checkout("C"), equalTo(20));
	}
	
	@Test
	public void testD() {
		assertThat(checkout.checkout("D"), equalTo(10));
	}
	
	@Test
	public void testOthersExample1() {
		assertThat(checkout.checkout("T"), equalTo(-1));
	}
	
	@Test
	public void testOthersExample2() {
		assertThat(checkout.checkout("Apple"), equalTo(-1));
	}

}

