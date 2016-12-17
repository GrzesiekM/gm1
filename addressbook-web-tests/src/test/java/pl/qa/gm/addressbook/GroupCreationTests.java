package pl.qa.gm.addressbook;

import org.testng.annotations.Test;



public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {

    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test`", "test2", "test3"));
    submiteGroupCreation();
    returnToGroupPage();
  }

}
