
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
public class LRUImplementationExample {
    private final int cacheSize = 10;

        HashSet<Integer> hSet = new HashSet<>();
        Deque<Integer> q = new LinkedList<>();

           //System.out.println("dequ size "  + q.size() );

        public void updateCache ( int val){
            hSet.add(3);
           q.push(3);
            System.out.println("val" + val);
            System.out.println(q);
            System.out.println(q.size());
            if (!hSet.contains(val)) {
                System.out.println("here if ");
                if (q.size() == cacheSize) {
                    System.out.println("here if 2 ");
                    int last = q.removeLast();
                    hSet.remove(last);
                } else{
                    System.out.println("here else ");
                    q.removeLast();
                }

            }
            System.out.println("here else 2 ");
            q.push(val);
            hSet.add(val);
            System.out.println(q);
        }


    public static void main(String[] arg) {

        LRUImplementationExample  lru =new LRUImplementationExample();
        lru.updateCache(10);
    }
}
