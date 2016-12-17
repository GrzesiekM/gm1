package pl.qa.gm.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import pl.qa.gm.addressbook.model.GroupData;

/**
 * Created by ThinkPad on 17.12.2016.
 */
public class  GroupHelper extends HelperBase{

  public GroupHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }

  public void submiteGroupCreation() {
    click();
  }

  private void click() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {

    type(By.name("group_header"), groupData.getHeder());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }
}
