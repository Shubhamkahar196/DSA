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
    System.err.println(alist); 

    // you can get list when you click alist. they give a lot of collection
   }  
}
