package student;

public class Test {

        public static void main(String[] args) {
            // Create a Major
            Major csMajor = new Major("23", "Computer Science");

            // Create Students
            Student s1 = new Student("SAFI", "Amal", "0612345678", "amal.safi@example.com", "22885676", csMajor);
            Student s2 = new Student("ALAMI", "Samir", "0698765432", "samir.alami@example.com", "23585976", csMajor);
            Student s3 = new Student("ZAKI", "Lina", "0677889900", "lina.zaki@example.com", "24011234", csMajor);

            // Add students to the major
            csMajor.addStudent(s1);
            csMajor.addStudent(s2);
            csMajor.addStudent(s3);

            System.out.println("===== List of Students in " + csMajor.getName() + " =====");
            csMajor.displayStudents();

            // Test: Find a student by CNE
            System.out.println("\n===== Test: Find Student by CNE =====");
            String searchCNE = "23585976";
            Student found = csMajor.findStudentByCNE(searchCNE);
            if (found != null) {
                System.out.println("Student with CNE " + searchCNE + " found: " + found.getSecondName() + " " + found.getFirstName());
            } else {
                System.out.println("No student found with CNE " + searchCNE);
            }

            // Test: Occupancy rate
            System.out.println("\n===== Test: Occupancy Rate =====");
            csMajor.getOccupancyRate();

            // Test: Remove a student
            System.out.println("\n===== Test: Remove Student =====");
            boolean removed = csMajor.removeStudentByCNE("22885676");
            if (removed) {
                System.out.println("Student with CNE 22885676 removed successfully.");
            } else {
                System.out.println("Failed to remove student with CNE 22885676.");
            }

            // Display updated list
            System.out.println("\n===== Updated Student List =====");
            csMajor.displayStudents();

            // Show final occupancy
            System.out.println();
            csMajor.getOccupancyRate();

        }
    }



