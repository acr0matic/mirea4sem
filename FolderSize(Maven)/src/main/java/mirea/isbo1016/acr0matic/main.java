package main.java.mirea.isbo1016.acr0matic;

import java.io.File;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите путь папки: ");
        getFilesFromDirectory(scanner.nextLine());
    }

    public static void getFilesFromDirectory(String path)
    {
        File file = new File(path);
        File[] listOfFile = file.listFiles();
        for (int i = 0; i < listOfFile.length; i++)
            System.out.println("File: " + listOfFile[i].getName()
                    + ", Size: " + listOfFile[i].length() / 1024 + "kb");
    }
}
