/* REGISTRATION NUMBER:Ct100/G/100/24362/24
NAME:KARUBIU MILELE WANJIRU
*/
public class StudentRecord {
    // Fields to store student details
    private String studentID;
    private String name;
    private String course;

    // Constructor to initialize the fields
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to print student details
    public void displayInfo() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student ID : " + studentID);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course);
        System.out.println("------------------------");
    }
}
import java.util.Scanner;

/*part b*/

public class StudentApp {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompting the user for data
        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        // Instantiate the StudentRecord object with user data
        StudentRecord student = new StudentRecord(id, name, course);

        // Display the results
        student.displayInfo();

        // Close the scanner
        input.close();
    }
}
