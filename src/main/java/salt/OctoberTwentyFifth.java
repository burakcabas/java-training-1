package salt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class OctoberTwentyFifth {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String input;
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        do{
            System.out.print("Enter the key: ");
            String key = scan.nextLine();

            System.out.print("Enter the value: ");
            String value = scan.nextLine();

            capitalCities.put(key,value);

            System.out.print("Type continue to keep adding key-value pairs or stop to stop: ");
            input = scan.nextLine();

        } while(input.equalsIgnoreCase("continue"));

        for(String q : capitalCities.keySet()){
            System.out.print("Key: " + q + " Value: " + capitalCities.get(q));
            System.out.println();
        }




        HashSet<String> surnames = new HashSet<String>();

        String hope;

        do{
            System.out.print("Enter value to the hashset: ");
            String foreign = scan.nextLine();

            surnames.add(foreign);

            System.out.print("Do you want to continue? yes or no: ");
            hope = scan.nextLine();


        }while(hope.equalsIgnoreCase("yes"));

        for(String utah : surnames){
            System.out.println("Value: " + utah);
        }

    }

}
