package com.org.learningmaven.myMavenProject;

import org.testng.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
public class HelloWorldTest {
	@Test
	public void login() {
		System.out.println("Entering login method");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.google.com");
		
		System.out.println("End of the login method");
	}

	@Test
	public void exit() {
		System.out.println("Entering exit method");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.google.com");
		
		System.out.println("End of the exit method");
	}
}
