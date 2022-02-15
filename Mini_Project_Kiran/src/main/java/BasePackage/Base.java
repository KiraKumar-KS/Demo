package BasePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public Base() throws IOException {

		FileInputStream fis = new FileInputStream("./Configuration\\Config.properties");
		prop = new Properties();
		prop.load(fis);

		/*
		 * prop.load(fis); prop.setProperty("db.url", "localhost");
		 * prop.setProperty("db.user", "mkyong"); prop.setProperty("db.password",
		 * "password");
		 */
	}
	
	public static void initialization() {
		/*String browserName = prop.getProperty("browserName");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			//DesiredCapabilities dc = new DesiredCapabilities();
			//dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		} else if (browserName.equalsIgnoreCase("FF")) {

			System.setProperty("webdriver.gecko.driver", "./Drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		} 
        */
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}

}