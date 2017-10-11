package ru.stqa.utk.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.utk.addressbook.model.GroupData;

public class GroupCreationTests extends TestBased {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test6", null, null));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
