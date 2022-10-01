package com.apex.samples1;

public class TestApplication {
	public static void main(String[] args) throws InterruptedException {

		//Login Tests
		
//	Testing login with valid username and password
		LoginTestSauceDemo.testLoginWithSuccessfulData();

//	Testing login with blank data		
		LoginTestSauceDemo.testLoginWithBlankData();

//	Testing login with locked out user		
		LoginTestSauceDemo.testLoginWithLockedOutUser();

//	Testing login with problem user		
		LoginTestSauceDemo.testLoginWithProblemUser();

//	Testing login with problem user		
		LoginTestSauceDemo.testLoginWithPerformanceGlitchUser();

		//Order Test
		
		OrderTestSauceDemo.testBagpackOrder();
		
		//Registration Test
		
		RegistrationTestDemoBlaze.testRegistrationWithSuccessfulData();

	}
}
