import java.sql.SQLOutput;
import java.util.LinkedList;

public class BLinkedList {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        str.add("Apple");
        str.add("Banana");
        str.add("Papaya");
        str.add("Orange");

        System.out.println("Getting str from Index = " +str.get(2));
        for(String x : str){
            System.out.println(x);
        }
        System.out.println("Size of Linked List = " + str.size());
        System.out.println("STR Contain banana or not = "+ str.contains("Banana"));
        System.out.println("STR Contain Grapes or not = "+ str.contains("Grapes"));
    }
}
