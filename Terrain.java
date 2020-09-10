import java.io.*;

public class Terrain{
  private String name;
  private int sizeBeauty;

  public Terrain(String name, int sizeBeauty) {
      this.name = name;
      this.sizeBeauty = sizeBeauty;
  }
  public String getName() {
       return name;
   }
   public int getSizeBeauty(){
       return sizeBeauty;
   }
}
