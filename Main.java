import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ThreadClass mythread = new ThreadClass( );
        mythread.setName("child thread");
        mythread.start();
        try {
            mythread.wait(10);
        } catch (Exception e) {
        }

       // for (int j = 0; j < 100; j++)
          //  System.out.println(Thread.currentThread().getName() ) ;

String s1="test";
        String s2="test";
if(s1==s2)
    System.out.println("same");
else
     System.out.println("Diff");




    }
    }
