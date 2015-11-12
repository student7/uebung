import org.junit.Test;
import junit.framework.Assert;

public class MainTest {

	@Test
	public void testPrintHelloWorld() {
		Main test = new Main();
		Assert.assertEquals(test.getHelloWorld(), "Hello World");

	}

}