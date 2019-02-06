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
	
	@Test
	public void testSpecialOffersH1() {
		assertThat(checkout.checkout("HHHHH"), equalTo(45));
	}
	@Test
	public void testSpecialOffersH2() {
		assertThat(checkout.checkout("HHHHHHHHHH"), equalTo(80));
	}
	@Test
	public void testSpecialOffersH3() {
		assertThat(checkout.checkout("HHHHHH"), equalTo(55));
	}
	@Test
	public void testSpecialOffersH4() {
		assertThat(checkout.checkout("HHHH"), equalTo(40));
	}
	@Test
	public void testSpecialOffersH5() {
		assertThat(checkout.checkout("HHHHHHHHHHH"), equalTo(90));
	}
	@Test
	public void testSpecialOffersK1() {
		assertThat(checkout.checkout("KKK"), equalTo(230));
	}
	@Test
	public void testSpecialOffersK2() {
		assertThat(checkout.checkout("KKKK"), equalTo(300));
	}
	@Test
	public void testSpecialOffersK3() {
		assertThat(checkout.checkout("KK"), equalTo(150));
	}
	@Test
	public void testSpecialOffersK4() {
		assertThat(checkout.checkout("KKKKK"), equalTo(380));
	}
	
	@Test
	public void testSpecialOffersN_M() {
		assertThat(checkout.checkout("NNNM"), equalTo(120));
	}
	
	@Test
	public void testSpecialOffersN2_M() {
		assertThat(checkout.checkout("NNN"), equalTo(120));
	}
	
	@Test
	public void testSpecialOffersN3_M() {
		assertThat(checkout.checkout("NNNNNNMM"), equalTo(240));
	}
	
	@Test
	public void testSpecialOffersP() {
		assertThat(checkout.checkout("PPPPP"), equalTo(200));
	}
	
	@Test
	public void testSpecialOffersP2() {
		assertThat(checkout.checkout("PPPPPP"), equalTo(250));
	}
	
	@Test
	public void testSpecialOffersQ() {
		assertThat(checkout.checkout("QQQ"), equalTo(80));
	}
	
	@Test
	public void testSpecialOffersQ2() {
		assertThat(checkout.checkout("QQQQ"), equalTo(110));
	}
	
	@Test
	public void testSpecialOffersR() {
		assertThat(checkout.checkout("RRRQ"), equalTo(150));
	}
	
	@Test
	public void testSpecialOffersR2() {
		assertThat(checkout.checkout("RRRRRRQQ"), equalTo(300));
	}
	
	@Test
	public void testSpecialOffersU1() {
		assertThat(checkout.checkout("UUUUUUUU"), equalTo(240));
	}
	@Test
	public void testSpecialOffersU2() {
		assertThat(checkout.checkout("UUUU"), equalTo(120));
	}
	
	@Test
	public void testSpecialOffersU3() {
		assertThat(checkout.checkout("UUUUUUUUUUUU"), equalTo(360));
	}
	
	@Test
	public void testSpecialOffersV1() {
		assertThat(checkout.checkout("VV"), equalTo(90));
	}
	@Test
	public void testSpecialOffersV2() {
		assertThat(checkout.checkout("VVV"), equalTo(130));
	}
	
	@Test
	public void testSpecialOffersV3() {
		assertThat(checkout.checkout("VVVV"), equalTo(180));
	}
	@Test
	public void testSpecialOffersV4() {
		assertThat(checkout.checkout("VVVVVV"), equalTo(260));
	}

}



