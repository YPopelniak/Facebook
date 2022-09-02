package step_def;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.Login;
import utils.Driver;

public class step_def_WithSingelton {
        WebDriver driver = Driver.getDriver();
    @Test
    public void ValidateLogin() throws InterruptedException {
        driver.get("https://www.facebook.com");

        Login login = new Login(driver);
        login.LoginFunction("sbcgsodc", "74927437");
        Thread.sleep(1000);

        String actualErrorMessage = login.errorText.getText().trim();
        System.out.println("THIS IS ERROR NAME : " + actualErrorMessage);

        String expectedError = "The email or mobile number you entered isn’t connected to an account. Find your account and log in.";

        Assertions.assertEquals(actualErrorMessage, expectedError);




        }
    }


