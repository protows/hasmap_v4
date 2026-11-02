//Измените код таким образом, чтобы в консоль не выводились дубликаты одной и той же
//песни, если её слушали больше одного раза. Также нужно сохранить изначальный порядок
//прослушивания.
package lesson_8.hash5;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class V3LinkedHashSet {
public static void main(String[] args) {
    List<String> songs = new ArrayList<>();
    fillSongs(songs);
    System.out.println("Количество песен: " + songs.size());
    
    Set<String> unique = new LinkedHashSet<>();
    for(String song: songs){
        unique.add(song);
    }
    

     for (String song : unique) {
            System.out.println("name: " + song);
        }
}
private static void fillSongs(List<String> songs) {
    songs.add("Sting – Shape Of My Heart");
    songs.add("Gorillaz – Clint Eastwood");
    songs.add("Lady Gaga – Bad Romance");
    songs.add("Taylor Swift – Wildest Dreams");
    songs.add("Ariana Grande – 7 rings");
    songs.add("Depeche Mode – Personal Jesus");
    songs.add("Gorillaz – Clint Eastwood");
    songs.add("Lady Gaga – Bad Romance");
    songs.add("Bruno Mars – Talking To The Moon");
    songs.add("Taylor Swift – Wildest Dreams");
    }
}
