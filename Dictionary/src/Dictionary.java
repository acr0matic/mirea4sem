import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
    private Bucket[] buckets = new Bucket[1000];
    private String[] defaultDictionary = {"pen", "Ручка", "cat", "Кот", "dog", "Собака", "cow", "Корова"};
    private ArrayList<Pair> list = new ArrayList<>();
    private File file = new File("dictionary.txt");

    public void writeInFile(String key, String value)
    {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(value + "-" + key + "\n");
            fileWriter.flush();
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public String getValue(String key)
    {
        int index = getHash(key);
        return buckets[index].getValue(key);
    }

    public void put(String key, String value)
    {
        int index = getHash(key);
        buckets[index].put(key, value);
        writeInFile(key, value);
    }

    public void init ()
    {
        for (int i = 0; i < buckets.length ; i++)
            buckets[i] = new Bucket();

        try {
            if(file.createNewFile())
                for (int i = 0; i < defaultDictionary.length; i+=2)
                    writeInFile(defaultDictionary[i], defaultDictionary[i+1]);

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] subLine = line.split("-");
                for (Pair pair : list)
                    if (pair.key.equals(subLine[0]) || pair.value.equals(subLine[1]))
                        return;
                buckets[getHash(subLine[1])].put(subLine[1], subLine[0]);
            }
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }

    private int getHash(String firstChar)
    {
        char Char = firstChar.charAt(0);
        int hashNum = (int) Char;

        if (hashNum <= 90)
            hashNum -= 65;
        else
            hashNum -= 97;
        return hashNum;
    }
}
