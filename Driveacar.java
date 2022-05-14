package testNg1;

import org.testng.annotations.Test;

public class Driveacar {
	@Test(priority=0)
	public void startTheCar() {
		System.out.println("startTheCar");
	}
	@Test(priority=1)
	public void putTheGear() {
		System.out.println("firstGear");
	}
	@Test(priority=2)
		public void PushTheaxilaterandBreak() {
		System.out.println("thiredGear");
	}
	@Test(priority=3)
	public void releaseTheBreakSlowly() {
		System.out.println("4thgear");
	}
	@Test(priority=4)
	public void FinallyMoving() {
		System.out.println("5thgear");
	}
}
