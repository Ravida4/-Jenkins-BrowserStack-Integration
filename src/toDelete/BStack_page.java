package toDelete;

import org.openqa.selenium.WebDriver;

public class BStack_page {
	public WebDriver we;
	public BStack_page(WebDriver we) {
		this.we = we; 
	}
	
	public boolean test1() {
	    we.get("http://www.google.com");
	    return we.getTitle().equalsIgnoreCase("Google");
	}
	public boolean test2() {
	    we.get("http://www.facebook.com");
	    return we.getTitle().equalsIgnoreCase("Facebook – log in or sign up");
	}
	public boolean test3() {
	    we.get("http://www.instagram.com");
	    return we.getTitle().equalsIgnoreCase("Instagram");
	}
	public boolean test4() {
	    we.get("http://www.twitter.com");
	    return we.getTitle().equalsIgnoreCase("Twitter");
	}
}
