package dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(howSum(300, new int[]{7,14}, new Integer[]{}))); //false
        map.clear();
        System.out.println(Arrays.toString(howSum(300, new int[]{7,14,3}, new Integer[]{}))); //false

    }

    private static Map<Integer,Integer[]> map = new HashMap<>();

    //Return an array containing any combination of elements that adds up to target sum,
    // if no combination return null
    private static Integer[] howSum(int target,int[] nums,Integer[] sumArr){
        if(target == 0)
            return sumArr;
        if(target < 0)
            return null;

        if(map.containsKey(target))
            return map.get(target);

        for(int i:nums){

            int newTarget = target - i;

            Integer[] mergedArray = new Integer[sumArr.length+1];
            System.arraycopy(sumArr,0,mergedArray,0,sumArr.length);
            mergedArray[mergedArray.length-1] = i;

            Integer[] sumedResult = howSum(newTarget,nums,mergedArray);
            map.put(target,sumedResult);
             if(sumedResult != null){
                 return sumedResult;
             }
             //Ignore False as we will want to keep iterating
        }
        return null;
    }
}
