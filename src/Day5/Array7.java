package Day5;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Array7 {

    public static void main(String[] args) {
        Integer[] arr = {12,34,12,45,67,89};
        Integer[] uniqueArr = removeDuplicates(arr);
        for(int num: uniqueArr) {
            System.out.println(num);
        }
    }

    public static Integer[] removeDuplicates(Integer[] arr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(Integer elem : arr) {
            if(set.add(elem)) {
            	//set.add(else) return true if the line adds element to set successfully after it finds out it is not presetn in it  
                list.add(elem);
            }
        }
        return list.toArray(new Integer[list.size()]);
    }
}
