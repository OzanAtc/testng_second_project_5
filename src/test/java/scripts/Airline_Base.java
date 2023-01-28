package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Airline_BasePage;
import pages.Airline_Flight_InformationPage;
import utilities.ConfigProperties;
import utilities.Driver;

public class Airline_Base {

    WebDriver driver;
    Airline_BasePage airline_basePage;
    Airline_Flight_InformationPage airline_flight_informationPage;

    @BeforeMethod
    public void setup() {

        driver = Driver.getDriver();
        driver.get(ConfigProperties.getProperty("appURL"));

        airline_basePage = new Airline_BasePage();
        airline_flight_informationPage = new Airline_Flight_InformationPage();
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }

}
