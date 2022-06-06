package general;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {

        List<Integer> duplicateList = List.of(1,2,2,2,2,3,4,5,6);

        //Solution1
        List<Integer> newList = new ArrayList<>();

        duplicateList.forEach(val->{
            if(!newList.contains(val))
                newList.add(val);
        });
        printList(newList);

        //Solution2
        Set<Integer> newSet = new HashSet();
        duplicateList.forEach(val->{
            newSet.add(val);
        });
        //Convert Set to list(Multiple ways)
        //List.copyOf(newSet)
        //newSet.stream().collect(Collectors.toList());
        List<Integer> newList1 = new ArrayList<>(newSet);
        printList(newList1);


        //Solution3

        List<Integer> newList2 = new ArrayList<>();
        for(int i=0;i<duplicateList.size();i++){
            Integer value = duplicateList.get(i);
            boolean found = false;
            for(int j = i+1;j<duplicateList.size();j++){
                if(value == duplicateList.get(j)){
                    found = true;
                    break;
                }
            }
            if(!found){
                newList2.add(value);
            }
        }
        printList(newList2);

        
    }

    private static void printList(List<Integer> list){
        list.forEach(n->{
            System.out.println(n);
        });
    }
    
}
