package ru.stqa.utk.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.utk.addressbook.appmanager.ApplicationManager;

/**
 * Created by Tonya on 07.09.2017.
 */
public class TestBased {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();

    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
