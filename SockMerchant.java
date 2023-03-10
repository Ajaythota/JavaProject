import java.util.*;
import java.io.*;




public class SockMerchant {

    public static void main( String[] args) {
           int [] a= {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
           int N=0;
        List<Integer> ar = new ArrayList<Integer>();

        //a.forEach(n -> {ar.add(n)};);

        for ( int i=0;i<a.length;i++){
            ar.add(a[i]);
        }
System.out.println("list" + ar);

        Set<Integer> set1 = new HashSet<Integer>(ar);
        System.out.println("set " +set1);
        Iterator <Integer> it= set1.iterator();
        HashMap<Integer, Integer>  Hm = new HashMap<Integer,Integer>();

        while(it.hasNext()) {
               int e= it.next();
               int num=0;
               for (int j=0;j<ar.size();j++){
                   if (e==ar.get(j))
                       num++;

               }
               Hm.put(e,num);
        }

        Iterator p = Hm.entrySet().iterator();

        while(p.hasNext()){
            Map.Entry pair =(Map.Entry)p.next();
            int socks =(Integer)pair.getValue();

              if(socks >  1)
                     N= N+socks/2;


        }
        System.out.println(N);
    }
}
