package ru.stqa.utk.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.utk.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends TestBased{
    
    @Test
    public void testGroupDeletion()  {
        app.getNavigationHelper().gotoGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
       // int before = app.getGroupHelper().getGroupCounter();
        app.getGroupHelper().selectGroup(before.size()-1);
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();// int after = app.getGroupHelper().getGroupCounter();
        Assert.assertEquals(after.size(), before.size()-1);

        before.remove(before.size()-1);
for (int i=0; i< after.size(); i++)
{
    Assert.assertEquals(before.get(i),after.get(i));
}
    }

}
