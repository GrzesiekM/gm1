package pl.qa.gm.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by ThinkPad on 17.12.2016.
 */
public class ApplicationManager {
  FirefoxDriver wd;

  private SessionHelper sessionHelper;
  private  ContactHelper contactHelper;
  private  NavigationHelper navigationHelper;
  private  GroupHelper groupHelper;

  public static boolean isAlertPresent(FirefoxDriver wd) {
      try {
          wd.switchTo().alert();
          return true;
      } catch (NoAlertPresentException e) {
          return false;
      }
  }



  public void init() {
   wd = new FirefoxDriver();

    wd.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    contactHelper = new ContactHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");

  }


  public void stop() {
    wd.quit();
  }

  public void submit() {
      wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
