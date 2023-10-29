import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание списка строк и добавление 5 слов в него
        List<String> слова = new ArrayList<>();
        слова.add("ПРОСНИСЬ");
        слова.add("ШКОЛА");
        слова.add("РЖАВЧИНА");
        слова.add("ПОВТОРЯЙ");

        // Вызов метода для удвоения слов
        удвоитьЗначения(слова);

        // Вывод результата на экран
        for (String слово : слова) {
            System.out.println(слово);
        }
    }

    // Метод для удвоения слов в коллекции
    public static void удвоитьЗначения(List<String> список) {
        List<String> исходныеСлова = new ArrayList<>(список);
        список.clear(); // Очищаем исходный список

        for (String слово : исходныеСлова) {
            список.add(слово);
            список.add(слово); // Добавляем слово дважды
        }
    }
}
