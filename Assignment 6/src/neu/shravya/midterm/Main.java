package neu.shravya.midterm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<>();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        students.add(new Student(0, "bellevue", 3.9, format.parse("01/01/1981" )));

        students.add(new Student(1, "Apple", 2.9, format.parse("03/01/1960")));

        students.add(new Student(2, "cat", 5.9, format.parse("03/01/1970")));

        System.out.println("Question 1");
        System.out.println("Original List");
        printStudents(students);
        System.out.println("******************");

        System.out.println("List sorted using StudentNameAscendingComparator");
        students.sort(new StudentNameAscendingComparator());
        printStudents(students);
        System.out.println("******************");

        System.out.println("List sorted using StudentGPADescendingComparator");
        students.sort(new StudentGPADescendingComparator());
        printStudents(students);
        System.out.println("******************");

        System.out.println("List sorted using StudentDateOfBirthAscendingComparator");
        students.sort(new StudentDateOfBirthAscendingComparator());
        printStudents(students);
        System.out.println("******************");

        System.out.println("Question 2");
        DrivingLicenseApplication.ReadAgeFromConsole();

    }

    public static void printStudents(List<Student> students) {
        for (Student student: students) {
            System.out.println( "Id:" + student.getId() + " Name:" + student.getName() + " GPA:" + student.getGPA() + " DateOfBirth" + student.getDateOfBirth());
        }
    }

}
