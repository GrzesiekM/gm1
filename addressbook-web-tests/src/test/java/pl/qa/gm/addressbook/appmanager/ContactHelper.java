package pl.qa.gm.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import pl.qa.gm.addressbook.model.ContactData;

/**
 * Created by ThinkPad on 17.12.2016.
 */
public class ContactHelper {
 private FirefoxDriver wd;

  public ContactHelper(FirefoxDriver wd) {
    this.wd=wd;
  }

  @BeforeMethod


  public void loginn(String username, String passwrod) {
      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).clear();
      wd.findElement(By.name("user")).sendKeys(username);
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys(passwrod);
      wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  public void FillContactForm(ContactData contactData) {
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(contactData.getName());
      wd.findElement(By.name("middlename")).click();
      wd.findElement(By.name("middlename")).clear();
      wd.findElement(By.name("middlename")).sendKeys(contactData.getSecondName());
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(contactData.getEmail());
  }

  public void initNameContactCreation() {
      wd.findElement(By.name("firstname")).click();
  }

  public void gotoContactPage() {
      wd.findElement(By.linkText("nowy wpis")).click();
  }
}
