package recap;

import java.util.Scanner;

public class Six_2 extends Six{

    public Six_2(String name, String surname, int age){
        super(name,surname,age);
    }

    public Six_2(){} //default constructor

    public static void main(String[] args){

        Six_2 nesne = new Six_2("Burak","Cabas",26);

        System.out.println(nesne.getName());

        System.out.print("Please write a name to be swapped with \"Burak\": ");
        Scanner scan = new Scanner(System.in);
        String writtenName = scan.nextLine();
        nesne.setName(writtenName);

        System.out.println(nesne.getName());

    }

}
