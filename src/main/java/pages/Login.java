package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

  public Login(WebDriver driver){


    PageFactory.initElements(driver, this);

  }

  @FindBy(id = "email")
  public WebElement userEmail;

  @FindBy(id = "pass")
  public WebElement passw;

  @FindBy(xpath = "//*[@name=\"login\"]")
  public WebElement loginButton;

  @FindBy(css = "[class=\"_9ay7\"]")
  public WebElement errorText;

  public void LoginFunction(String email , String password){
    userEmail.sendKeys(email);
    passw.sendKeys(password);
    loginButton.click();

  }
  
}
