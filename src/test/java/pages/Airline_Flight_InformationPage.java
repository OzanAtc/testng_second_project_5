package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Airline_Flight_InformationPage extends Airline_BasePage{

    public Airline_Flight_InformationPage() {
        super();
    }

    @FindBy(css = "div[class*='s__det']:nth-child(1)")
    public List<WebElement> departureHeading;
}
