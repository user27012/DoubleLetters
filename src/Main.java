import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание списка и добавление слов в него
        List<String> words = new ArrayList<>();
        words.add("WAKE UP");
        words.add("SCHOOL");
        words.add("RUST");
        words.add("REPEAT");

        // Вызов метода для удвоения слов
        doubleValues(words);

        // Вывод результата на экран
        for (String word : words) {
            System.out.println(word);
        }
    }

    // Метод для удвоения слов в коллекции
    public static void doubleValues(List<String> list) {
        List<String> originalWords = new ArrayList<>(list);
        list.clear(); // Очищаем исходный список

        for (String word : originalWords) {
            list.add(word);
            list.add(word); // Добавляем слово дважды
        }
    }
}
