import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello world";

        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') { // skip spaces
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println(freqMap);
    }
}
