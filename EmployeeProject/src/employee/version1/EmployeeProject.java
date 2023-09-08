package employee.version1;

import java.time.LocalDate;

public class EmployeeProject {

    public static void main(String[] args) {

        HourlyEmployee employee = new HourlyEmployee(69696, "Spider-Man", LocalDate.of(2032, 6, 23), LocalDate.of(2003, 10, 7), 40.0f, 10.0f);

        employee.displayInfo();
    }
}
