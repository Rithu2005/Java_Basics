import java.util.Collections;
import java.util.List;
import java.util.Arrays;
public class Sort_of_the_strings {
    public static void main(String[]args){
        List<String> fruits = Arrays.asList("Strawberry","Banana","Kiwi","Apple","Mango");
        System.out.println("The fruits before sorting:"+fruits);
        Collections.sort(fruits);
        System.out.println("The fruits are sorted in the order:");
        for(String sorted:fruits){
            System.out.println(sorted);
        }
    }
}
