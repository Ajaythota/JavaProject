import java.io.*;
import java.util.*;
interface Addition{
    int add(int a, int b);

}


public class LambdaExp002 {

    public  static void main(String [] args) {
            //Addition ad= new implClassavoidedByLambda ();
           // ad.add(int a, int b)
          //the above steps avoided writing implementation class for interface

        Addition ad= (a,b)->(a+b);
       // for(int i=0;i<5;i++)
        System.out.println(ad.add(20,3 ));

       Addition ad2 =  (c, d) -> (c-d);
        System.out.println(ad2.add(20,3 ));



    }
}
//this class for writing implementation class for interface replaced by Lambda exp   (a,b)->(a+b);
/**class implClassavoidedByLambda implements Addition{
    public int add(int a, int b){
        return (a+b);

    }

}
 +**/

