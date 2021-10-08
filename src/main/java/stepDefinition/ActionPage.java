package stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

import java.io.InputStream;
import java.util.Properties;
import java.util.Random;
import java.util.List;

import org.openqa.selenium.By;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import javax.swing.*;


public class ActionPage {

        private AppiumDriver driver;
        AllElement allpage_elements;

        MobileElement username= (MobileElement) driver.findElements(By.xpath(""));
        MobileElement password= (MobileElement) driver.findElements(By.xpath(""));
        Properties prop=new Properties();
        InputStream inputStream=getClass().getClassLoader().getResourceAsStream("yProject.properties");
        String UName=prop.getProperty("uName");
        String pwd=prop.getProperty("pwd");


    public void loginclk() {
            allpage_elements.login.click();
        }

        public void username() {
            allpage_elements.username.click();
            allpage_elements.username.sendKeys(UName);
        }

        public void password() {
            allpage_elements.password.click();
            allpage_elements.password.sendKeys(pwd);//Pom.xlm giriş yap
        }

        public void verfyLogin(){
            allpage_elements.membernumber.isDisplayed();

        }

       public void membernumberclk(){
            allpage_elements.membernumber.click();
        }

        public void logout(){
            allpage_elements.logout.isDisplayed();
            allpage_elements.logout.click();
        }

        public void popupclk(){
            allpage_elements.continuepopup.isDisplayed();
            allpage_elements.continuepopup.click();
        }

        public void closeVerfy(){
            allpage_elements.username.isDisplayed();

        }

        public void promotionButtonclk(){
            allpage_elements.promotionbutton.isDisplayed();
            allpage_elements.promotionbutton.click();
        }

        public void promotionCode() {
            allpage_elements.promotioncode.click();
            allpage_elements.promotioncode.sendKeys("123");
        }

        public void securitycode(){
            allpage_elements.securitycode.sendKeys("123");

        }

        public void closeButtonclk(){
            allpage_elements.closebutton.click();

        }

        public void verfyPromotion(){
            allpage_elements.promotionbutton.isDisplayed();
        }
        public void personalInformationsclk(){
            allpage_elements.personalinformations.click();
        }


    public void verfyPersonalInformations(){
        String elText1=allpage_elements.loginmembernumber.getText();
        allpage_elements.loginmembernumber.click();
        allpage_elements.personalinformations.click();
        String eltext2=allpage_elements.personalinformations.getText();
        if (elText1 == eltext2){

          allpage_elements.personalinformations.isDisplayed();

        }else {


        }

    }




    }



