package ru.stqa.utk.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.utk.addressbook.model.ContactData;

import java.util.List;

/**
 * Created by Tonya on 01.10.2017.
 */

public class ContactModificationTests extends TestBased {
    @Test
    public void testContactModification() {
        app.getContactHelper().gotoContactHome();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().initContactModificaton();
        app.getContactHelper().fillContactDataForm(new ContactData("Ivan", null, null, null, null, null), false);
        app.getContactHelper().submitContactModification();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(),before.size());
    }
}
