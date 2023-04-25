package TestRunner;

import Pages.Login;
import Setup.Setup;
import Utils.Utils;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTestRunner extends Setup {


    @Test(priority = 1,description = "Test login")
    public void doUserLogin() throws InterruptedException, IOException, ParseException {

        driver.get("http://automationpractice.com");
       // driver.get("https://www.youtube.com/");
        Utils utils = new Utils(driver);
        utils.readJSONArray(0);
        System.out.println("sp1");
        Login l=new Login(driver);
        l.Click_SingIn();

        l.Input_Email(utils.getEmail());
        l.Input_Password(utils.getPassword());
        l.Click_Submit();
        String username=l.Get_UserName();


        System.out.println("sp4: "+username);

        Assert.assertTrue(username.contains("Test User"));
    }

    @Test(priority = 2,description = "Test login")
    public void loginWithInvalidEmail() throws InterruptedException, IOException, ParseException {

        driver.get("http://automationpractice.com");
        Utils utils = new Utils(driver);
        utils.readJSONArray(1);
        Login l=new Login(driver);
        l.Click_SingIn();
        l.Input_Email(utils.getEmail());
        l.Input_Password(utils.getPassword());
        l.Click_Submit();

        String errorMessage = l.Get_Invalid_Email_Message();
        Assert.assertTrue(errorMessage.contains("Invalid email address"));
    }
    @Test(priority = 3,description = "Test login")
    public void loginWithWrongPassword() throws InterruptedException, IOException, ParseException {

        driver.get("http://automationpractice.com");
        Utils utils = new Utils(driver);
        utils.readJSONArray(2);
        Login l=new Login(driver);
        l.Click_SingIn();
        l.Input_Email(utils.getEmail());
        l.Input_Password(utils.getPassword());
        l.Click_Submit();
        String errorMessage = l.Get_Invalid_Password_Message();
        Assert.assertTrue(errorMessage.contains("Authentication failed"));
    }
}
