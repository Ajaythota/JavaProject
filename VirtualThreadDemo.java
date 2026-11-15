import java.util.*;
import java.lang.Thread.*;


public class VirtualThreadDemo {


    public static void main (String [] args){
        for ( int i=0;i<5;i++){

            Thread.startVirtualThread( () ->
            {
                System.out.println("running virtual  " + Thread.currentThread().getName());
            });

        }


    }
}
