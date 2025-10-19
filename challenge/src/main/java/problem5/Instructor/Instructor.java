package instructor;

public class Instructor extends Person {
    private String employeeNumber;
    private Subject subject;

    public Instructor(
            String firstName,
            String secondName,
            String telephone,
            String email,
            String employeeNumber,
            Subject subject) {
        super(firstName, secondName, telephone, email);
        this.employeeNumber = employeeNumber;
        this.subject = subject;
    }


    public String cleanEmployeeNumber() {
        if (employeeNumber == null) return "";
        return employeeNumber.trim().replaceAll("\\s+", "");
    }


    public String summaryLine() {
        return String.format(
            "Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
            this.cleanEmployeeNumber(),
            this.getSecondName(),
            this.getFirstName()
        );
    }

    public String toCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor\n");
        sb.append("----------\n");
        sb.append(String.format("Employee #: %s%n", this.cleanEmployeeNumber()));
        sb.append(String.format("Name : %s, %s%n", this.getSecondName(), this.getFirstName()));
        sb.append(String.format("Email : %s%n", this.getEmail()));
        sb.append(String.format("Phone : %s", this.getPhone()));
        return sb.toString();
    }


    public String displayName() {
        StringBuilder sb = new StringBuilder();
        if (this.getSecondName() != null) sb.append(this.getSecondName());
        if (this.getFirstName() != null) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(this.getFirstName());
        }
        return sb.toString().trim();
    }


}
