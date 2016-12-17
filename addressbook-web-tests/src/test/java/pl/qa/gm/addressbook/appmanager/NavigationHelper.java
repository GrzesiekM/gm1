package pl.qa.gm.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ThinkPad on 17.12.2016.
 */
public class NavigationHelper {
  private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    this.wd=wd;
  }

  public void gotoGroupPage() {
    wd.findElement(By.linkText("grupy")).click();
  }
}
