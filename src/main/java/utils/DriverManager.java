package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class DriverManager {

    public static AndroidDriver initializeDriver(String version) throws Exception {
        AndroidDriver driver = null;
        Properties props = new PropertyManager().getProps();
            try{
                TestUtils.log().info("initializing Appium driver");
                UiAutomator2Options options = new UiAutomator2Options();
                options.setPlatformName(props.getProperty("platformName"));
                options.setAutomationName(props.getProperty("androidAutomationName"));
                options.setDeviceName(props.getProperty("androidDeviceName"));
                options.enforceAppInstall();
                String androidURL = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                            + File.separator + "resources" + File.separator + "app" + File.separator + props.getProperty(version);
                options.setApp(androidURL);

                driver = new AndroidDriver(new URL(props.getProperty("appiumURL")), options);
                TestUtils.log().info("Driver is initialized");

            } catch (IOException e) {
                TestUtils.log().fatal("Driver initialization failure. ABORT !!!!" + e.getLocalizedMessage());
                throw e;
            }
        return driver;
    }

}
