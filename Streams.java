import java.io.*;
import java.util.*;
import java.util.stream.*;




 class Streams {

    public static void main( String [] args){
       // from collections

        List <String>  list = new LinkedList<String>();
            list.add("Java ");
            list.add("Python");
            list.add("C++");
            System.out.println(" Print list : " + list );

            Stream <String> stream1= list.stream();
           //System.out.println(" Stream 1 "+ stream1);
            stream1.forEach(System.out::println);

        // from arrays
        String[] Arr = {"A","B","C"};
        Stream <String> stream2 =Arrays.stream(Arr);
        stream2.forEach(System.out::println);

      //for stream.of
        Stream<Integer> stream3=  Stream.of(1,2,3,4,5);
        stream3.forEach(System.out::println);

        //Intermediate Operations
        System.out.println(" Intermediate Operations");
        List <Integer> numbers = Arrays.asList(5, 9 , 10, 15,20, 17, 23, 30,20);
                Stream<Integer> stream4 =numbers.stream();
             stream4.filter( n -> n>10)
                     .map(n -> n/2)
                     .distinct()
                     .sorted()
                     .forEach(System.out::println);
// parallel stream
        numbers.parallelStream().forEach( n -> System.out.println(n + " " +Thread.currentThread().getName()));


    }
    /**
     Collection stores data in memory and represents a data structure (e.g., List, Set, Map).
     Stream does not store data; it processes data from a source (like a collection) in a functional, declarative way.
     {**/




}
