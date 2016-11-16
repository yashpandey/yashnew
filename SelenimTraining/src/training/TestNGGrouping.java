package training;

import org.testng.annotations.Test;

public class TestNGGrouping {

	@Test(groups={"Car"})
	public void Car1(){
		System.out.println("batch Car-Test Car 1");
	}
	@Test(groups={"Car"})
	public void Car2(){
		System.out.println("Batch Car-Test Car 2");
	}
	@Test(groups={"Scooter"})
	public void Scooter1(){
		System.out.println("Batch Scooter - Test Scooter 1");
	}
	@Test(groups={"Scooter"})
	public void Scooter2(){
		System.out.println("Batch Scooter- Test Scooter 2");
	}
	@Test(groups={"Car","Sedan"})
	public void Car3(){
		System.out.println("Batch car- Test Sedan car");
	}
	

}
