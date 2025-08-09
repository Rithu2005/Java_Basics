import java.util.*;
import java.util.stream.Collectors;

public class ListFilteringSorting {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 33, 20, 55, 76, 31);

        // Filter numbers greater than 30 and sort in descending order
        List<Integer> result = numbers.stream()
                .filter(n -> n > 30)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
