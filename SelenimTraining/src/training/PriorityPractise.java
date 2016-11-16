package training;

import org.testng.annotations.Test;

public class PriorityPractise {
  @Test(priority=1)
  public void One() {
	  System.out.println("This will be executed first");
  }
  @Test(priority=2)
  public void two(){
	  System.out.println("This will be executed second");
  }
  @Test(priority=3 , enabled=false)
  public void three(){
	  System.out.println("This wll be executed third");
  }
  @Test(priority=4)
  public void four(){
	  System.out.println("This will be executed four");
  }
}
