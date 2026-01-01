package dp;

import java.util.HashMap;
import java.util.Map;

public class GridTravel {
    public static void main(String[] args) {
        //Return No of Ways we can travel from start 0,0 to x,y
        System.out.println("" + gridTravel(18, 18, 0, 0));
    }


    private static Map<String,Long> map = new HashMap<>();
    public static long gridTravel(int x, int y, int a, int b) {
        String key = a+","+b;
        if(map.containsKey(key))
            return map.get(key);

        if (a >= x || b >= y) {
            return 0L;
        }
        if (a == x - 1 && b == y - 1) {
            return 1L;
        }
        long result =  gridTravel(x, y, a + 1, b) + gridTravel(x, y, a, b + 1);
        map.put(key,result);
        return result;
    }
}
