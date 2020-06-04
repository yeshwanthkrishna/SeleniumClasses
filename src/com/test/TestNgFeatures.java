package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
//if we use invocationCount=5 then this particular test case executes 5 times
@Test(invocationCount=5)
public void logintest() {
	System.out.println("login test");
}
@Test
public void homepage() {
	System.out.println("home test");
}
@Test(expectedExceptions=NumberFormatException.class)
public void test1() {
	String x="543Y";
	Integer.parseInt(x);
}
}
