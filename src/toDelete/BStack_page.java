package toDelete;

import org.openqa.selenium.WebDriver;

public class BStack_page {
	public WebDriver we;
	public BStack_page(WebDriver we) {
		this.we = we; 
	}
	
	public boolean test1() {
	    we.get("http://www.instagram.com");
	    return we.getTitle().equalsIgnoreCase("Instagram1");
	}
	public boolean test2() {
	    we.get("http://www.faceook.com");
	    return we.getTitle().equalsIgnoreCase("Facebook � log in or sign up");
	}
}
