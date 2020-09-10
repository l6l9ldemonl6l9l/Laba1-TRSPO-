import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public class DeityLife extends Date{
    private HashMap<UUID, AnimalLife> animalsLife = new HashMap<>();
    private HashMap<UUID, Food> foods = new HashMap<>();
    private Deity deity;

    public DeityLife (Deity deity){
      this.deity=deity;
    }

    public void addAnimalLife(AnimalLife animalLife){
        animalsLife.put(animalLife.getID(), animalLife);
    }

    public void addFood(Food food){
        foods.put(food.getID(), food);
    }
    
    public AnimalLife getAnimalLifeByID(UUID animalLifeID){
        return animalsLife.getOrDefault(animalLifeID, null);
    }

    public Food getFoodByID(UUID foodID){
        return foods.getOrDefault(foodID, null);
    }

    public void startStory(){
        showInformation();
        for ( AnimalLife value1 : animalsLife.values()) {
          for ( Food value2 : foods.values()) {
                loseFood(value1.getID(),value2.getID());
            }
        }
    }

    public void showInformation(){
      System.out.println("Автор:"+deity.getName()+".\n");

      for ( AnimalLife value : animalsLife.values()) {
          value.showInformation();
      }
      for ( Food value : foods.values()) {
                System.out.println("Вид еды:"+ value.getKindFood()+".\n");
      }
    }

    public void loseFood(UUID idAnimal,UUID idFood){
      System.out.println(getAnimalLifeByID(idAnimal).foodDispute(getFoodByID(idFood)));
    }


}
