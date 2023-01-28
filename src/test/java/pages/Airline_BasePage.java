package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Airline_BasePage {

    public Airline_BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "ul[class$='3SjnI']>div")
    public List<WebElement> mainMenuItems;

    @FindBy(css = "ul[class$='3RNBj']>li")
    public List<WebElement> bookTravelMenuItems;

    @FindBy(css = "div[class$='3WXQM']>label")
    public List<WebElement> roundTripAndOneWayLabels;

    @FindBy(css = "div[class$='3WXQM'] input")
    public List<WebElement> roundTripAndOneWayInputs;

    @FindBy(css = "div[class$='2Hpvk']>div>label")
    public List<WebElement> bookWithMiles_FlexibleDatesLabel_CheckBox;

    @FindBy(css = "div[class$='2Hpvk']>div>input")
    public List<WebElement> bookWithMiles_FlexibleDatesInput_CheckBox;

    @FindBy(css = "div[class$='2B_Ng']>input")
    public List<WebElement> from_and_to_InputBox;

    @FindBy(id = "DepartDate")
    public WebElement datesFor_InputBox;

    @FindBy(css = "#passengerSelector>button")
    public WebElement travelerSelector;

    @FindBy(css = "button[aria-label='Substract one Adult']")
    public WebElement adultTraveler_Add_More_Button;

    @FindBy(id = "cabinType")
    public WebElement cabinType_InputBox;

    @FindBy(css = "ul[class$='38-ZN']>li")
    public List<WebElement> cabinType_Dropdown_Options;

    @FindBy(css = "button[aria-label='Find flights']")
    public WebElement findFlights_Button;




}
