package TaskArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0, j = 0; i < 10; i++) {
            int a = (int) (Math.random() * 25);
            list.add(i, a);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}