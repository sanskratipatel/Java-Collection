import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class AArraylistProgram {

    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        System.out.println("Get = " +li.get(3));
        System.out.println("Size = "+li.size());
        for(int x: li){
            System.out.println(x);
        }
        System.out.println("Contain method = " +li.contains(2));
        System.out.println("Remove method = "+ li.remove(2));
        for(int a :li) {
            System.out.println(a);
        }
    }


}
