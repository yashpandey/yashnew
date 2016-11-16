package training;

import org.testng.annotations.Test;

public class GroupAnnotation {
  @Test(groups={"Car"})
  public void Car1() {
	  System.out.println("This is car 1");
  }
  @Test(groups={"Car"})
  public void Car2(){
	  System.out.println("This is car 2");
  }
  @Test(groups={"Sccoter"})
  public void sccoter1(){
	  System.out.println("This is sccoter 1");
  }
  @Test(groups={"Sccoter"})
  public void sccoter2(){
	  System.out.println("This is sccoter 2");
  }
  @Test(groups={"Car","Sedan"})
  public void sedan(){
	  System.out.println("This is sedan 1");
  }
}
