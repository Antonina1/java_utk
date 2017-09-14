package ru.stqa.utk.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBased{
    
    @Test
    public void testGroupDeletion()  {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToGroupPage();
    }

}
