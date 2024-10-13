package burak;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;


public class ArrayTraining {

public static void main(String[] args) {


    String[] cars = {"BMW", "Ferrari", "Toyota", "Mercedes"};
    Scanner scan = new Scanner(System.in);

    /*System.out.println("The first member of the cars array is: " + cars[0]);

    System.out.println("Now we are going to change the first element of the cars array, please write the new car name you want: ");
    cars[0] = scan.nextLine();

    System.out.println("The first member after the change by your input is: " + cars[0]);*/

    /*
    for(int i = 0; i < cars.length;i++){
        System.out.println("Member " + i + " : "+ cars[i]);
    }*/

    /*for(String name : cars){
        System.out.println(name);
    }*/

    int[][] numbers = new int[2][2];

    System.out.println("This is a multidimensional array of 2x2 size.");

    for(int i = 0; i < numbers.length; i++){
        for(int j = 0; j < numbers[i].length; j++){
            System.out.println("Please enter the value: ");
            numbers[i][j] = scan.nextInt();
        }
    }

    for(int[] row : numbers){
        for(int i : row){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    }
}
