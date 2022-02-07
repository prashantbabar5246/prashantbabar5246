package Selenium_demo;

import net.bytebuddy.build.Plugin;
import org.checkerframework.framework.qual.PreconditionAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Demo_topics {
    WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void beforetest(){

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\chromedriver.exe");
        driver.get("https://ssguat.serviceurl.in/eSign");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("hi");

    }
    @Test(priority =0)
    public void Classname(){
       // driver.findElement(By.className("mobno1 ng-pristine ng-invalid ng-touched")).sendKeys("8446392985");
        driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div[4]/div[1]/input[1]")).sendKeys("8446392985");
    }
    @Test(priority = 1)
    public void id (){
        driver.findElement(By.id("acceptTerms")).click();
    }
    @Test(priority = 2)
    public void AbsXpath(){
        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-customer-verify[1]/section[1]/div[1]/form[1]/div[3]/div[1]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    @Test(priority = 3)
    public void RelativeXpath(){
        driver.findElement(By.xpath("//input[@id='passWord']")).sendKeys("123456");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    @Test(priority = 4)
    public void tagname(){
        driver.findElement(By.tagName("button")).click();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        System.out.println("Done");
    }
    }

