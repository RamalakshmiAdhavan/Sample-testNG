package testNg1;

import org.testng.annotations.Test;

public class Dependencis 
{
@Test(enabled=true)
	public void PgCollege() {
System.out.println("PgCollege ");
}
@Test
    public void UgCollege() {
System.out.println("UgCollege");
}
@Test(dependsOnMethods="UgCollege")

public void HighSchool() {
System.out.println("HighSchool");
}
@Test(dependsOnMethods="HighSchool")
public void Middleschool() {
System.out.println("Middleschool");
}
}
