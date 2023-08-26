package applications;

import io.appium.java_client.android.AndroidDriver;
import utils.DriverManager;
import utils.TestUtils;

public class App {

    public AndroidDriver driver;

    public App() throws Exception {
        TestUtils.log().info("User haven't provided application version default version will be v1.0");
        driver= DriverManager.initializeDriver("v1.0");
    }

    public App(String version) throws Exception {
        TestUtils.log().info("User has provided application version "+version);
        driver= DriverManager.initializeDriver(version);
    }
}
