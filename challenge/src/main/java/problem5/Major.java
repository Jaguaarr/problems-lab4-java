package problem5;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;


    public Major(String code, String name) {
        this.code = code;
        this.name = name;
        this.students = new Student[50];
        this.studentCount = 0;


    }
    public Student findStudentByCNE(String cne) {
        for (Student student : students) {
            if (student.getCne().equals(cne)) {
                return student;
            }

        }
        return null;
    }
    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount < 50) {
            students[studentCount++] = s;
        }
        else{
            System.out.println("The major is full, the student cannot be added!");
        }
    }

    // Getters


    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public boolean removeStudentByCNE(String cne) {
        for (int i = 0; i<studentCount; i++) {
            if (students[i].getCne().equals(cne)) {
                for (int j=i; j<studentCount-1; j++) {
                    students[j]=students[j+1];
                }
                studentCount--;
                return true;
            }
        }
        return false;
    }
    public void getOccupancyRate() {
        double occupancyRate = 100 * studentCount/50.0;
        System.out.println("The occupancy rate is " + occupancyRate + "%");

    }
    public StringBuilder getStudentListAsString() {
        StringBuilder studentList = new StringBuilder();
        for (Student student : students) {
            studentList.append(student.toString());
        }
        return studentList;
    }
    // Display all students in the major
    public void displayStudents() {
        for (int i = 0; i < studentCount; i++) {
            Student s = students[i];
            System.out.println((i + 1) + ". " + s.getCne() + "  " + s.getSecondName() + " " + s.getFirstName());
        }
    }



}
