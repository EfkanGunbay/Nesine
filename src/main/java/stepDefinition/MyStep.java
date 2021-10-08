package stepDefinition;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageAction.Login;

import java.io.*;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MyStep {



    MobileDriver driver;

    @When("^(?:I )?click")
  public void clickElement(String elementkey){
      MobileElement element = (MobileElement) driver.findElement(By.xpath("//*[@text='" + elementkey + "']"));
      element.click();

        }

    @And("^(?:I )?seepage")
    public void seePage(String elementkey){
        List<MobileElement> elements=(List<MobileElement>) driver.findElementByAccessibilityId("elements");

    }
    @And("^(?:I )?fill:$")
    public void seePage(String elementkey,String text){
     MobileElement elements=(MobileElement) driver.findElementByAccessibilityId("elements");
     elements.sendKeys(text);
    }


        public void scroller(double rateStartX, double rateEndX, double rateStartY, double rateEndY) {

        int startX, endX, startY, endY;
        Dimension dimension = driver.manage().window().getSize();

        startX = (int) (dimension.getWidth() * rateStartX);
        endX = (int) (dimension.getWidth() * rateEndX);
        startY = (int) (dimension.getHeight() * rateStartY);
        endY = (int) (dimension.getHeight() * rateEndY);

        TouchAction action = new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }


    @When("^(?:I )?scroll (left|right|down|up)$")
    public void scroll2(String direction) throws Exception {
        direction = direction.toLowerCase();
        if (direction.equals("down")) {
            scroller(0.5, 0.5, 0.4, 0.6);
        } else if (direction.equals("up")) {
            scroller(0.5, 0.5, 0.6, 0.4);
        } else if (direction.equals("right")) {
            scroller(0.40, 0.60, 0.5, 0.5);
        } else if (direction.equals("left")) {
            scroller(0.60, 0.40, 0.5, 0.5);
        } else {
            throw new Exception("Wrong direction!");
        }

    }
}


