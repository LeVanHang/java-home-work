package sort;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(7);
        array.add(10);
        array.add(-20);
        array.add(-30);
        array.add(50);

        System.out.println("-------------");

        for (Integer o : array
             ) {
            System.out.println(o);
        }

        Collections.sort(array);
        for (Integer o: array
             ) {
            System.out.println(o);
        }

        System.out.println("------max--------");
         int max = Collections.max(array);
        System.out.println("max" +max);

        System.out.println("--------min---------");

        int min = Collections.min(array);
        System.out.println("min" +min   );
    }
}
