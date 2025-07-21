import java.util.*;

public class ArraysList {
   public static void main(String[] args) {
    ArrayList<Integer> alist = new ArrayList<>();
    alist.add(10);
    alist.add(10);
    alist.add(10);
    alist.add(10);
    System.out.println(alist);

    //deleting
    alist.remove(2);
    // System.out.println(alist); 

    System.out.println(alist.contains(7));

    // you can get list when you click alist. they give a lot of collection
   }  
}
