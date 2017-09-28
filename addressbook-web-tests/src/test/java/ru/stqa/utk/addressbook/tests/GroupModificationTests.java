package ru.stqa.utk.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.utk.addressbook.model.GroupData;

/**
 * Created by Tonya on 16.09.2017.
 */
public class GroupModificationTests extends TestBased {

    @Test
public void testGroupModification () {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test6", null, null));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();

    }
}
