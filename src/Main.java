import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем список А и заполняем его 5 строками, вводимыми пользователем
        List<String> listA = new ArrayList<>();
        System.out.println("Введите 5 строк для списка А:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);
        }

        // Выводим список А
        System.out.println("Список А:");
        for (String a : listA) {
            System.out.println(a);
        }

        // Создаем список Б и заполняем его 5 строками, вводимыми пользователем
        List<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк для списка Б:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listB.add(input);
        }

        // Выводим список Б
        System.out.println("Список Б:");
        for (String b : listB) {
            System.out.println(b);
        }

        // Объединяем списки А и Б в список С
        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        // Выводим список С
        System.out.println("Список С:");
        for (String c : listC) {
            System.out.println(c);
        }

        // Сортируем список С по длине слова
        Collections.sort(listC, Comparator.comparingInt(String::length));

        // Выводим отсортированный список С
        System.out.println("Отсортированный список С:");
        for (String readyC : listC) {
            System.out.println(readyC);
        }
    }
}
