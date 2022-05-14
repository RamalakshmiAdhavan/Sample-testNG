package testNg1;

import org.testng.annotations.Test;

public class SkipTestCase{
		@Test (priority=0,enabled=false)
		public void firsttestcase() {
			System.out.println("My first sample test case in testNG");
			
		}
		@Test(priority=1)
		public void secondtestcase() {
			System.out.println("My first sample test case in testNG");
			
		}
		@Test(priority=2)
		public void thirdtestcase() {
			System.out.println("My first sample test case in testNG");
			
		}
		@Test(priority=3)
		public void forthtestcase() {
			System.out.println("My first sample test case in testNG");
			
		}
		@Test(priority=4)
		public void fifthtestcase() {
			System.out.println("My first sample test case in testNG");
			
		}

	}


