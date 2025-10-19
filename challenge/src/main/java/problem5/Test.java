package problem5;

import Instructor.Instructor;
import Instructor.Subject;

public class Test {

    public static void main(String[] args) {
        // === PARTIE 1 : Étudiants et filière ===

        Major csMajor = new Major("23", "Computer Science");

        Student s1 = new Student("SAFI", "Amal", "0612345678", "amal.safi@example.com", "22885676", csMajor);
        Student s2 = new Student("ALAMI", "Samir", "0698765432", "samir.alami@example.com", "23585976", csMajor);
        Student s3 = new Student("ZAKI", "Lina", "0677889900", "lina.zaki@example.com", "24011234", csMajor);

        csMajor.addStudent(s1);
        csMajor.addStudent(s2);
        csMajor.addStudent(s3);

        System.out.println("===== List of Students in " + csMajor.getName() + " =====");
        csMajor.displayStudents();

        System.out.println("\n===== Test: Find Student by CNE =====");
        String searchCNE = "23585976";
        Student found = csMajor.findStudentByCNE(searchCNE);
        if (found != null) {
            System.out.println("Student with CNE " + searchCNE + " found: " + found.getSecondName() + " " + found.getFirstName());
        } else {
            System.out.println("No student found with CNE " + searchCNE);
        }

        System.out.println("\n===== Test: Occupancy Rate =====");
        csMajor.getOccupancyRate();

        System.out.println("\n===== Test: Remove Student =====");
        boolean removed = csMajor.removeStudentByCNE("22885676");
        if (removed) {
            System.out.println("Student with CNE 22885676 removed successfully.");
        } else {
            System.out.println("Failed to remove student with CNE 22885676.");
        }

        System.out.println("\n===== Updated Student List =====");
        csMajor.displayStudents();

        System.out.println();
        csMajor.getOccupancyRate();


        // === PARTIE 2 : Instructeur et matière (du package instructor) ===

        System.out.println("\n\n===== Instructor and Subject Tests =====");

        // Création d'une matière (Subject)
        Subject subject1 = new Subject(1, " cs-101 ", "introduction to java");

        // Création d'un instructeur
        Instructor instructor1 = new Instructor(
                "Alice",           // first name
                "Smith",           // last name
                "0611223344",      // phone
                "alice.smith@univ.ma", // email
                " AB 123 ",        // employee number
                subject1           // subject
        );

        // Tests des méthodes demandées
        System.out.println("Clean Employee Number: " + instructor1.cleanEmployeeNumber());
        System.out.println("Summary Line: " + instructor1.summaryLine());
        System.out.println("\nInstructor Card:\n" + instructor1.toCard());
        System.out.println("Display Name: " + instructor1.displayName());

        System.out.println("\nNormalized Code: " + subject1.normalizedCode());
        System.out.println("Proper Title: " + subject1.properTitle());
        System.out.println("Is Intro Course? " + subject1.isIntroCourse());
        System.out.println("Syllabus Line: " + subject1.syllabusLine(instructor1));
    }
}
