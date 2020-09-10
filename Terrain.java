import java.io.*;

final public class Terrain{
  final private String name;
  final private int sizeBeauty;

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
