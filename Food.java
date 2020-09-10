import java.io.*;
import java.util.Date;
import java.util.UUID;

final public class Food{
  private final int taste;
  private final String kindFood;
  private final Date birthday;
  private final UUID id;

  public Food(int taste, String kindFood,UUID id) {
      this.birthday = new Date();
      this.taste = taste;
      this.kindFood = kindFood;
      this.id =id;
  }

  public UUID getID() {
    return id;
  }

  public int getTaste() {
    return taste;
  }

  public String getKindFood() {
    return kindFood;
  }

}
