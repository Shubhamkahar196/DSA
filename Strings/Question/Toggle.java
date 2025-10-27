package Question;

import java.util.*;


public class Toggle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        //    toggle
        for(int i  =0; i<str.length();i++){
  // PhysiCs => pHYSIcS
        // check => alphabet-small, capital
         
        boolean flag = true; // true->capital
        char ch = str.charAt(i);
        if(ch==' ' || ch >= '0' && ch <= '9') continue;
        int asci = (int)ch;    //typecasting
        if(asci >=97) flag = false;  //false

        if(flag==true){ //capital
          asci +=32;   // capital aur small mai 32 ka difference hota hai
          char dh = (char)asci;
          str.setCharAt(i, dh);
        }else{   // small
            asci -=32;
            char dh = (char)asci;
            str.setCharAt(i, dh);
        }
        }

        System.out.println(str);
      
        

    }
}
