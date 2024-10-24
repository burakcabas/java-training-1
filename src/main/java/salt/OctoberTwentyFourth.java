package salt;

import java.util.Scanner;

public class OctoberTwentyFourth {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] array = new int[5];
        int i = 0;

        while(true){
            System.out.print("Please type yes to continue and no to stop: ");
            String decision = scan.nextLine();

            if(decision.equals("yes") && i < 5){
                System.out.print("You typed yes, please enter an integer to add to the array: ");
                array[i] = scan.nextInt();
                scan.nextLine();
                i++;
            }
            else if(decision.equals("yes") && i >= 5){
                System.out.println("You have reached the array limit of five members, we gotta break the loop.");
                break;

            }
            else if(decision.equals("no")){
                System.out.println("You typed no, we stopped the process.");
                break;
            }
            else {
                System.out.println("Answer not recognized, breaking the loop.");
                break;
            }
        }

        System.out.print("Here is the array: ");
        for(int a : array){
            System.out.print(a + " ");
        }

        System.out.println();

        System.out.println("Array length: " + array.length);

        String[][] umai = new String[4][3];

        for(int r = 0; r < umai.length; r++){
            for(int j = 0; j< umai[r].length; j++){
                System.out.print("Please enter the String member: ");
                umai[r][j] = scan.nextLine();
            }
        }

        for(String[] row : umai){
            for(String w : row){
                System.out.print(w + " ");
            }
            System.out.println();
        }

    }

}
