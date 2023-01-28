package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;


public class Airline_BaseTest extends Airline_Base {

    @Test(priority = 1, description = "Main Menu Navigation Items Validation")
    public void validateMainMenuItems() {

        for (int i = 0; i < airline_basePage.mainMenuItems.size(); i++) {
            Assert.assertTrue(airline_basePage.mainMenuItems.get(i).isDisplayed());
        }
    }

    @Test(priority = 2, description = "Book Travel Menu Items Validation")
    public void validateBookTravelMenuItems() {

        for (int i = 0; i < airline_basePage.bookTravelMenuItems.size(); i++) {
            Assert.assertTrue(airline_basePage.bookTravelMenuItems.get(i).isDisplayed());
        }
    }

    @Test(priority = 3, description = "Round-Trip and One-Way Radio Buttons Validation")
    public void validateRoundTripAndOneWay_RadioButtons() {

        for (int i = 0; i < airline_basePage.roundTripAndOneWayLabels.size(); i++) {

            Assert.assertTrue(airline_basePage.roundTripAndOneWayLabels.get(i).isDisplayed());
            Assert.assertTrue(airline_basePage.roundTripAndOneWayLabels.get(i).isEnabled());
            Assert.assertTrue(airline_basePage.roundTripAndOneWayInputs.get(0).isSelected());
            Assert.assertFalse(airline_basePage.roundTripAndOneWayInputs.get(1).isSelected());
        }

        airline_basePage.roundTripAndOneWayInputs.get(1).click();
        Assert.assertTrue(airline_basePage.roundTripAndOneWayInputs.get(1).isSelected());
        Assert.assertFalse(airline_basePage.roundTripAndOneWayInputs.get(0).isSelected());

    }

    @Test(priority = 1, description = "BookWithMiles and FlexibleDates CheckBoxes Validation")
    public void validate_BookWithMiles_And_FlexibleDates() {

        for (int i = 0; i < airline_basePage.bookWithMiles_FlexibleDatesLabel_CheckBox.size(); i++) {

            Assert.assertTrue(airline_basePage.bookWithMiles_FlexibleDatesLabel_CheckBox.get(i).isDisplayed());
            Assert.assertTrue(airline_basePage.bookWithMiles_FlexibleDatesLabel_CheckBox.get(i).isEnabled());
            Assert.assertFalse(airline_basePage.bookWithMiles_FlexibleDatesInput_CheckBox.get(i).isSelected());
        }

        for (int i = 0; i < airline_basePage.bookWithMiles_FlexibleDatesInput_CheckBox.size(); i++) {

            airline_basePage.bookWithMiles_FlexibleDatesLabel_CheckBox.get(i).click();
            Assert.assertTrue(airline_basePage.bookWithMiles_FlexibleDatesInput_CheckBox.get(i).isSelected());
            Assert.assertTrue(airline_basePage.bookWithMiles_FlexibleDatesLabel_CheckBox.get(i).isEnabled());

        }

        for (int i = 0; i < airline_basePage.bookWithMiles_FlexibleDatesInput_CheckBox.size(); i++) {

            airline_basePage.bookWithMiles_FlexibleDatesLabel_CheckBox.get(i).click();
            Assert.assertFalse(airline_basePage.bookWithMiles_FlexibleDatesInput_CheckBox.get(i).isSelected());
        }

    }

    @Test(priority = 5, description = "One-way ticket search results validation from one specific address to another")
    public void validate_OneWay_SearchResults() {

        airline_basePage.roundTripAndOneWayLabels.get(1).click();

        airline_basePage.from_and_to_InputBox.get(0).clear();
        airline_basePage.from_and_to_InputBox.get(0).sendKeys("Chicago, IL,US(ORD)");
        airline_basePage.from_and_to_InputBox.get(1).clear();
        Waiter.pause(2);
        airline_basePage.from_and_to_InputBox.get(1).sendKeys("Miami,FL,US(MIA)");

        airline_basePage.datesFor_InputBox.click();
        airline_basePage.datesFor_InputBox.clear();
        airline_basePage.datesFor_InputBox.sendKeys("02/28/2023");

        airline_basePage.travelerSelector.click();

        for (int i = 1; i < 2 ; i++) {
            airline_basePage.adultTraveler_Add_More_Button.click();
        }

        airline_basePage.cabinType_InputBox.click();
        airline_basePage.cabinType_Dropdown_Options.get(2).click();
        airline_basePage.findFlights_Button.click();
        Waiter.pause(5);

      Assert.assertEquals(airline_flight_informationPage.departureHeading.getText(), "DEPART ON: February 28");

        }
    }



