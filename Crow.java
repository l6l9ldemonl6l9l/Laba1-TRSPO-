import java.io.*;
import java.util.Date;

final public class Crow extends FairyAnimal {
  final private int sizeMind;

  public Crow(String name, Date lastLunchTime, int energy,int sizeMind) {
      super(name,lastLunchTime,energy);
      this.sizeMind = sizeMind;
  }

  public int getSizeMind() {
      return sizeMind;
  }

  public void voiceVin() {
     System.out.println("Ворнона:...");
  }

   public void voiceFail() {
      System.out.println("Ворона:Kaaaaaaaaaap");
   }


}
