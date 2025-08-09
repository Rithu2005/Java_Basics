import java.util.LinkedList;
public class LinkedListTest {
    public static void main(String[]args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.get(0);
        cars.set(1,"Toyota");
        System.out.println("THE DISPLAY IS:"+cars);
        cars.remove(0);
        cars.clear();
        System.out.println("THE DISPLAY AFTER CLEAR IS:"+cars);
    }
}
