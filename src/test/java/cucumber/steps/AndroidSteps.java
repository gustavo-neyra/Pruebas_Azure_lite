package cucumber.steps;

import io.cucumber.java.en.When;
import pages.*;

public class AndroidSteps {

    private final CountrySelectionPage cs = new CountrySelectionPage();


    @When("Seleccionar Pais {string}")
    public void seleccionarPais(String pais) {
        cs.seleccionarPais(pais);
    }
}

