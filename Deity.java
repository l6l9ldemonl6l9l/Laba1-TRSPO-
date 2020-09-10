import java.io.*;
import java.util.Date;

final public class Deity{
    private final String name;
    private final Date age;

    public Deity(String name, Date age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
         return name;
    }
    
}
