package problem7;

public class Carpenter implements  Person{
    private String name;
    private String metier;
    public Carpenter(String name){
        this.name=name;
        this.metier="Carpenter";
    }

    public void display(){
        System.out.println("I am "+name+" the "+metier);
    }

}