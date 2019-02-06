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
	public void testEmpty() {
		assertThat(checkout.checkout(""), equalTo(0));
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
		assertThat(checkout.checkout("D"), equalTo(15));
	}
	
	@Test
	public void testIllegalInput1() {
		assertThat(checkout.checkout("8907"), equalTo(-1));
	}
	
	@Test
	public void testIllegalInput2() {
		assertThat(checkout.checkout("Apple"), equalTo(-1));
	}
	@Test
	public void testSpecialOffersA() {
		assertThat(checkout.checkout("AAA"), equalTo(130));
	}
	
	@Test
	public void testSpecialOffersB() {
		assertThat(checkout.checkout("BB"), equalTo(45));
	}
	
	@Test
	public void testSpecialOffersE1() {
		assertThat(checkout.checkout("EE"), equalTo(80));
	}
	@Test
	public void testSpecialOffersA2() {
		assertThat(checkout.checkout("AAAAA"), equalTo(200));
	}
	
	@Test
	public void testSpecialOffersA3() {
		assertThat(checkout.checkout("AAAAAAAA"), equalTo(330));
	}
	
	@Test
	public void testSpecialOffersE2() {
		assertThat(checkout.checkout("EEB"), equalTo(80));
	}
	
	@Test
	public void testSpecialOffersE2_B() {
		assertThat(checkout.checkout("EEBBB"), equalTo(125));
	}
	
	@Test
	public void testSpecialOffersE3_B() {
		assertThat(checkout.checkout("EEBB"), equalTo(110));
	}
	
	@Test
	public void testSpecialOffersF1() {
		assertThat(checkout.checkout("FF"), equalTo(20));
	}
	
	@Test
	public void testSpecialOffersF2() {
		assertThat(checkout.checkout("FFF"), equalTo(20));
	}
	
	@Test
	public void testSpecialOffersF3() {
		assertThat(checkout.checkout("FFFFFF"), equalTo(40));
	}
	@Test
	public void testSpecialOffersF4() {
		assertThat(checkout.checkout("FFFFFFF"), equalTo(50));
	}
	
	@Test
	public void testSpecialOffersF5() {
		assertThat(checkout.checkout("FFFFFFFFF"), equalTo(60));
	}
	
	@Test
	public void testSpecialOffersF6() {
		assertThat(checkout.checkout("FFFFFFFF"), equalTo(60));
	}


}

