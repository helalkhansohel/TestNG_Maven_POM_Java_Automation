package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;
//    @FindBy(xpath ="//*[@id='endpoint']/tp-yt-paper-item/yt-formatted-string")
//    WebElement linkLogin;

    @FindBy(className ="login")
    WebElement linkLogin;
    @FindBy(id = "email")
    WebElement txtEmail;
    @FindBy(id="passwd")
    WebElement txtPassword;
    @FindBy(id="SubmitLogin")
    WebElement btnSubmit;
    @FindBy(xpath = "//span[contains(text(),'Test User')]")
    WebElement lblUserName;
    @FindBy(xpath = "//li[contains(text(),'Invalid email address.')]")
    WebElement lblInvalidEmail;
    @FindBy(xpath = "//li[contains(text(),'Authentication failed.')]")
    WebElement lblAuthError;



    public Login(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Click_SingIn()  {

        linkLogin.click();

    }
    public void Input_Email(String email){
        txtEmail.sendKeys(email);
    }

    public void Input_Password(String password){
        txtPassword.sendKeys(password);
    }

    public void Click_Submit(){
        btnSubmit.click();
    }

    public String Get_UserName(){

        return lblUserName.getText();
    }
    public String Get_Invalid_Email_Message(){
        return lblInvalidEmail.getText();
    }
    public String Get_Invalid_Password_Message(){
        return lblAuthError.getText();
    }




}

