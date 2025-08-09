import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Starts_with_A {
    public static void main(String[]args){
        List<String> names = Arrays.asList("Anu","Rithikka","Abinaya","Achu","Navya");
        List<String> startsWithA = new ArrayList<>();
        for (String name : names) {
            if (name.toLowerCase().startsWith("a")) {
                startsWithA.add(name);
            }
        }
        System.out.println("The names are:"+startsWithA);

    }
}
