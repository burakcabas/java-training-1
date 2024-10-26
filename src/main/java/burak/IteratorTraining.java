package burak;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class IteratorTraining {

    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        String input;

        do{

            System.out.print("Please enter an integer to the arraylist: ");
            int a = scan.nextInt();

            numbers.add(a);

            scan.nextLine();

            System.out.print("Would you like to continue? yes or no: ");
            input = scan.nextLine();

        }while(input.equalsIgnoreCase("yes"));


        Iterator<Integer> it = numbers.iterator();

        System.out.println("The arraylist is gonna be printed and 10's will be deleted.");

        while(it.hasNext()){

            int y = it.next();

            if(y == 10){
                it.remove();
                continue;
            }

            System.out.print(y + " ");
        }

        System.out.println();
        System.out.println("***************");

        for(int e : numbers){
            System.out.print(e + " ");
        }

        System.out.println();


    }

}
