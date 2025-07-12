
import com.tamil.assignments.employees.*;
import com.tamil.assignments.utilities.*;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("tamil", "M001", 80000, "HR");
        Developer dev = new Developer("krishna", "D002", 75000, "Java");

        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(mgr);
        System.out.println("Department: " + mgr.getDepartment());

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(dev);
        System.out.println("Language: " + dev.getProgrammingLanguage());
    }
}