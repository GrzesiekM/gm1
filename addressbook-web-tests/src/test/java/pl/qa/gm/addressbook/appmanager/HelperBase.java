package pl.qa.gm.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ThinkPad on 17.12.2016.
 */
public class HelperBase {
  protected FirefoxDriver wd;

  public HelperBase(FirefoxDriver wd) {
    this.wd=wd;
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }
}

  /**
   * cholera wie po co tp tu jest, na ktorejs z ostatnich chyba przed ostatniej lekcji na koncowce drugiego modulu na  przenieslismy to tu skas tam szukaj info

  public  boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
   */