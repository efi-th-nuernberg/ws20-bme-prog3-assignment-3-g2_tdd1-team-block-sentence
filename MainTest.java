import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest{

@Test
public void testNothing() {}

@Test
public void testSomeStuff(){
 
   assertEquals("Main.sum ist fehlerhaft.", 5, Main.sum(2,3));
   assertTrue("Main.isBigger ist fehlerhaft.", Main.isBigger(5,4));
    assertFalse("Main.isBigger ist fehlerhaft.", Main.isBigger(2,2));
  String str = "hallo";
  assertNotNull("String ist fehlerhaft.", str );
 }}
 
  