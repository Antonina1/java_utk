package ru.stqa.utk.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBased{
    
    @Test
    public void testGroupDeletion()  {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteGroup();
        app.returnToGroupPage();
    }

}
