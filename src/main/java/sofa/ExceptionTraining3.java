package sofa;

import java.util.Scanner;

public class ExceptionTraining3 {

    public static void main(String[] args){

        int number = 20;
        int divide;

        Scanner scan = new Scanner(System.in);

        System.out.print("enter a number to be divided with 20: ");
        divide = scan.nextInt();

        if(divide == 0){
            throw new ArithmeticException("I can write custom stuff here to explain the exception.");
        }
        else {
            System.out.println(number/divide);
        }

    }

}
