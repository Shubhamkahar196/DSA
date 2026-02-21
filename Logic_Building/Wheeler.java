import java.util.Scanner;

public class Wheeler {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int W = sc.nextInt();

        if(W<2 || W% 2 !=0 || W < 2 * V){
            System.out.println("INVALID INPUT");
            return;
        } 
        
        int FW = (W-2 *V)/2;
        int TW = V- FW;

        if(FW < 0 || TW < 0)
            System.out.println("Invalid INPUT");
        else 
              System.out.println(TW + " " + FW);
    }
}
