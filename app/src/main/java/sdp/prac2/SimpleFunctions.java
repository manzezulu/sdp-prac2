package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
        // Method to check if a list is sorted
        public static <T extends Comparable<T>> boolean isSorted(List<T> list) {
            if (list == null || list.size() <= 1) { //If list is empty or has one element than sorted
                return true; 
            }
            for (int i = 0; i < list.size() - 1; i++) { //If the current element is > than the next the list is not sorted
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    return false; 
                }
            }
            return true; //If list is in order
    }
}
