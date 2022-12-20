import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String maxName = null;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Введите имя с большой буквы или наберите \"end\" для завершения программы: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Программа завершена!");
                break;
            }
            String name = input;
            char firstCharacter = name.charAt(0);

            if (Character.isUpperCase(firstCharacter)) {
                if (maxName == null) {
                    System.out.println("Это первое введённое имя!");
                    maxName = name;
                } else if (name.length() > maxName.length()) {
                    maxName = name;
                    System.out.println("Самое длинное имя: " + maxName);
                } else {
                    System.out.println("Самое длинное имя: " + maxName);
                    System.out.println("Не хватило символов: " + (maxName.length() - name.length()));
                }
            } else {
                System.out.println("Имена нужно вводить с большой буквы!");
            }
        }
    }
}
