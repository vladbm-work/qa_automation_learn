package Week1Homework;

import java.util.Arrays;
import java.util.ArrayList;

public class VladBMWeek1Homework {
    public static void main(String[] args) {
        boolean a = false;
        System.out.println(a);

        char b = 'B';
        System.out.println(b);

        int c = 666;
        System.out.println(c);

        long d = 9996669960534L;
        System.out.println(d);

        double e = 666.0;
        System.out.println(e);

        String f = "Test";
        System.out.println(f);

        int [] intArray  = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 15, 20};
        System.out.println(Arrays.toString(intArray));

        int g = 10;
        g++;
        System.out.println(g);

        System.out.println((c+g)/e);

        System.out.println(c<e);

        if (c>e) {
            System.out.println(c + " is larger than " + e);
        }
        else if (c<e) {
            System.out.println(e + " is larger than " + c);
        }
        else {
            System.out.println(c + " is equal to " + e);
        }

        for (int element: intArray) {
            if (element != 15) {
                System.out.println(element);
            }

            /*int.remove(8);
            System.out.println(element);*/
        }

    }

}
