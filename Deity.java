import java.io.*;
import java.util.Date;

public class Deity{
    private String name;
    private final Date age;

    public Deity(String name, Date age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
         return name;
     }
     public Date getAge(){
         return age;
     }

    public void think() {
      System.out.println("I am thinking");
    }
    public void carelessness() {
      System.out.println("I lost food");
    }
}
