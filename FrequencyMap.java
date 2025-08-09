import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class FrequencyMap {
    public static void main(String[]args){
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        System.out.println(frequencyMap);
    }
}
