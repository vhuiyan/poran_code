package testcases;
import envsetup.BaseEnv;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.PlaceOrderLocator;

public class PlaceOrderTest extends BaseEnv {
    @Test
    public void place_order_feature_test() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(1000);
        PlaceOrderLocator.hoverElectronics();
        Thread.sleep(1000);
        PlaceOrderLocator.clickCellphones();
        Thread.sleep(1000);
        PlaceOrderLocator.clicknokialumia();
        Thread.sleep(1000);
        PlaceOrderLocator.set_quantity("2");
        Thread.sleep(1000);
        PlaceOrderLocator.clickAddtoCart();
        Thread.sleep(5000);
        PlaceOrderLocator.clickShoppingCart();
        Thread.sleep(1000);
        PlaceOrderLocator.clickTermsofuse();
        Thread.sleep(1000);
        PlaceOrderLocator.clickCheckoutbutton();
        Thread.sleep(1000);
        PlaceOrderLocator.clickCheckoutguestbutton();
        Thread.sleep(1000);
        PlaceOrderLocator.setFirstname("Shah");
        Thread.sleep(1000);
        PlaceOrderLocator.setLastname("Poran");
        Thread.sleep(1000);
        PlaceOrderLocator.setEmail("shahporan8181@gmail.com");
        Thread.sleep(1000);
        PlaceOrderLocator.setCountryDropdown("Bangladesh");
        Thread.sleep(1000);
        PlaceOrderLocator.setCity("Dhaka");
        Thread.sleep(1000);
        PlaceOrderLocator.setAddress1("Mohakhali");
        Thread.sleep(1000);
        PlaceOrderLocator.setPostalcode("1212");
        Thread.sleep(1000);
        PlaceOrderLocator.setPhoneNumber("01790259260");
        Thread.sleep(1000);
        PlaceOrderLocator.clickContinueButtonBilling();
        Thread.sleep(1000);
        PlaceOrderLocator.clickNextdayair();
        Thread.sleep(1000);
        PlaceOrderLocator.clickContinueShipping();
        Thread.sleep(1000);
        PlaceOrderLocator.clickCreditCard();
        Thread.sleep(1000);
        PlaceOrderLocator.clickContinueCredit();
        Thread.sleep(1000);
        PlaceOrderLocator.setCardholdername("shah_poran");
        Thread.sleep(1000);
        PlaceOrderLocator.setCardnumber("4706612229464269");
        Thread.sleep(1000);
        PlaceOrderLocator.setCarcode("899");
        Thread.sleep(1000);
        PlaceOrderLocator.setExpirationdate("2025");
        Thread.sleep(1000);
        PlaceOrderLocator.clickContinueButtonPayment();
        Thread.sleep(1000);
        PlaceOrderLocator.clickCheckoutConfirm();
        Thread.sleep(1000);
        String actualMessage= PlaceOrderLocator.getSuccessMessage();
        String expectedMessage="Your order has been successfully processed!";
        Assert.assertEquals(actualMessage,expectedMessage);




    }
}
