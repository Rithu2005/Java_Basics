//the keyword addall is used to for union
// the keyword retain all is used for intersection
// the keyword remove all is used for difference
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class set_operations {
    public static void main(String[]args){
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        Set<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);
        Set<Integer> intersectionSet = new HashSet<>(setA);
        intersectionSet.retainAll(setB);
        Set<Integer> differenceSet = new HashSet<> (setA);
        differenceSet.removeAll(setB);
        System.out.println(unionSet);
        System.out.println(intersectionSet);
        System.out.println(differenceSet);
    }
}
