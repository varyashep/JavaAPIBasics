package Seminar3;
import java.util.ArrayList;
import java.util.LinkedList;


public class Seminar3_2 {
    
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        long startAddArr = System.currentTimeMillis();

        int count = 0;
        while (count < 10000) {
            list.add(0, 0);
            count++;
        }

        long endAddArr = System.currentTimeMillis();

        System.out.println(endAddArr-startAddArr);

        LinkedList<Integer> list2 = new LinkedList<>();

        count = 0;
        long startAddLink = System.currentTimeMillis();

        while (count < 10000) {
            list2.add(0,0);
            count++;
        }

        long endAddLink = System.currentTimeMillis();

        System.out.println(endAddLink - startAddLink);
        }
}
