package ru.stqa.utk.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.utk.addressbook.model.GroupData;

import java.util.List;

public class GroupCreationTests extends TestBased {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
       // int before = app.getGroupHelper().getGroupCounter();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test6", null, null));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size()+1);
    }

}
