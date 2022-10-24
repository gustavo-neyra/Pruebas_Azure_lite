package pages;

import android.AndroidBase;
import driver.DriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;
import utils.Helpers;
import utils.Logger;



public class CountrySelectionPage extends AndroidBase {

    Helpers hp = new Helpers();

    public void seleccionarPais(String pais) {
        hp.sleep(15);
        try {
            scrollAndFind(pais);
        }
        catch (TimeoutException | NoSuchElementException | InterruptedException ex){
            Logger.error("No se encontro el pais " + pais);
            Assertions.fail("No se encontro el pais " + pais);
        }
    }
}
