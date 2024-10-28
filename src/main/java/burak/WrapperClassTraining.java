package burak;

import java.util.Scanner;

public class WrapperClassTraining {

    public static void main(String[] args){

        Integer number = 5;
        Double stake;
        Character noise;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a double value: ");
        stake = scan.nextDouble();

        System.out.print("Please enter a character: ");
        noise = scan.next().charAt(0);

        System.out.println("Integer: " + number + " Double: " + stake + " Character: " + noise);

        String deneme = stake.toString(); //the type of stake will still stay as Double after this line

        System.out.println(deneme);

        Double a = number.doubleValue();

        Integer g = stake.intValue();

        System.out.println(a);
        System.out.println(g);

    }

}
