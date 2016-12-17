package pl.qa.gm.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by ThinkPad on 17.12.2016.
 */
public class TestBase {
  FirefoxDriver wd;


  public static boolean isAlertPresent(FirefoxDriver wd) {
      try {
          wd.switchTo().alert();
          return true;
      } catch (NoAlertPresentException e) {
          return false;
      }
  }

  @AfterMethod
  public void tearDown() {
      wd.quit();
  }

  @BeforeMethod
  public void setUp() throws Exception {
    login("admin", "secret");
  }

  private void login(String username, String password) {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
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

  protected void returnToGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  protected void submiteGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  protected void fillGroupForm(GroupData groupData) {
    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();
    wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
    wd.findElement(By.name("group_header")).click();
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys(groupData.getHeder());
    wd.findElement(By.name("group_footer")).click();
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  public void initGroupCreation() {
    wd.findElement(By.name("new")).click();
  }

  public void gotoGroupPage() {
    wd.findElement(By.linkText("grupy")).click();
  }

  @BeforeMethod


  private void loginn(String username, String passwrod) {
      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).clear();
      wd.findElement(By.name("user")).sendKeys(username);
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys(passwrod);
      wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  protected void submit() {
      wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  protected void FillContactForm(ContactData contactData) {
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(contactData.getName());
      wd.findElement(By.name("middlename")).click();
      wd.findElement(By.name("middlename")).clear();
      wd.findElement(By.name("middlename")).sendKeys(contactData.getSecondName());
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(contactData.getEmail());
  }

  protected void initNameContactCreation() {
      wd.findElement(By.name("firstname")).click();
  }

  protected void gotoContactPage() {
      wd.findElement(By.linkText("nowy wpis")).click();
  }



  public void deleteSelectedGroups() {
      wd.findElement(By.name("delete")).click();
  }

  public void selectGroup() {
      wd.findElement(By.name("selected[]")).click();
  }
}
