//. Доработайте код так, чтобы он показывал еще и количество уникальных имён.
package lesson_8.hash5;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Unique_2 {
public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    fillNames(names);
    System.out.println("Общее количество имён: " + names.size());
    Set<String> unique2 = new HashSet<>(names);
    for(String item: unique2){
            System.out.println("имён: " + item);

    }
    System.out.println("Количество уникальных имён: " + unique2.size());
}
private static void fillNames(List<String> names) {
    names.add("Арман");
    names.add("Пётр");
    names.add("Дамир");
    names.add("Арман");
    names.add("Дамир");
    names.add("Алуа");
    names.add("Алан");
    names.add("Максат");
    }
}
