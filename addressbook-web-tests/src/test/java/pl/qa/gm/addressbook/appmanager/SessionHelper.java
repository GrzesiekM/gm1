package pl.qa.gm.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ThinkPad on 17.12.2016.
 */
public class SessionHelper {
  private FirefoxDriver wd;

  public SessionHelper(FirefoxDriver wd) {

    this.wd = wd;
  }
  public void login(String username, String password) {


    wd.get("http://localhost/addressbook/addressbook/");
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    wd.findElement(By.name("searchstring")).click();
    wd.findElement(By.name("searchstring")).sendKeys("\\9");
    wd.findElement(By.id("content")).click();
  }
  }

