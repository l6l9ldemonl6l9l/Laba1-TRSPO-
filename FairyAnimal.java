import java.io.*;
import java.util.Date;

public class FairyAnimal{
    final private String name;
    private Date lastLunchTime;
    private int energy;

    public FairyAnimal(String name, Date lastLunchTime,int energy) {
        this.name = name;
        this.lastLunchTime = lastLunchTime;
        this.energy = energy;
    }

    public String getName() {
          return name;
    }

    public void eat() {
         this.lastLunchTime = new Date();
         this.energy+=20;
    }

    public void hunting() {
         this.energy-=10;
    }


}
