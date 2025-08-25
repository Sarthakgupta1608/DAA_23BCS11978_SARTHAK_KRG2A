import java.util.HashMap;
import java.util.Map;

public class experiment3code{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3, 5};
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency of elements:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
