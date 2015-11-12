
package fhb;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import static org.junit.Assert.*;


/**
* Unit test for simple App.
*/
public class AppIT 
  extends TestCase
{
	
	
  /**
   * Create the test case
   * @param testName name of the test case
   */
  public AppIT( String testName )
  {
      super( testName );
      
  }

  /**
   * @return the suite of tests being tested
   
  public static Test suite()
  {
      return new TestSuite( AppTest.class );
  }
*/
  /**
   * Rigourous Test :-)
   */
  public void testApp()
  {
      assertTrue( true );
  }
  
  @Test 
  public void testHello(){
  	App myApp = new App();
  	assertEquals(myApp.getHelloWorld2(),"Hello World 2");
  }
  
}

