package Seminar4;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Seminar4 {
    
    public static void main(String[] args) throws Exception{

        // FileWriter nfile = new FileWriter("file.txt"); // запись строки в файл

        // nfile.write("Подобен лучу самурайский клинок.\n");

        // nfile.close();

        // FileReader fr = new FileReader("file.txt"); // считывание с файла
        // Scanner scan = new Scanner(fr);

        // while (scan.hasNextLine()) {
        //     System.out.println(scan.nextLine());
        // }

        // fr.close();

        FileReader nfile = new FileReader("people.txt");
        Scanner scan = new Scanner(nfile);
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> secName = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        int count = 0;
        while (scan.hasNextLine()) {
            count++;
            String[] info = scan.nextLine().split(" ");
            System.out.printf("%s %c. %c. %d %s\n", info[0], info[1].charAt(0), info[2].charAt(0), Integer.parseInt(info[3]), info[4]);
            surname.add(info[0]);
            name.add(info[1]);
            secName.add(info[2]);
            age.add(Integer.parseInt(info[3]));
            gender.add(info[4]);
        }
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            indexes.add(i, i);
        }
        int tmp = 0;
        boolean sorted = true;
        do {
            for (int i = 0; i < age.size()-1; i++) {
            
            sorted = true;
            if (age.get(i) > age.get(i+1)) {
                tmp = age.get(i);
                age.set(i, age.get(i+1));
                age.set(i+1, tmp);
                tmp = indexes.get(i);
                indexes.set(i, indexes.get(i+1));
                indexes.set(i+1, tmp);
                sorted = false;
            }
        }
        } while (sorted == false);
        
        for (int k: age) {
            System.out.println(k);
        }
        for (int i = 0; i < indexes.size(); i++)
        {
            int j = indexes.get(i);
            System.out.printf("%s %s %s %d %s\n", surname.get(j), name.get(j), secName.get(j), age.get(i), gender.get(j));
        }
        nfile.close();

    }
}
