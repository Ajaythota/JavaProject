import java.util.*;
import java.util.Scanner.*;
import java.io.*;
import java.math.*;
class Prime{
    void primeNum( Integer ... a) {   // declaration without overiding
     for (int i=0;i<a.length;i++) {
         //System.out.println(" in primeNum" + a[i]);
        boolean isPrime=true;
            if ((a[i])  >= 2) {
                for ( int j=2;j< a[i]/2;j++){
                    if(a[i]%2==0) {
                        isPrime = false;
                        break;
                    }

                }

            }
            if (isPrime)
                System.out.println(a[i] + " is Prime");
                else
                System.out.println(a[i] + " is NOT Prime");
     }

    }

}

public class checkPrime{

   public static void main(String [] args){
System.out.println("test");
    // Scanner s= new Scanner(System.in);
        ;
        Prime pn = new Prime();
        String n="";
       // for (int i=0;i< args.length;i++){
               pn.primeNum(Integer.valueOf(args[3]));
               System.out.println(" no method overiding");
               pn.primeNum(Integer.valueOf(args[0]),Integer.valueOf(args[1]),Integer.valueOf(args[2]));



       // }


   }
}


