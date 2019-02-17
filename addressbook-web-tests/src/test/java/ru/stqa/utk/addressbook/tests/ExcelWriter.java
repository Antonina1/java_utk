package ru.stqa.utk.addressbook.tests;

import com.sun.media.sound.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Tonya on 9/11/2018.
 */
public class ExcelWriter {
    private static String[] columns = {"Test Case Name", "Report Name", "Business Date", "Status"};
    private static List<Employee> employees =  new ArrayList<>();

    static {
        Calendar BusinessDate = Calendar.getInstance();
        BusinessDate.set(2018, 7, 21);
        employees.add(new Employee("Case One", "Report 1",
                BusinessDate.getTime(),"Failed" ));

        BusinessDate.set(2018, 10, 15);
        employees.add(new Employee("Case Two", "Report 1",
                BusinessDate.getTime(), "Passed"));

        BusinessDate.set(2018, 4, 18);
        employees.add(new Employee("Case Three", "Report 2",
                BusinessDate.getTime(), "Failed"));

    }
    public static void main(String[] args) throws IOException, InvalidFormatException {
        // Create a Workbook
        Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

        CreationHelper createHelper = workbook.getCreationHelper();
        // Create a Sheet
        Sheet sheet = workbook.createSheet("Results");

        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        Row headerRow = sheet.createRow(0);

        // Create cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }
// Create Cell Style for formatting Date
        CellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        // Create Other rows and cells with employees data
        int rowNum = 1;

        for(Employee employee: employees) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(employee.getName());

            row.createCell(1)
                    .setCellValue(employee.getReportName());

            Cell dateOfBirthCell = row.createCell(2);
            dateOfBirthCell.setCellValue(employee.getBusinessDate());
            dateOfBirthCell.setCellStyle(dateCellStyle);

            row.createCell(3)
                    .setCellValue(employee.getStatus());
        }
// Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("Automation run result.xlsx");
        workbook.write(fileOut);
        fileOut.close();


        // Closing the workbook
        workbook.close();

    }
    }
