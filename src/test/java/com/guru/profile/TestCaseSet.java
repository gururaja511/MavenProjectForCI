package com.guru.profile;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestCaseSet {
  @Test
  public void f() {
	  System.out.println("test1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("test before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("test after method");
  }

}
