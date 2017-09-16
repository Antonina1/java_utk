package ru.stqa.utk.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Tonya on 14.09.2017.
 */
public class NavigationHelper extends HelperBase{

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }
    public void gotoGroupPage() { click(By.linkText("groups"));
    }
}
