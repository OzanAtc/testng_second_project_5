package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Airline_Flight_InformationPage extends Airline_BasePage{

    public Airline_Flight_InformationPage() {
        super();
    }

    @FindBy(css = "div[class$='2d8nC'] b")
    public WebElement departureHeading;
}
