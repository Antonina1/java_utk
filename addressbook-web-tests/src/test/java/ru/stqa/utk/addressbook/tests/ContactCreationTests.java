package ru.stqa.utk.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.utk.addressbook.model.ContactData;

import java.util.List;

public class ContactCreationTests extends TestBased{

    @Test
    public void testNewContact() {
        app.getContactHelper().gotoContactHome();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().gotoContactCreation();
        //int before = app.getGroupHelper().getGroupCounter();
        app.getContactHelper().fillContactDataForm(new ContactData("Ivan", null, null, null, null, "test2"),true );
        app.getContactHelper().submitContactCreation();
       // List<ContactData> before = app.getContactHelper().getContactList(); int after = app.getGroupHelper().getGroupCounter();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size()+1);
    }

}

