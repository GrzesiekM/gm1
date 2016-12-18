package pl.qa.gm.addressbook.tests;

import org.testng.annotations.Test;
import pl.qa.gm.addressbook.model.GroupData;

/**
 * Created by ThinkPad on 18.12.2016.
 */
public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("testff`", "test2ff", "test3ff"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
