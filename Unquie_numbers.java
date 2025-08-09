import java.util.*;
public class Unquie_numbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 5, 3};

        // Using a Set to store only unique numbers
        Set<Integer> uniqueNumbers = new LinkedHashSet<>(); // keeps insertion order

        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}
