package ru.stqa.utk.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.utk.addressbook.model.ContactData;

/**
 * Created by Tonya on 16.09.2017.
 */
public class ContactHelper extends HelperBase{

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }
    public void gotoContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillContactDataForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getUserfirstname());
        type(By.name("lastname"),contactData.getUserlastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("address"), contactData.getUseraddress());
        type(By.name("mobile"),contactData.getUsermobile());
       }
    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }
}
