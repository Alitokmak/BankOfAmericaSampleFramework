package com.sample.pages.creditCards.creditCardsOptions;

import com.sample.pages.login.BasePage;
import com.sample.utilities.BrowserUtils;
import com.sample.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CashRewardsCreditCards extends BasePage {

    @FindBy(id="cashRewardsCards")
    public WebElement cashRewardsCards;

    @FindBy(id="home_4043318~M4~en_US")
    public WebElement applyNow;

    @FindBy(id="customerFirstName")
    public WebElement firstName;

    @FindBy(id="customerMiddleName")
    public WebElement middleName;

    @FindBy(id="customerLastName")
    public WebElement lastName;

    @FindBy(id="customerNameSuffix")
    public WebElement suffixName;

    @FindBy(xpath="//*[@id='customerResidentialAddressOne']")
    public WebElement residentialAddressOne;

    @FindBy(xpath="//*[@id='customerResidentialAddressTwo']")
    public WebElement residentialAddressTwo;

    @FindBy(id="customerAddressCity")
    public WebElement customerAddressCity;

    @FindBy(id="customerAddressState")
    public WebElement customerAddressState;

    @FindBy(id="customerAddressInput")
    public WebElement zipCode;

    @FindBy(id="customerAddressPreference")
    public WebElement customerAddressPreferences;

    @FindBy(id="customerPrimaryPhoneNumber")
    public WebElement customerPrimaryPhoneNumber;

    @FindBy(id="phoneNumberMobile")
    public WebElement phoneNumberMobile;

    @FindBy(id="phoneNumberHome")
    public WebElement phoneNumberHome;

    @FindBy(id="customerEmailAddress")
    public WebElement customerEmailAddress;

    @FindBy(id="customerUsCitizenYes")
    public WebElement customerUsCitizenYes;

    @FindBy(id="customerSocialSecurityNumber")
    public WebElement customerSocialSecurityNumber;

    @FindBy(id="customerUsCitizenNo")
    public WebElement customerUsCitizenNo;

    @FindBy(id="customerDualCitizenshipYes")
    public WebElement customerDualCitizenshipYes;

    @FindBy(css="#customerDualCitizenshipNo")
    public WebElement customerDualCitizenshipNo;

    @FindBy(id="customerCountryOfResidence")
    public WebElement customerCountryOfResidence;

    @FindBy(id="customerBirthDate")
    public WebElement customerBirthDate;

    @FindBy(id="employmentStatus")
    public WebElement employmentStatus;

    @FindBy(id="annualSalary")
    public WebElement annualSalary;

    @FindBy(id="incomeSource")
    public WebElement incomeSource;

    @FindBy(id="monthlyHousingPayment")
    public WebElement mountlyHousingPayment;

    @FindBy(id="balanceTransferCheckBox")
    public WebElement balanceTransferCheckBox;

    @FindBy(id="additionalCardHolderCheckBox")
    public WebElement addCardHolder;

    @FindBy(id="termsAndConditionsCheckBox")
    public WebElement termsAndConditionsCheckBox;

    @FindBy(id="continueBlock")
    public WebElement saveContinue;

    @FindBy(xpath="//*[.='Submit my application']")
    public WebElement submitMyApp;






    public void customerInformation(){
        firstName.sendKeys("Ali");
        lastName.sendKeys("Tok");
        residentialAddressOne.sendKeys("19128 112th Ave NE ");
        customerAddressCity.sendKeys("Bothell");
        Select select= new Select(customerAddressState);
        select.selectByValue("WA");
        zipCode.sendKeys("98011");
        customerPrimaryPhoneNumber.sendKeys("2059852753");
        phoneNumberMobile.click();
        customerEmailAddress.sendKeys("alitok@gmail.com");
        customerUsCitizenYes.click();
        customerSocialSecurityNumber.sendKeys("123234576");
        //BrowserUtils.waitForClickablility(customerDualCitizenshipNo,10);
        BrowserUtils.clickWithJS(customerDualCitizenshipNo);
        //customerDualCitizenshipNo.click();
        Select select1= new Select(customerCountryOfResidence);
        select1.selectByValue("1000239");
        customerBirthDate.sendKeys("06/23/1980");
        employmentStatus.sendKeys("UnEmployement");
        annualSalary.sendKeys("10000");
        Select select2= new Select(incomeSource);
        select2.selectByValue("Unemployment");
        mountlyHousingPayment.sendKeys("7000");
        termsAndConditionsCheckBox.click();


    }

}
