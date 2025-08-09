import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class String_to_Uppercase {
    public static void main(String[]args){
        List<String> sentence = Arrays.asList("Hello","kitty","elsa","aana");
        List<String> changed = sentence.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("The changed words to Uppercase are:"+changed);
    }
}
