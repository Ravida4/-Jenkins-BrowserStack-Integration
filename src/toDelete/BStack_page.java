package toDelete;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;
import com.opencsv.CSVReader;
import com.relevantcodes.extentreports.utils.Stream;

public class BStack_page {
	public WebDriver we;
	public BStack_page(WebDriver we) {
		this.we = we; 
	}

	public boolean test1() {
		we.get("http://www.google.com");
//		System.out.println(new File(System.getProperty("user.dir")+"/src/uploadFiles/").listFiles().length);
		CSVReader reader;
		try {
			String path = System.getProperty("user.dir")+"\\src\\exportfiles\\telephony_247Inc-2020-06-08.csv";
			reader = new CSVReader(new FileReader(path));
			String [] nextLine;
			nextLine = reader.readNext();
			System.out.println(nextLine.length);
			for(int i=0;i<nextLine.length;i++)
			{
				System.out.println(nextLine[i]);
			}
			reader.close();
		} catch (IOException e) {
			return false;

		}
		//		(new SimpleDateFormat("yyyy-MM-dd")).format(new Date())
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
		we.get("http://www.whatsapp.com");
		//	    System.out.println("Title : "+we.getTitle());
		return we.getTitle().equalsIgnoreCase("WhatsApp");
	}
}
