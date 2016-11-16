package training;

import org.testng.annotations.Test;

public class Dependent {
  @Test (dependsOnMethods={"OpenBrowser"})
  public void signIn() {
	  System.out.println("This will ecexute second(signIn)");
  }
  @Test 
  public void openBrowser(){
	  System.out.println("This will execute first(openBrowser");
  }
  @Test (dependsOnMethods={"signIn"})
  public void logOut(){
	  System.out.println("This will execute last(logOut");
  }
}
