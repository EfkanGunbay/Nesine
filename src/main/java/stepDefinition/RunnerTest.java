package stepDefinition;

import com.beust.jcommander.Parameter;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import org.junit.BeforeClass;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Optional;

import java.io.FileReader;
import java.net.URL;
import java.util.HashMap;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;


public class RunnerTest {



    MobileDriver driver;
    
    @Before
    public void setUp() throws MalformedURLException{
        DesiredCapabilities capabilities=new DesiredCapabilities();
        boolean value;

    }



    public class BaseClass {

        private AppiumDriverLocalService service;
        private AppiumServiceBuilder server;

        String platformRunAs;
        /*
         * myPlatform should be web or mobile
         *
         */
        final String myPlatform = "web";

        @Parameter(names = "platform")
        @BeforeClass
        public void setup(@Optional(myPlatform)String platform, @Optional("mobile")String runOn) throws MalformedURLException
        {
            System.out.println(platform);
            String path = System.getProperty("user.dir");
            if ("mobile".equals(platform)) {
                System.out.println("Application is opening... ");
                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setCapability("app", path + "//App//nesine.apk");
                cap.setCapability("platformName", "Android");
                cap.setCapability("deviceName", "samsungnote 5");
                cap.setCapability("appWaitActivity", "?");
                cap.setCapability("appPackage", "?");
                if (runOn.equals("192.168.56.101:5555")) {
                    cap.setCapability("udid", "192.168.56.101:5555");
                    driver = new AndroidDriver(new URL("http://127.0.0.1:4729/wd/hub"), cap);
                } else if (runOn.equals("ZY25683TPXL")) {
                    cap.setCapability("udid", "ZY25683TPXL");
                    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4726/wd/hub"), cap);
                } else if (platformRunAs.equals("mobile")) {
                    driver = new AndroidDriver<MobileElement>(service.getUrl(), cap);
                }
                System.out.println("mobile will launch");
                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            } else {
                System.out.println("Incorrect Platform...");
            }

        }

        @AfterClass
        public void tearDown()
        {
            driver.quit();


        }



        @Parameters({"runAs"})
        @BeforeTest
        public void startAppoumserver(@Optional(myPlatform)String platform)
        {
            System.out.println(platform);
            if(platform.equalsIgnoreCase("mobile"))
            {
                platformRunAs="mobile";
                server = new AppiumServiceBuilder();
                server.usingAnyFreePort();
                server.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
                server.withArgument(GeneralServerFlag.LOG_LEVEL, "error:error");
                service = AppiumDriverLocalService.buildService(server);
                service.start();
                System.out.println("Appium Server is Started...");
            }

        }

        @Parameters({"runAs"})
        @AfterTest
        public void stopAppiumServer(@Optional(myPlatform) String platform)
        {
            if(platform.equalsIgnoreCase("mobile"))
            {
                service.stop();
                System.out.println("Appium Server is Stoped...");
            }
        }
    }
            
}
