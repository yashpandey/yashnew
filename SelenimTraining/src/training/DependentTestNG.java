package training;

import org.testng.annotations.Test;

public class DependentTestNG {
	@Test(dependsOnMethods={"openBrowser"})
 public void signIn(){
	 System.out.println("This will allow user to sign in");
 }
	@Test
public void openBrowser(){
	System.out.println("This will open the browser");
}
@Test(dependsOnMethods={"signIn"})
public void logOut() {
	System.out.println("This will logout");
}
}
