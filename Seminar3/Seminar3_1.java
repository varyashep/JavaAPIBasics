package Seminar3;
import java.util.Comparator;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

public class Seminar3_1 {
    
    public static void main(String[] args) { // удаление четных элементов списка
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(15));
        }

        list.forEach(n -> System.out.print(n + " "));

        System.out.println();

        Iterator<Integer> arrIterator = list.iterator();
        while (arrIterator.hasNext()) {

            int nextNum = arrIterator.next();
            if (nextNum % 2 == 0) {
                arrIterator.remove();
            }
        }
        list.forEach(n -> System.out.print(n + " "));

        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;
        
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            if (list.get(i) < min) {
                min = list.get(i);
            }
            sum += list.get(i);
        }

        float average = sum / list.size();

        System.out.printf("\nМаксимальное значение: %d\n", max);
        System.out.printf("Минимальное значение: %d\n", min);
        System.out.printf("Среднее значение: %f", average);

        System.out.println();

        ArrayList <Integer> list2 = new ArrayList<>(); // объединение списков без повторения элементов
        for (int i = 0; i < 10; i++) {
            list2.add(new Random().nextInt(15));
        }

        list2.forEach(n -> System.out.print(n + " "));

        System.out.println();

        list2.removeAll(list);

        list.addAll(list2);

        list.forEach(n -> System.out.print(n + " "));
    }
}
