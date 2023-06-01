package Seminar5;

import java.util.ArrayList;
import java.util.HashMap;

public class Seminar5 {
    
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("Russia", "Moscow");
        map.put("Germany", "Berlin");
        map.put("China", "Beijin");
        map.put("France", "Paris");
        map.put("Austria", "Vienna");
        map.put("South Korea", "Seoul");

        System.out.println(map);

        ArrayList<String> keys = new ArrayList<>();
        keys.addAll(map.keySet());
        //System.out.println(keys);
        for (int i = 0; i < keys.size(); i++) { // добавление ко всем значениям символ восклицательного знака
            map.compute(keys.get(i), (k,v) -> v+"!");
        }
        System.out.println(map);

        HashMap<String,String> map2 = new HashMap<>();
        map2.put("Russia", "Saint-Petersburg");
        map2.put("Netherlands", "Amsterdam");
        map2.put("Norway", "Oslo");
        map2.put("South Korea", "Busan");

        ArrayList<String> keys2 = new ArrayList<>();
        keys2.addAll(map2.keySet());
        for (int i = 0; i < keys2.size(); i++) {
            if (map.containsKey(keys2.get(i))) {
                map.put(keys2.get(i), map2.get(keys2.get(i)));
            }
        }

        System.out.println(map);
    }
}
