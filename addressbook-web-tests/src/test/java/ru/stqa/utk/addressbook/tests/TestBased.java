package ru.stqa.utk.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.utk.addressbook.appmanager.ApplicationManager;

/**
 * Created by Tonya on 07.09.2017.
 */
public class TestBased {

    public final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();

    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
