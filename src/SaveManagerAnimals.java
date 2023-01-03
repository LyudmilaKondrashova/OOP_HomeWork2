import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveManagerAnimals {
    public void save(List<Animal> animals) {
        try {
            FileWriter writer = new FileWriter("List.txt", false);
            for (Animal item : animals) {
                writer.write(item.toString() + "\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
