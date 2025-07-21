import java.util.*;
public class LinkedLISt {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        // fast in insertiona and deletions;
        ll.add(7);
        ll.add(7);
        ll.add(7);
        ll.add(7);
        System.out.println(ll);

        ll.remove(1);
        System.out.println(ll);

        ll.clear();
        System.out.println(ll);

        
    }
}
