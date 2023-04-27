package com.run;

import org.openqa.selenium.WebDriver;

import com.pom2.Login;

import Base.com.Instagram;

public class Instarun extends Instagram {
	public static WebDriver driver=browser();
	public static void main(String[] args) throws Throwable {
	
		
		Login l=new Login(driver);
		url("https://www.instagram.com/");
		Thread.sleep(3000);
		sendkeys(l.getUser(), "hjbjggug");
		sendkeys(l.getPass(), "ghhgvdhh");
		click(l.getLog());
		
		
		
		
	}

}
