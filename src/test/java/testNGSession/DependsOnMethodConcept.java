package testNGSession;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test
	public void createAUser() {
		System.out.println("Creating a user");
	}
	
	@Test
	public void createUserTest() {
		System.out.println("Creatinguser");
		createAUser();//100
		//int i=9/0;  //    Tests run: 3, Failures: 1, Skips: 2
	}
	
	/*
	 * Below below parameter is not good practice because if the method on which test are depended, fails,then
	 * all TCS depended on that particular testCase will be skipped.
	 */
//	@Test(dependsOnMethods="createUserTest")
//	public void updateUserTest() {
//		System.out.println("Updating a user");
//	}
//	
//	@Test(dependsOnMethods="createUserTest")
//	public void deleteUserTest() {
//		System.out.println("Deleting a user");
//	}
	
	
	//here,method 	createAUser() removed the dependency among the TCS. and this is good approach.
	
	@Test
	public void updateUserTest() {
		System.out.println("Updating a user");//200
		createAUser();//200
		
	}
	
	@Test
	public void deleteUserTest() {
		System.out.println("Deleting a user");//300
		createAUser();//300
	}
}
