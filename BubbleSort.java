import java.io.*;
import java.util.*;
public class BubbleSort {

    public static void main (String [] args){

        int[] n=  {6,1,4,10,-2,0,345,15};
        int cnt=0;
        for (int i=0;i<n.length;i++){
              for(int j=0;j<n.length-1;j++){
                    if (n[j] > n[j+1]) {
                        cnt++;
                        int temp = n[j];
                        n[j] = n[j + 1];
                        n[j + 1] = temp;
                    }

                  }



              }
        for (int i=0;i < n.length;i++)
        System.out.println(n[i]);
        System.out.println(" Array is sorted in " + cnt + " swaps.");
        System.out.println("First Element: " + n[0]);
        System.out.println("Last Element: " + n[n.length -1]);


    }


    }

