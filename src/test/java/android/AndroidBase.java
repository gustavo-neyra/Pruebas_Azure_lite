package android;

import driver.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Helpers;
import io.appium.java_client.android.nativekey.AndroidKey;

import java.time.Duration;
import java.util.List;

@SuppressWarnings("unchecked")
public class AndroidBase {
    AndroidDriver driver = DriverManager.getDriver();

    Helpers hp = new Helpers();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    WebDriverWait fastWait = new WebDriverWait(driver, 2);


    public void click( By xpath) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(xpath));
        element.click();
    }

    public void back(){
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
    }

    public void fastClick(By xpath) {
        WebElement element = fastWait.until(ExpectedConditions.elementToBeClickable(xpath));
        element.click();
    }

    public List<AndroidElement> findElements(By xpath) {
        return driver.findElements(xpath);
    }

    public String getTextId(String id) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
        return element.getText();
    }

    public String getText(By xpath) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(xpath));
        return element.getText();
    }

    public void clickId(String id) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
        element.click();
    }
    public void fastClickId(String id) {
        WebElement element = fastWait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
        element.click();
    }
    public WebElement findElement(By xpath) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
    }
    public WebElement fastFindElement(By xpath) {
        return fastWait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
    }
    public WebElement fastFindElementId(String id) {
        return fastWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }
    public void  type (By xpath, String text) {
       WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
       element.sendKeys(text);
    }

    public void  typeId (String id, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.sendKeys(text);
    }
    public void  fastTypeId (String id, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.sendKeys(text);
    }
    public void scrollAndFind(String text) throws InterruptedException {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));").click();
    }

    public void scrollAndSearch(String text) throws InterruptedException {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));");
    }
    public void scrollAndSearchChild(String text) throws InterruptedException {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().textContains(\""+ text+"\"))");

    }

    public void scrollAndSFindChild(String text) throws InterruptedException {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().textContains(\""+ text+"\"))").click();

    }

    public void scrollH(String xpath,String text) throws InterruptedException {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)."
                + "resourceId(\""+xpath+"\"))"
                + ".setAsHorizontalList().scrollIntoView(new UiSelector().text(\""+text+"\"))");
    }

}
