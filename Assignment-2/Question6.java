import java.util.HashMap;
import java.util.Map;

public class Question6 {
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};
        System.out.println("Is subset: " + isSubset(arr1, arr2));
    }

    public static boolean isSubset(int[] arr1, int[] arr2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            if (!frequencyMap.containsKey(num) || frequencyMap.get(num) == 0) {
                return false;
            }
            frequencyMap.put(num, frequencyMap.get(num) - 1);
        }
        return true;
    }
}