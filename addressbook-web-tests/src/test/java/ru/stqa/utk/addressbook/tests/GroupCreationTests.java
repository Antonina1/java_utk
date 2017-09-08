package ru.stqa.utk.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.utk.addressbook.model.GroupData;

public class GroupCreationTests extends TestBased {

    @Test
    public void testGroupCreation() {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test6", "test7", "test8"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
