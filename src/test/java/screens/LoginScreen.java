package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(id = "username")
    @iOSXCUITFindBy(id = "inputUserName")
    private MobileElement fieldUser;

    @AndroidFindBy(id = "pass")
    @iOSXCUITFindBy(id = "InputPassword")
    private MobileElement fieldPassword;

    @AndroidFindBy(id = "button")
    @iOSXCUITFindBy(id = "buttonSignIn")
    private MobileElement buttonPassword;

    public LoginScreen(RemoteWebDriver driver) {
        super(driver);
    }

    public void login(String user, String password){
        this.fieldUser.sendKeys(user);
        this.fieldPassword.sendKeys(password);
        this.buttonPassword.click();
    }
}
