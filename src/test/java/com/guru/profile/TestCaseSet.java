package com.guru.profile;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TestCaseSet {

	@Parameters("isReports")
	@Test
	public void f(@Optional String isReports) {
		System.out.println("test1 started with isReports as "+isReports);
		String str="ABCD,,,,,,EFGH,,,,,,HDEF,,,,,,,,DEF";
		String dest="";
		int con=0;
		for(int i=0;i<str.length();i++)
		{

			if(!(str.charAt(i)==',')) {

				dest=dest+str.charAt(i);
				con=0;
			}else if((str.charAt(i)==',') && con==0) {
				dest=dest+str.charAt(i);
				con=1;
			}


		}

		System.out.println(dest);





	}
	@Parameters("env")
	@BeforeMethod
	public void beforeMethod(@Optional String env) {
		System.out.println("test before method");
		System.out.println("--------- env starte is "+env+"--------");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("test after method");
	}

}
