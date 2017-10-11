package ru.stqa.utk.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.utk.addressbook.model.ContactData;

/**
 * Created by Tonya on 01.10.2017.
 */

public class ContactModificationTests extends TestBased {
    @Test
    public void testContactModification() {
        app.getContactHelper().initContactModificaton();
        app.getContactHelper().fillContactDataForm(new ContactData("Ivan", "Ivanov", "Ivane", "krakow", "12345"));
        app.getContactHelper().submitContactCreation();
    }
}
