package objectRepo;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ObjectInfo {

    public static By btnClick  = By.xpath("//*[@resource-id='tag_button']");

    public static By lblTag  = By.xpath("//*[@resource-id='tag_label']");


    public static void buttonClickAction(AndroidDriver driver){
        driver.findElement(btnClick).click();
    }

    public static String getLabelInfo(AndroidDriver driver){
       return driver.findElement(lblTag).getText();
    }


}
