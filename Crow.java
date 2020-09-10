import java.io.*;
import java.util.Date;

public class Crow extends FairyAnimal {
  private int sizeMind;

  public Crow(String name, Date lastLunchTime, int energy,int sizeMind) {
      super(name,lastLunchTime,energy);
      this.sizeMind = sizeMind;
  }
  public int getSizeMind() {
      return sizeMind;
  }
  public void setSizeMind(int sizeMind) {
      this.sizeMind = sizeMind;
  }
  public void voiceVin() {
     System.out.println("Ворнона:...");
  }
   public void voiceFail() {
      System.out.println("Ворона:Kaaaaaaaaaap");
   }


}
