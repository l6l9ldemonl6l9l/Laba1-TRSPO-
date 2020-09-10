import java.io.*;
import java.util.Date;

public class FairyAnimal{
    private String name;
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
     public int getEnergy() {
          return energy;
      }
     public Date getLastLunchTime(){
         return lastLunchTime;
     }
     public void setLastLunchTime(Date lastLunchTime) {
         this.lastLunchTime = lastLunchTime;
     }
     public void setEnergy(int energy) {
         this.energy = energy;
     }
     public void eat() {
         this.lastLunchTime = new Date();
         this.energy+=20;
     }
     public void hunting() {
         this.energy-=10;
     }


}
