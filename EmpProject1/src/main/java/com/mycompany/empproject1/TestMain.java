package com.mycompany.empproject1;

import java.time.LocalDate;

public class TestMain {

    public static void main(String[] args) {
        
        HourlyEmployee emp1 = new HourlyEmployee(2134324, "Juan Dela Cruz", LocalDate.now(), LocalDate.of(1990, 1, 1), 45, 10.0f);
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(212342, "Mikee Dionson", LocalDate.now(), LocalDate.of(2003, 9, 10));
        CommissionEmployee emp3 = new CommissionEmployee(113453, "Xander Labide", LocalDate.of(2022, 6, 15), LocalDate.of(1990, 5, 10));
        BasePlusCommission emp4 = new BasePlusCommission(1123125, "John Cena", LocalDate.of(2022, 6, 15), LocalDate.of(1990, 5, 10), 120000, 0.05, 1500.0);
        

        System.out.println("HOURLY EMPLOYEE\n");
        emp1.displayInfo();
        System.out.println("");
        
        System.out.println("PIECE WORKER EMPLOYEE\n");
        emp2.displayInfo();
        System.out.println("");
        
        System.out.println("COMMISSION EMPLOYEE\n");
        emp3.displayInfo();
        System.out.println("");
        
        System.out.println("BASE PLUS COMMISSION EMPLOYEE\n");
        emp4.displayInfo();
        
        
        
        
       
   
    }
}
