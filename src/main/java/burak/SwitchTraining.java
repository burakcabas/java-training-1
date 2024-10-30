package burak;

import java.util.Scanner;

public class SwitchTraining {

    public static void main(String[] args){

        System.out.println("This is a game of fire walking. When you press 1 you take a step, if you press 0 you take a step back and if you type anything else the game will end.");

        Scanner scan = new Scanner(System.in);

        int number, step = 0;

        outerloop: // this is called a label, don't over-use it
        while(true){

            System.out.print("Enter your number: ");
            number = scan.nextInt();

            switch(number){

                case 1:{
                    System.out.println("You have taken a step, well done!");
                    step++;
                    break;
                }

                case 0: {
                    System.out.println("You have taken a step back, keep going!");
                    step--;
                    break;
                }

                default: {
                    System.out.println("Game over :( ");
                    break outerloop;
                }

            }

        }

        System.out.println("The game is over, your score was " + step + ".");

    }

}
