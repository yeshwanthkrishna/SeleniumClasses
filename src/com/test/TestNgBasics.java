
package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
@BeforeClass
public void launchBrowser() {
	System.out.println("open the browser");
}
@BeforeMethod
public void enterurl() {
	System.out.println("enter the url");
}
@BeforeGroups
public void opengooogle() {
	System.out.println("open google");
}
@Test
public void testbrowser() {
	System.out.println("check the browser");
}
@Test
public void closebrowser() {
	System.out.println("close the browser");
}
@BeforeTest
public void deletecookies() {
	System.out.println("delete cookies");
}
@AfterTest
public void closewindow() {
	System.out.println("close window");
}
@AfterMethod
public void saveforms() {
	System.out.println("save the e forms");
}
}
