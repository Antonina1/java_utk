package ru.stqa.utk.addressbook.tests;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuiTable {
    public static void main(String[] args) throws ParseException {

        WebDriver wd;
     //   System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("http://demo.guru99.com/test/table.html");
        ArrayList<String> guiReport=new ArrayList<String>();
        //ArrayList< ArrayList<String>> fullGuiReport=new ArrayList<>();
       // ArrayList<String> fullGuiReportNew=new ArrayList<String>();
        WebElement mytable = wd.findElement(By.xpath("/html/body/table/tbody"));
        List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
        int rows_count = rows_table.size();
        for (int row = 0; row < rows_count; row++) {
            //fullGuiReport.clear();
            List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
            int columns_count = Columns_row.size();
            String line="";
            for (int column = 0; column < columns_count; column++) {
                String celtext = Columns_row.get(column).getText();
                line+=celtext + "; ";
            }
            guiReport.add(line);
        }
        for (String elem: guiReport)
        {
        System.out.println(elem);}
    }
}