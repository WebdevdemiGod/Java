
package com.mycompany.empproject1;

import java.time.LocalDate;


public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;
    public PieceWorkerEmployee() {
    }

    
    public PieceWorkerEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = 100;
        this.ratePerPiece = 20.0f; 
    }

    
    public PieceWorkerEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate,
            float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = 0;
        this.ratePerPiece = ratePerPiece;
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

    public LocalDate getEmpBirthDate() {
        return empBirthDate;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
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

    public void setEmpBirthdate(LocalDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    
    public double computeSalary() {
        int bonusPieces = totalPiecesFinished / 100;
        return totalPiecesFinished * ratePerPiece + bonusPieces * 10 * ratePerPiece;
    }

    
    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate Per Piece: $" + ratePerPiece);
        System.out.println("Salary: $" + computeSalary());
    }

    
    @Override
    public String toString() {
        return "Employee Information:\n"
                + "Employee ID: " + empID + "\n"
                + "Employee Name: " + empName + "\n"
                + "Date Hired: " + empDateHired + "\n"
                + "Date of Birth: " + empBirthDate + "\n"
                + "Total Pieces Finished: " + totalPiecesFinished + "\n"
                + "Rate Per Piece: $" + ratePerPiece + "\n"
                + "Salary: $" + computeSalary();
    }
}

