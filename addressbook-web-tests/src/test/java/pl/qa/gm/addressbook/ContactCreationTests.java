
import org.testng.annotations.Test;

import pl.qa.gm.addressbook.ContactData;
import pl.qa.gm.addressbook.TestBase;

public class ContactCreationTests extends TestBase{

    @Test
    public void contactCreation() {


        gotoContactPage();
        initNameContactCreation();
        FillContactForm(new ContactData("Grzegorz", "Mazurek", "grzegorz@gm.pl"));
        submit();
    }

}
