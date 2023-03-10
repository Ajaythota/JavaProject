import java.util.*;
        import java.io.*;
public class TestArrayLinkedList {
    public static void main( String [] args) {
        ArrayList<String> al = new ArrayList<String>();
        LinkedList<String> ll = new LinkedList<String>();
        
        for (int i = 0; i < 5; i++) {
            al.add(" ArrayList " + i);
            ll.add(" Linked list " + i);

        }
        System.out.println(" Arraylist " +  al);
        System.out.println(" Linked " +  ll);
        al.remove(2);
        System.out.println(al.get(2)+ al.get(3) );
        ll.remove(2);
        System.out.println(ll.get(2) + ll.get(3));
        ll.remove("Linked list 3");
        System.out.println(" Linked " +  ll);

    }
}
