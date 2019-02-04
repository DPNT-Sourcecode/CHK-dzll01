package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HelloSolutionTest {
	
	private HelloSolution greet;
	
	@Before
    public void setUp() {

        greet = new HelloSolution();
    }

	@Test
	public void testHelloWorld() {
		assertThat(greet.hello("Mark"), equalTo("Hello World"));
	}

}

