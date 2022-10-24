package driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class DriverManager {

    private static final ThreadLocal<AndroidDriver<AndroidElement>> driver = new ThreadLocal<>();


    //private static final String app = System.getenv("URLBS");
    private static final String app = "bs://abc8de5e41083357e6ed4103770103a97935dd39"; //ultima build 3.11
    public static final String URL = "https://" + BrowserStackHelper.USERNAME + ":"
            + BrowserStackHelper.AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


    public void iniciarWebDriver(String testName) throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("device", "Google Pixel 5");
        caps.setCapability("os_version", "11.0");
        caps.setCapability("browser_version", "latest");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "4.1.2");
        caps.setCapability("browserstack.networkProfile", "4g-lte-advanced-good");
        caps.setCapability("app", app);
        caps.setCapability("browserstack.idleTimeout", "300");
        //Nombre de ejecucion en dashboard de browserstack
        caps.setCapability("project", "Android Demo ");
        caps.setCapability("name", testName);
        caps.setCapability("build", "Pruebas AZ");
        //caps.setCapability("build", "Android Pruebas Completas Delivery & Pickup");
        //Configuracion para visualizacion de los logs.
        caps.setCapability("browserstack.debug", "true");
        caps.setCapability("browserstack.console", "verbose");
        caps.setCapability("browserstack.networkLogs", "true");
        caps.setCapability("enableWebviewDetailsCollection", "true");
        caps.setCapability("browserstack.idleTimeout", "300");

        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("error");
        } 
        driver.set(new AndroidDriver<>(new URL(URL), caps));
    }

    public static AndroidDriver<AndroidElement> getDriver() {
        return driver.get();
    }

    public static void cerrarDriver() {
        driver.get().quit();
    }
}
