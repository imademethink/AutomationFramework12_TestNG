package com.ecom.cosmetics.pkg1_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Login {
    public static WebDriver driver = null;

    @Test
    public void Login1(){
        System.out.println("Login scenario start. Launching browser");
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
        driver = invokeBrowser();
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void Login2(){
        System.out.println("Login scenario start. midway");
        driver.findElement(By.id("bicycle-checkbox")).click();
        driver.findElement(By.id("hatchback-checkbox")).click();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void Login3(){
        System.out.println("Login scenario finished.");
        driver.quit();
        Assert.fail("Failing somehow");
    }

    // Launch browser instance -- Currently only Chrome is supported
    // Note by default image loading is disabled to speedup the operation
    public WebDriver invokeBrowser(){
        String sChromeBinary=System.getProperty("user.dir") + "\\browserDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", sChromeBinary);
        System.setProperty("webdriver.chrome.silentOutput", "true");

        // Disable image loading - to speedup test execution
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.managed_default_content_settings.images", 2);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,800");
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.setExperimentalOption("useAutomationExtension", false);
        //options.setExperimentalOption("prefs", prefs);
        return new ChromeDriver(options);
    }


}

  Logging using log4j
  XML file params

//<dependency>
//<groupId>log4j</groupId>
//<artifactId>log4j</artifactId>
//<version>1.2.17</version>
//</dependency>

