import java.util.*;
  interface AdvanceMath{
    int add(int a, int b);



}
abstract class Shape{

      abstract void draw();
}

class myCalculator implements AdvanceMath {
    public int add(int i, int j ){
        int k ;
        k =i+j;
        return k;

    }

}
class myTriangle extends  Shape{

      void draw(){
          System.out.println( " Drawing triangle......");
      }

}
 class InterfaceExample {

    public static void main (String [] args){
           myCalculator mycal = new myCalculator();
        myTriangle myt =new myTriangle();
            Shape sh=new Shape() {
                @Override
                void draw() {

                    System.out.println(" overiding Shape class ");

                }
            };


                sh.draw();
                myt.draw();
          System.out.println( mycal.add(5,6));

    }
}
