package pl.qa.gm.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ThinkPad on 17.12.2016.
 */
public class SessionHelper extends HelperBase {


  public SessionHelper(FirefoxDriver wd) {

    super(wd);
  }
  public void login(String username, String password
      //              String cosa

  ) {

    wd.get("http://localhost/addressbook/addressbook/");
    type(By.name("user"), username);
    type(By.name("pass"), password);
 ;
    click(By.xpath("//form[@id='LoginForm']/input[3]"));

/**wd.findElement(By.name("searchstring")).click();
    wd.findElement(By.name("searchstring")).clear();
    wd.findElement(By.name("searchstring")).sendKeys("\\9");
 wd.findElement(By.id("content")).click();
 */

  }
  }

