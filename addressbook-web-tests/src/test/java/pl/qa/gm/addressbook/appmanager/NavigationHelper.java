package pl.qa.gm.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ThinkPad on 17.12.2016.
 */
public class NavigationHelper extends HelperBase {


  public NavigationHelper(FirefoxDriver wd) {

    super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("grupy"));
  }
}
