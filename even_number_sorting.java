import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class even_number_sorting {
    public static void main(String[]args){
        List<Integer> even = Arrays.asList(1,2,3,4,5,0);
        List<Integer> numbers = even.stream().filter(n-> n%2 == 0).collect(Collectors.toList());
        System.out.println("The even numbers are:"+numbers);
    }
}
