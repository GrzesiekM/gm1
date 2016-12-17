package pl.qa.gm.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pl.qa.gm.addressbook.appmanager.ApplicationManager;

/**
 * Created by ThinkPad on 17.12.2016.
 */
public class TestBase {
  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }




}
