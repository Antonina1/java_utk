package ru.stqa.utk.addressbook.tests;

import java.util.Date;

/**
 * Created by Tonya on 9/8/2018.
 */
public class Employee {
        private String name;
        private String reportName;
        private Date businessDate;
        private String status;

        public Employee(String name, String reportName, Date businessDate, String status) {
            this.setName(name);
            this.setReportName(reportName);
            this.setBusinessDate(businessDate);
            this.setStatus(status);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Getters and Setters (Omitted for brevity)
    }

