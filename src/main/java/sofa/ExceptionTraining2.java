package sofa;

import java.util.Scanner;

public class ExceptionTraining2 {

    public static void checkAge(int age) throws MyException{
        if(age < 18){
            throw new MyException("\n" +"You are younger than 18, we can't help you.");
        }
        else {
            System.out.println("You are good to go! Hope you didn't lie about your age.");
        }
    }

    public static void main(String[] args) {

        int age;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = scan.nextInt();

        try{
            checkAge(age);
        }
        catch (MyException e){
            System.out.println("A problem with MyException occurred " + e);
        }
        finally {
            scan.close();
        }

    }

}
