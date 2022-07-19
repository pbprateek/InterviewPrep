package complexity;

import java.util.List;
import java.util.function.Consumer;

public class First {
    public static void main(String[] args) {
        List<Integer> list = List.of(45, 56, 88, 3424, 4324, 23432, 99999, 423, 432, 432, 42, 44324, 432);

        long startTime = System.nanoTime();
        int max1 = findMaxSecond(list);
        long endTime = System.nanoTime();
        long duration1 = (endTime - startTime);


        long startTime1 = System.nanoTime();
        int max2 = findMaxFirst(list);
        long endTime1 = System.nanoTime();
        long duration2 = (endTime1 - startTime1);

        System.out.println(duration1 + "  " + max1 + "  " + duration2 + "  " + max2);


    }


    public static Integer findMaxFirst(List<Integer> list) {
        if (list.isEmpty())
            return -1;

        int maximum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maximum)
                maximum = list.get(i);
        }
        return maximum;
    }

    public static Integer findMaxSecond(List<Integer> list) {
        if (list.isEmpty())
            return -1;


        for (int i = 0; i < list.size(); i++) {
            boolean isMaximum = true;
            //For loop check run every time so it will not lead to run time exception
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    isMaximum = false;
                    break;
                }
            }
            if (isMaximum)
                return list.get(i);
        }
        return 0;

    }
}
