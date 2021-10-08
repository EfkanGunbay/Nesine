package stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.aspectj.asm.IElementHandleProvider;
import org.openqa.selenium.support.PageFactory;

public class AllElement {
    AppiumDriver driver;

    @AndroidFindBy(xpath = "//*[@text='GİRİŞ YAP']") public MobileElement login;
    @AndroidFindBy(xpath = "//*[@id='username_edit']") public MobileElement username;
    @AndroidFindBy(xpath = "/*[@id='password_edit']") public MobileElement password;
    @AndroidFindBy(xpath = "//*[@text='15642754']") public MobileElement loginmembernumber;
    @AndroidFindBy(xpath = "//*[@text='Promosyonlarım']") public MobileElement promotionbutton;
    @AndroidFindBy(xpath = "//*[@id='code']") public MobileElement promotioncode;
    @AndroidFindBy(xpath = "//*[@text='15642754']") public MobileElement membernumber;
    @AndroidFindBy(xpath = "//*[@id='securityCode']") public MobileElement securitycode;
    @AndroidFindBy(xpath = "//*[@text='Çıkış Yap']") public MobileElement logout;
    @AndroidFindBy(xpath = "//*[@text='Kapat']") public MobileElement closebutton;
    @AndroidFindBy(xpath = "//*[@text='Kişisel Bilgilerim']") public MobileElement personalinformations;
    @AndroidFindBy(xpath = "//*[@text='DEVAM']") public MobileElement continuepopup;


    public AllElement(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

   }

}

