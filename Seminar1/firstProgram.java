package Seminar1;

import java.util.Random; 

public class firstProgram {
    
    public static void main(String[] args){


        int i = new Random().nextInt(0,2001); // пункт 1, вывод рандомного числа от 0 до 2000
        System.out.println(i);

        String binary_i = Integer.toBinaryString(i);
        System.out.printf("Побитовое представление числа: %s\n", binary_i);
        int n = binary_i.length(); // пункт 2, номер старшего значащего бита числа
        System.out.printf("Номер старшего значащего бита: %d\n", n);

        int[] m1 = new int[Short.MAX_VALUE];
        int k = 0;
        for (int j = i; j <= Short.MAX_VALUE; j++)
        {
            if (j % n == 0)
            {
                m1[k] = j;
                //System.out.print(m1[k]+ " ");
                k++;
            }
        }
        k = 0;
        int[] m2 = new int[Short.MAX_VALUE];
        //System.out.println();
       //System.out.println("Массив m2:");
        for (int j = Short.MIN_VALUE; j <= i; j++)
        {
            if (j % n != 0)
            {
                m2[k] = j;
                //System.out.print(m2[k]+ " ");
                k++;
            }
        }
    }
}
