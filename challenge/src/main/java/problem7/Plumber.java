package problem7;

public class Plumber implements  Person{
    private String name;
    private String metier;
    public Plumber(String name){
        this.name=name;
        this.metier="Plumber";
    }

    public void display(){
        System.out.println("I am "+name+" the "+metier);
    }

}