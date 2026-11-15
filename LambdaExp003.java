import java.io.*;
import java.util.ArrayList;
import java.util.ArrayList.*;

public class LambdaExp003 {
//functional interface as only 1 abstract method
//but it can have multiple default and static methods.
    interface Greeting {
        void sayHello();

    }
    interface mathOperate{
        int operate(int a , int b);
        default void mathFun(){
            System.out.println(" Math is fun ");

        }

    }
//Method reference login (::)
    class MethodRef {

        static void square(int n){
            System.out.println ("method refernce " + n*n);

        }



    }


    public static void main ( String args []){

        ArrayList <Integer>  ld = new ArrayList<Integer>()  ;
        for (int i=0; i<4; i++)
             ld.add(i);

        ld.forEach( n -> {System.out.println(n);}); // internal loop
        System.out.println();

        ld.forEach(MethodRef::square); //Method reference

        /**() ->  replaces
         * Greeting g = () ->{ System.out.println(" Howdy?");}
         * replaces this
         *  Greeting g = new Greeting(){
         *  public void sayHello(){
         *  System,out.println("Howdy")
         *}
         *}
         */
         Greeting g = () ->{ System.out.println(" functional interafce  Howdy?");}   ;

         g.sayHello();

        mathOperate add= (a,b)  -> a+b;
        mathOperate multiply= (int a , int b) -> a*b;


    System.out.println( " Sum:" + add.operate(3,5));
    System.out.println(" Multiple:" +  multiply.operate(9, 11));

//Method reference


    }


}
