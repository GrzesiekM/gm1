package pl.qa.gm.addressbook.model;

public class ContactData {
  private final String name;
  private final String secondName;
  private final String email;

  public ContactData(String name, String secondName, String email) {
    this.name = name;
    this.secondName = secondName;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getSecondName() {
    return secondName;
  }

  public String getEmail() {
    return email;
  }
}
