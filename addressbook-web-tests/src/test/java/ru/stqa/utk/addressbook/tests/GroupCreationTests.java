package ru.stqa.utk.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.utk.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBased {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
       // int before = app.getGroupHelper().getGroupCounter();
        app.getGroupHelper().initGroupCreation();
        GroupData groups = new GroupData("test6", null, null);
        app.getGroupHelper().fillGroupForm(groups);
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size()+1);

        before.add(groups);
        int max=0;
        for (GroupData g: after)
        {
            if (g.getId()> max){
               max = g.getId();
            }
        }
        groups.setId(max);
        before.add(groups);
        Assert.assertEquals(new HashSet<>(before),new HashSet<>(after));
    }

}
