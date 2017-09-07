package ru.stqa.utk.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBased{
    
    @Test
    public void testGroupDeletion()  {
        gotoGroupPage();
        selectGroup();
        deleteGroup();
        returnToGroupPage();
    }

}
