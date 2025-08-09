import java.util.Arrays;
import java.util.List;
public class Sum_o_the_iintegers_in_the_list {
    public static void main(String[]args){
        List<Integer> numbers = Arrays.asList(10,20,30,40,77);
        int sum =0;
        for(int number:numbers){
            sum = sum+number;
        }
        System.out.println("The addition of the elements in the list are:"+sum);
    }
}
