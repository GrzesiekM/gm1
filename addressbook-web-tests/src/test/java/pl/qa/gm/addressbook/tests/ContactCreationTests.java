package pl.qa.gm.addressbook.tests;

import org.testng.annotations.Test;

import pl.qa.gm.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void contactCreation() {


        app.gotoContactPage();
        app.initNameContactCreation();
        app.FillContactForm(new ContactData("Grzegorz", "Mazurek", "grzegorz@gm.pl"));
        app.submit();
    }

}
