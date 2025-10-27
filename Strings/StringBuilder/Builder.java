package StringBuilder;

public class Builder {
    public static void main (String[] args)  {
        StringBuilder str = new StringBuilder("Hello");
        str.append("sk");
        System.out.println(str);
        str.setCharAt(2,'k');
        System.out.println(str);
        str.insert(2,'s');
        System.out.println(str);
        str.delete(2, 4);
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);


    }
}
