package com;

import org.testng.annotations.Test;

public class DataDrivenTest {
	
	@Test(dataProvider = "dp")
	  public void f(Integer n, String s) {
	  }

}
