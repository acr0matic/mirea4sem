import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        String word;

        dictionary.init();
        System.out.print("Русско-Английский словарь\n");

        while (true){
            System.out.println("-----------------------\nВведите слово для перевода: ");
            word = scanner.nextLine();

            if (dictionary.getValue(word) != null)
                System.out.println("Перевод: " + dictionary.getValue(word));

            else {
                System.out.println("Такого слова нет в словаре. Добавить? (y/n)");
                if (scanner.nextLine().equals("y")) {
                    System.out.println("Введите слово на английском, затем на русском: ");
                    dictionary.put(scanner.nextLine(), scanner.nextLine());
                    System.out.println("Запись произведена!");
                }
            }
        }
    }
}
