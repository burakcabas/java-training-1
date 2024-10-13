package burak;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class LoopTraining {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

            /*for(int i = 0; i <15; i++){
            System.out.print(i + " ");
            }*/

            /*
            String decision;

            while(true) {

                System.out.print("Type yes to continue and no to stop: ");
                decision = scan.nextLine();

                switch (decision) {
                    case "yes":
                        System.out.println("You chose yes! We are continuing.");
                        continue;
                    case "no":
                        System.out.println("You chose no! We are stopping.");
                        break;
                    default:
                        System.out.println("Your answer was not recognized so we are stopping.");
                        break;
                }

                if(decision != "yes"){
                    break;
                }

            }*/

       /* int a = 0;

        while(a<10){
            System.out.print(a + " ");
            a++;
        }
 */

       /* int array[] = new int[3];

        array[0] = 1;
        array[1] = 2;
        array[2] = 356;

        for(int i : array){
            System.out.print(i + " ");
        }
        */

        /*double multiArray[][] = new double[2][2];

        multiArray[0][0] = 4.4132543215123532;
        multiArray[0][1] = 1;
        multiArray[1][0] =  8.8;
        multiArray[1][1] = 3.45;

        for(double[] row : multiArray){
            for(double i : row){
                System.out.print(i + " ");
            }
            System.out.println();
        }*/

        /*int i = 0;

        do{
            System.out.print(i + " ");
            i++;

        }while(i < 10 && i != 4);*/

        /*for(int i = 0; i < 10; i++){
            if(i == 3){
                continue;
            }
            else if(i == 8){
                break;
            }
            else
                System.out.println(i);

        }*/

    }
}
