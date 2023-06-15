import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage {
  
    WebDriver webdriver;

    String titleFormLocator = "//*[@id='auth-container']/div/div[2]/div/div[1]";
    String passwordInputLocator = "//input[@type='password']";
    String nicknameInputLocator = "//input[@placeholder='Ник или e-mail']";
    String enterButtonLocator = "//button[@type='submit' and @class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']";
    String errorMassageEmailLocator = "/div[contains(text(),'Укажите ник или e-mail')]";

    public LoginFormPage(WebDriver webdriver) {
        this.webdriver = webdriver;
    }

    public void clickButtonEnter(){
        webdriver.findElement(By.xpath(enterButtonLocator)).click();
    }
  
    public String getTextTitleForm(){
        String textTitleForm = webdriver.findElement(By.xpath(titleFormLocator)).getText();
        return textTitleForm;
    }
}

