import java.io.File;
import java.util.ArrayList;

public class Bucket {
    private ArrayList<Pair> list = new ArrayList<>();
    private File file = new File("dictionary.txt");



    public void put(String key, String value) {
        for (Pair pair : list)
            if (pair.key.equals(key) || pair.value.equals(value)) {
                System.out.println("Данное слово или перевод уже есть в словаре.");
                return;
            }
        list.add(new Pair(key, value));
        }

    public String getValue(String key) {
        for (Pair pair : list) {
            if (pair.key.equals(key))
                return pair.value;
        }
        return null;
    }
}
