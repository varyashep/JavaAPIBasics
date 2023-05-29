
package Seminar3;
import java.util.Comparator;
import java.util.Random;
import java.util.ArrayList;

public class Seminar3 {
    public static void main(String[] args) { // обратная сортировка списка
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list1.add(new Random().nextInt(10));
        } 
        list1.forEach(n -> System.out.print(n + " "));

        list1.sort(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return -1;
                else if (o1 == o2) return 0;
                else return 1;
            }
        });
        System.out.println();
        list1.forEach(n -> System.out.print(n + " "));

    }
}
