import java.util.Scanner;

public class GCD {


    public int GCDFind(int a, int b){
        if(a==0)
        return b;

        return GCDFind(b%a,a);
    }

    //Lcm
    public int LCM(int a ,int b){
        return (a*b)/GCDFind(a,b);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        GCD obj = new GCD();
        int ans = obj.GCDFind(a,b);

        System.out.println(ans);

    }
}