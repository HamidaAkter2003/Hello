package com;

import org.testng.annotations.Test;

public class UnitTest extends BaseTest{
	
	@Test(groups = "smoke", priority = 1)
	public void login() {
		System.out.println("test2");
	}
	
	@Test(groups = "backend", priority = 2, dependsOnGroups = "login")
	public void logout() {
		System.out.println("test3");
	}

}
