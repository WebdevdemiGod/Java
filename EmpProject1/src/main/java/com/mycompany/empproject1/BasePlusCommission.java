
package com.mycompany.empproject1;
import java.time.LocalDate;

public class BasePlusCommission {
    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthdate;
    private double sales;
    private double commissionRate;
    private double baseSalary;

    public BasePlusCommission() {
    }

    public BasePlusCommission(int empID, String empName, LocalDate empDateHired, LocalDate empBirthdate, double sales, double commissionRate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthdate = empBirthdate;
        this.sales = sales;
        this.commissionRate = commissionRate;
        this.baseSalary = 100.0;
    }
    
    

    public BasePlusCommission(int empID, String empName, LocalDate empDateHired, LocalDate empBirthdate, double sales, double commissionRate, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthdate = empBirthdate;
        this.sales = sales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public LocalDate getEmpDateHired() {
        return empDateHired;
    }

    public LocalDate getEmpBirthdate() {
        return empBirthdate;
    }

    public double getSales() {
        return sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDateHired(LocalDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void setEmpBirthdate(LocalDate empBirthdate) {
        this.empBirthdate = empBirthdate;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
   public double computeSalary() {
        double rate = 0.05;

        if (sales < 100_000) {
            rate = 0.20;
        } else if (sales < 500_000) {
            rate = 0.30;
        } else {
            rate = 0.50;
        }

        return baseSalary + (sales * rate);
    }
    
    
   public void displayInfo() {
    System.out.println("Employee ID: " + empID);
    System.out.println("Employee Name: " + empName);
    System.out.println("Date Hired: " + empDateHired);
    System.out.println("Date of Birth: " + empBirthdate);
    System.out.println("Sales: $" + sales);
    System.out.println("Commission Rate: " + (commissionRate * 100) + "%");
    System.out.println("Base Salary: $" + baseSalary);
    System.out.println("Salary: $" + computeSalary());
}

@Override
public String toString() {
    return "Employee ID: " + empID +
            "\nEmployee Name: " + empName +
            "\nDate Hired: " + empDateHired +
            "\nDate of Birth: " + empBirthdate +
            "\nSales: $" + sales +
            "\nCommission Rate: " + (commissionRate * 100) + "%" +
            "\nBase Salary: $" + baseSalary +
            "\nSalary: $" + computeSalary();
}


    
    
    
}
