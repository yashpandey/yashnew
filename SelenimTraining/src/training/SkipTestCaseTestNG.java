package training;

import org.testng.annotations.Test;

public class SkipTestCaseTestNG {
  @Test(priority=0)
  public void Zere() {
	  System.out.println("This is test zero");
  }
  @Test(priority=1,enabled=false)
  public void One() {
	System.out.println("This is test one");
}
  @Test(priority=2)
  public void Two() {
	System.out.println("This is test tow");
}
}
