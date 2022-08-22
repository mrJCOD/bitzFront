package configDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class configDriver {
	
	public static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() {

		if (driver == null) {
			iniciarBitz();
		}
		return driver;
	}

	public static void iniciarBitz() {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
		desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
		desiredCapabilities.setCapability("appium:appPackage", "br.com.carson.android.bitz");
		desiredCapabilities.setCapability("appium:appActivity", "br.com.carson.android.bitz.features.splash.SplashActivity");
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void finalizarDevice() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}

	}
	
	public static void iniciarDeviceBitz(String nomeDoTeste) {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		
		desiredCapabilities.setCapability("browserstack.user", "maurojunior_VG4IsZ");
		desiredCapabilities.setCapability("browserstack.key", "Htjv2dzFnP3ZTc2FBEAN");
		
		desiredCapabilities.setCapability("app", "bs://39898b68d3003cb88f8b7fe907456afb8c634389");
		desiredCapabilities.setCapability("appium:appPackage", "br.com.carson.android.bitz");
		desiredCapabilities.setCapability("appium:appActivity", "br.com.carson.android.bitz.features.splash.SplashActivity");
		
		
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("device", "Samsung Galaxy S21");
		
		desiredCapabilities.setCapability("os_version", "12.0");
		desiredCapabilities.setCapability("project", "Projeto Bitz");
		desiredCapabilities.setCapability("build", "Build - Mauro R Junior");
		desiredCapabilities.setCapability("name", nomeDoTeste);
		

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://hub.browserstack.com/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

}
