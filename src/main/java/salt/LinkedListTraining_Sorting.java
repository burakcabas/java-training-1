package salt;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListTraining_Sorting {


    public static void main(String[] args){

        LinkedList<String> names = new LinkedList<String>();

        names.add("Burak");
        names.add("Burak");
        names.add("John");
        names.add("JOHN");
        names.add("JOHn");
        names.add("Andrew");
        names.add("Bailey");

        for(String i: names){
            System.out.print(i + " ");
        }

        System.out.println();

        Collections.sort(names);

        for(String i: names){
            System.out.print(i + " ");
        }

        System.out.println();

        Collections.sort(names, Collections.reverseOrder());

        for(String i: names){
            System.out.print(i + " ");
        }

        System.out.println();



    }

}
