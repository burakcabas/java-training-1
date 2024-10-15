package burak;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListSorting {

    public static void main(String[] args){

    ArrayList<String> cars = new ArrayList<String>();

    Scanner scan = new Scanner(System.in);

    outerloop:
    while(true){
        System.out.print("Please type yes if you want to add and stop to complete the ArrayList: ");
        String decision = scan.nextLine();

        switch(decision){
        case "yes":{
            System.out.print("Type the String you want to add: ");
            cars.add(scan.nextLine());
            break;
        }
        case "stop":
            break outerloop;
        default:
            break outerloop;
        }
    }

    System.out.println("Before sorting:");
    for(String a:cars){
            System.out.println(a);
    }

    System.out.println("Sorting...");
    Collections.sort(cars);

    System.out.println("After sorting:");
    for(String a:cars){
        System.out.println(a);
    }

    }

}
