package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
    }

    public static int task1(List<Integer> a, List<Integer> b) {
        int sum = 0;
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) < a.size() && b.get(i) >= 0) {
                sum += a.get(b.get(i));
            }
        }
        return sum;
    }

    // method to remove first characters in a list
    public static ArrayList<String> task2(ArrayList<String> listElements) {

        ArrayList<String> output = new ArrayList<>();

        for (String j : listElements) {

            if (j.length() > 1) {
                // if lengh = 0 then nothing to remove
                // if length is 1 then result is [""] i dont want that
                output.add(j.substring(1));// add to output
            }
        }
        return output;
    }

    public static boolean task3(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            } else if (str.charAt(i) == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }

    // Method to check if a list is sorted
    public static List<Integer> task4(List<Integer> firstLst, List<Integer> scndLst) {

        if (firstLst.size() != scndLst.size()) {
            return null; // Return null if lists have diff sizes
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < firstLst.size(); i++) {
            int productResult = firstLst.get(i) * scndLst.get(scndLst.size() - 1 - i); // Multiply elements
            result.add(productResult);
        }

        return result;
    }

    public static <T extends Comparable<T>> boolean task5(List<T> list) {
        if (list == null || list.size() <= 1) { // If list is empty or has one element than sorted
            return true;
        }
        for (int i = 0; i < list.size() - 1; i++) { // If the current element is > than the next the list is not sorted
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                return false;
            }
        }
        return true; // If list is in order
    }

    public static List<Integer> task6(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int num : numbers) {
            if (num % 100 == 0) {
                result.add(num);
            } else {
                int rounded = ((num / 100) + 1) * 100;
                result.add(rounded);
            }
        }
        return result;
    }
}