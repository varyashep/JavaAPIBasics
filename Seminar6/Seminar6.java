package Seminar6;
import java.util.*;

public class Seminar6 {
    
    public static void main(String[] args) {

        mySet mySet = new mySet();
        //mySet.Add(7);
        for (int i = 0; i < 5; i++) {
            mySet.Add(new Random().nextInt(10));
        }
        System.out.println(mySet.Contains(7));
        System.out.println(Arrays.toString(mySet.ToArray()));

        Iterator<Integer> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println(mySet.GetItem(1));
    }
    
}


class mySet {

    static final Object OBJECT = new Object();
    private LinkedHashMap<Integer, Object> hashMap = new LinkedHashMap<>();

    public boolean Add(int num) {
        
        return hashMap.put(num, OBJECT) == null;
    }

    public boolean Contains(int num) {
        return hashMap.containsKey(num);
    }

    public Object[] ToArray() {
        return hashMap.keySet().toArray();
    }

    public Iterator<Integer> iterator() {
        return hashMap.keySet().iterator();
    }

    public Integer GetItem(int index) {
        return (Integer)ToArray()[index];
    }
}