package pl.qa.gm.addressbook.tests;

import org.testng.annotations.Test;
import pl.qa.gm.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test`", "test2", "test3"));
    app.getGroupHelper().submiteGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
