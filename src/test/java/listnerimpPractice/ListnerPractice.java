package listnerimpPractice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.SamapleBaseClass;

public class ListnerPractice extends SamapleBaseClass {
	
	@Listeners(genericUtilities.ListnerImplementation.class)
	@Test
	public void test1() {
		System.out.println("test1");
	}

}
