import java.util.*;
import java.nio.charset.*;
import java.util.ArrayList;
//import

public class VladBMWeek2Homework {
    public static void main(String args[]) {
        //Exercitiul1
        String a = "Week 2 homework";
        String b = " is done!";
        System.out.println("Comparing " + a + " with " + b + " : " + a.equals(b));
        System.out.println(a + b);

        //Exercitiul 2
        String str = ("Madam");
        if (isPalindrome(str))
            System.out.println("True");
        else
            System.out.println("False");

        //Exercitiul 3
        String empty_string = "";
        //String[] array = new String[10];
        ArrayList array = new ArrayList<String>();
        int c = 5;
        String valrandom = getRandomString(c);
        System.out.println(valrandom);
        char ch = valrandom.charAt(0);
        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'y'
                ||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'||ch == 'Y'
                ||ch == ' '){
            System.out.println(valrandom.toLowerCase() + empty_string);
        }
        else if(c <= 3 || valrandom.contains("x") || valrandom.contains("X")){
            System.out.println(valrandom + " is " + valrandom.replace(valrandom, "skipped"));
        }
        else {
            String upper = valrandom.toUpperCase();
            array.add(upper);
            System.out.println(array);
        }

        //Exercitiul 4
        HashMap<String, String> hmap = new HashMap<String, String>();
        //a
        hmap.put("Test1", "test1@gmail.com");
        hmap.put("Andrei", "andr@gmail.com");
        hmap.put("Quer", "quert@gmail.com");
        hmap.put("Hot", "hot@gmail.com");
        hmap.put("Vlad", "vlad@gmail.com");
        hmap.put("Jit", "jit@gmail.com");

        Set set1 = hmap.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator1.next();
            System.out.print("Name is: "+ mentry.getKey() + " & Email is: ");
            System.out.println(mentry.getValue());
        }

        //b
        System.out.println("Size of HashMap : " + hmap.size());
        //c
        boolean flag1 = hmap.containsKey("Hot");
        System.out.println("Key Hot exists in HashMap? :" + flag1);
        //d
        String val = (String)hmap.get("Andrei");
        System.out.println("Value for name Andrei is: " + val);
        //e
        hmap.remove("Quer");
        System.out.println("Map key and values after removal:");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("Name is: "+ mentry2.getKey() + " & Email is: ");
            System.out.println(mentry2.getValue());
        }
        //f
        Map<String, String> sortmap = new TreeMap<String, String>(hmap);
        System.out.println("Map after sorting:");
        Set set3 = sortmap.entrySet();
        Iterator iterator3 = set3.iterator();
        while (iterator3.hasNext()) {
            Map.Entry sort_map = (Map.Entry) iterator3.next();
            System.out.print(sort_map.getKey() + " : ");
            System.out.println(sort_map.getValue());
        }

    }

    //Exercitiul 2
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int n = str.length();
        for (int i = 0; i < n; ++i) {
            if (str.charAt(i) != str.charAt(n - i - 1)) return false;
        }
        return true;
    }

    //Exercitiul 3
    static String getRandomString(int z)
        {
            byte[] array = new byte[256];
            new Random().nextBytes(array);
            String randomString
                    = new String(array, Charset.forName("UTF-8"));
            StringBuffer r = new StringBuffer();
            for (int k = 0; k < randomString.length(); k++) {
                char ch = randomString.charAt(k);
                if (((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                        && (z > 0)) {
                    r.append(ch);
                    z--;
                }
            }

            return r.toString();
        }
}
