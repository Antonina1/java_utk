package ru.stqa.utk.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.utk.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

/**
 * Created by Tonya on 16.09.2017.
 */
public class GroupModificationTests extends TestBased {

    @Test
public void testGroupModification () {
        app.getNavigationHelper().gotoGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();// int before = app.getGroupHelper().getGroupCounter();
        app.getGroupHelper().selectGroup(before.size()-1);
        app.getGroupHelper().initGroupModification();

        GroupData groupData = new GroupData(before.get(before.size()-1).getId(), "test6", null, null);
        app.getGroupHelper().fillGroupForm(groupData);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();//int after = app.getGroupHelper().getGroupCounter();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size()-1);
        before.add(groupData);
        Assert.assertEquals(new HashSet<>(before),new HashSet<>(after));
    }
}
