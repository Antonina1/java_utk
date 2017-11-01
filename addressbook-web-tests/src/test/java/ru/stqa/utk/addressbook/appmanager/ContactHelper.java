package ru.stqa.utk.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.utk.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Tonya on 16.09.2017.
 */
public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }
    public void gotoContactHome() {
        click(By.linkText("home"));
    }
    public void gotoContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillContactDataForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getUserfirstname());
        type(By.name("lastname"),contactData.getUserlastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("address"), contactData.getUseraddress());
        type(By.name("mobile"),contactData.getUsermobile());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
       }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void initContactModificaton () {click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")); }

    public void submitContactModification(){click(By.name("update"));}

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements(By.name("selected[]"));
        for (WebElement element : elements) {
            String name = element.getText();
            ContactData contact = new ContactData(name, null, null, null, null,"test1");
            contacts.add(contact);
        }
        return contacts;
    }
}