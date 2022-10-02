package step_def;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Login;

public class assertion {
    @Test
    public void ValidateLogin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        Login login = new Login(driver);

        login.LoginFunction("sbcgsodcuyf", "74927437");
        Thread.sleep(1000);

        String actualErrorMessage = login.errorText.getText().trim();
        System.out.println("THIS IS ERROR NAME : " + actualErrorMessage);

        String expectedError = "The email or mobile number you entered isn’t connected to an account. Find your account and log in.";

        Assertions.assertEquals(actualErrorMessage, expectedError);

    }

    }
