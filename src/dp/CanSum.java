package dp;

import java.util.HashMap;
import java.util.Map;

public class CanSum {
    public static void main(String[] args) {
        System.out.println(canSum(11, new int[]{2,4})); //false
        map.clear();
        System.out.println(canSum(7, new int[]{2,3})); // true
        map.clear();
        System.out.println(canSum(7, new int[]{5,3,4,7})); // true
        map.clear();
        System.out.println(canSum(7, new int[]{2,4})); // false
        map.clear();
        System.out.println(canSum(8, new int[]{2,3,5})); //true
        map.clear();
        System.out.println(canSum(300, new int[]{7,14})); // false
    }

    private static Map<Integer,Boolean> map = new HashMap<>();
    private static boolean canSum(int target,int[] nums){
        if(map.containsKey(target))
            return map.get(target);
        if(target == 0)
            return true;
        if(target < 0)
            return false;

        for(int i:nums){
            int newTarget = target - i;
             if(canSum(newTarget,nums)){
                 map.put(target,true);
                 return true;
             }
             //Ignore False as we will want to keep iterating
        }
        map.put(target,false);
        return false;
    }
}
