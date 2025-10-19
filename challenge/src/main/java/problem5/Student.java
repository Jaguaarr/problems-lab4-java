package problem5;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major = major;
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major = new Major("101", "Computer Science");
    }

    // Getters


    // Setters


    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "cne='" + cne + '\'' +
                ", major=" + major +
                '}';
    }

    public String getFullNameFormatted(){
        String output = String.format(this.getSecondName().toLowerCase()+", "+ this.getFirstName());
        return output;
    }
}
