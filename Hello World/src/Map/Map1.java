package Map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);

        for (String key: map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
// HashMap добавляет элементы в случайном порядке
// LinkedHashMap добавляет элементы в нужное место
//TreeMap добавляет элементы сортируя их

//Ключи в Map должны быть уникальные иначе перезапись