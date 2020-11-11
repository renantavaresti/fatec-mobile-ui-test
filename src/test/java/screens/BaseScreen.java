package screens;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseScreen {

    public BaseScreen (RemoteWebDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver) , this);
    }
}
