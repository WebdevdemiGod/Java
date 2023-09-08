package employee.version1;


import java.time.LocalDate;
import java.util.Date;

class HourlyEmployee {

    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {

    }

    public HourlyEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.ratePerHour = 0.25f;
    }

    public HourlyEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate,
            float totalHoursWorked, float ratePerHour) {
        this(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public int getEmpId() {
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

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setEmpId(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDateHired(LocalDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void setEmpBirthDate(LocalDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    
    
    public double computeSalary() {
        float regularHoursPerWeek = 8 * 5;
        float overtimeHours = 0.0f;

        if (totalHoursWorked > regularHoursPerWeek) {
            overtimeHours = totalHoursWorked - regularHoursPerWeek;
            totalHoursWorked = regularHoursPerWeek;
        }
        double salary = (totalHoursWorked * ratePerHour) + (overtimeHours * ratePerHour * 1.5);
        return salary;
    }
    
     public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Rate Per Hour: " + ratePerHour);
        System.out.println("Salary: $" + computeSalary());
    }
     
      @Override
    public String toString() {
        return "Employee Information:\n" +
                "Employee ID: " + empID + "\n" +
                "Employee Name: " + empName + "\n" +
                "Date Hired: " + empDateHired + "\n" +
                "Date of Birth: " + empBirthDate + "\n" +
                "Total Hours Worked: " + totalHoursWorked + "\n" +
                "Rate Per Hour: " + ratePerHour + "\n" +
                "Salary: $" + computeSalary();
    }
}
