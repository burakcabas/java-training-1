package burak;

import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class ArrayListTraining {

    public static void main(String[] args){

        ArrayList<String> phone = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        phone.add("Samsung A8");
        phone.add(1,"Apple iPhone 15");
        phone.add("Huawei T53");
        phone.add("General Mobile 6300");

        System.out.println("Last member of the ArrayList: " + phone.getLast());

        phone.set(3, "General Mobile Monster");

        System.out.println("New last member of the ArrayList after the set function: " + phone.getLast());

        phone.removeLast();

        System.out.println("The new last member of the ArrayList after deleting the previous one: " + phone.getLast());

        System.out.println("Final size of the ArrayList: " + phone.size());

        System.out.println("Use of the for-each loop in ArrayLists is below;");
        for(String i : phone){
            System.out.println(i);
        }

        System.out.print("Lastly, please write a phone name to add to the ArrayList: ");
        phone.add(scan.nextLine());

        System.out.println("With your input, our newest and last member is: " + phone.getLast());


        System.out.println("After our user input practice let's write everything with for-each loop one last time;");
        for(String i : phone){
            System.out.println(i);
        }

        phone.clear();

    }

}
