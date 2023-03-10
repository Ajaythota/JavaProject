import java.util.*;
import  java.io.*;

// num of toys that can bought without exceeding total sum of k
public class MarkandToys {
    public static void main (String [] args){
         int []  p ={1 ,12, 5 ,24, 111 ,200, 1000 ,10};
         int k= 50;
        List<Integer> prices = new ArrayList<Integer>();

        for (int i=0;i<p.length;i++)
                    prices.add(p[i]);
       // prices.forEach(n->{System.out.println("here" +n);});

        Collections.sort(prices);
        prices.forEach(n-> {System.out.println(n);});

        int sum=0;
        int cnt=0;
        for (Integer n : prices) {
              sum+= n;
              if(sum <=k)
                  cnt++;
              else
                  break;

       }
System.out.println(cnt);
        

    }
}
