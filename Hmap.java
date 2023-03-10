import java.util.*;

public class Hmap {

    public static void main (String [] args) {

        String [][] keyValue = new String[][] {{"Paul","1"},{"Peter","2"}, {"Mary" ,"3"},{"Pan","5"} };
        HashMap<String , Integer> hm =new HashMap<>();
        Set hs= new HashSet<>();

        for ( int i=0; i< keyValue.length;i++ ){

               String name = keyValue[i][0];
               int value = Integer.parseInt(keyValue[i][1]);
               hm.put(name,value);
               hs.add(name);
        }
       // hm.put("John",4);
        //hm.remove("Mary");
             System.out.println(" HashMap " + hm)  ;
        System.out.println(" HashSet " + hs);


    }

}
