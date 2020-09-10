import java.io.*;
import java.util.UUID;

public class AnimalLife{
  private final UUID id;
  final private Fox fox;
  final private Crow crow;
  final private Terrain terrain;

  public AnimalLife(UUID id,Fox fox,Crow crow, Terrain terrain){
      this.id=id;
      this.fox = fox;
      this.crow = crow;
      this.terrain=terrain;
  }

  public UUID getID() {
    return id;
  }

  public void showInformation(){
      System.out.println("Лиса:"+ fox.getName()+". Ворона:"+ crow.getName() +".\nМесто:"+ terrain.getName()+".");
  }

  public Status foodDispute(Food food){
      if (food.getTaste()<terrain.getSizeBeauty()){
        return(lunch());
      }
      else{
        return(Status.NoEating);
      }
  }

  public Status lunch(){
      fox.hunting();
      fox.voiceVin();
      if (crow.getSizeMind()<fox.getSizeCunning()*terrain.getSizeBeauty()){
        crow.voiceFail();
        fox.eat();
        return(Status.FoxEating);
      }
      else{
        crow.voiceVin();
        crow.eat();
        fox.voiceFail();
        return(Status.CrowEating);
      }
  }

}
