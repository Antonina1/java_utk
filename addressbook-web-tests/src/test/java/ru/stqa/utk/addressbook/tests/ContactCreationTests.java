package ru.stqa.utk.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.utk.addressbook.model.ContactData;

public class ContactCreationTests extends TestBased{

    @Test
    public void testNewContact() {
        app.getContactHelper().gotoContactCreation();
        app.getContactHelper().fillContactDataForm(new ContactData("Ivan", "Ivanov", "Ivane", "krakow", "12345"));
        app.getContactHelper().submitContactCreation();
    }

}

