package appiumPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Launchemulator {

	public static void main(String[] args) throws MalformedURLException
	{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 25");
	cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Indium\\Downloads\\ApiDemos-debug.apk");
	URL url = new URL("http://0.0.0.0:4723/wd/hub");
	AndroidDriver <MobileElement> driver =new AndroidDriver <MobileElement> (url,cap);
	}

}
