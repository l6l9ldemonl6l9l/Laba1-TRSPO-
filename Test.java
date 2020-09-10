import java.io.*;
import java.util.Date;
import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        Date date1= new Date();
        Crow crow = new Crow("Евгения", date1,33, 30);
        Date date2= new Date();
        Fox fox = new Fox("Ирина", date2,30, 25);
        Terrain terrain = new Terrain("Лес", 50);
        UUID id1 = UUID.randomUUID();
        Food food = new Food(40,"Сыр",id1);
        Date Birthday= new Date(1212121212121L);
        Deity deity = new Deity("Крылов", Birthday);
        UUID id2 = UUID.randomUUID();
        AnimalLife story =new AnimalLife (id2,fox,crow,terrain);
        DeityLife fairyStory = new DeityLife(deity);
        fairyStory.addFood(food);
        fairyStory.addAnimalLife(story);

        fairyStory.startStory();
        //story.foodDispute(food);
    }
}
