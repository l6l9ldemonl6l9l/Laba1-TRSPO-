import java.io.*;
import java.util.Date;

public class Fox extends FairyAnimal {
  private int sizeCunning;

  public Fox(String name,Date lastLunchTime,int energy, int sizeCunning) {
      super(name,lastLunchTime,energy);
      this.sizeCunning = sizeCunning;
  }
  public int getSizeCunning() {
      return sizeCunning;
  }
  public void setSizeCunning(int sizeCunning) {
      this.sizeCunning = sizeCunning;
  }
  public void voiceVin() {
      System.out.println("Лиса: Голубушка, как хороша!\n Ну что за шейка, что за глазки!\n Рассказывать, так, право, сказки!\nКакие перышки! какой носок!\nИ, верно, ангельский быть должен голосок!\nСпой, светик, не стыдись!\nЧто ежели, сестрица,\nПри красоте такой и петь ты мастерица,\nВедь ты б у нас была царь-птица!");
  }
  public void voiceFail() {
      System.out.println("Лиса: Ушла");
  }
}
