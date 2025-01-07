package recap;

import java.util.ArrayList;

public class Five {
    //Always start your class name with an uppercase letter from now on, it's the common usage.

    public static void printHello(){
        System.out.println("printHello");
    }

    public void animalNoise(){
        System.out.println("animal");
    }

    public static void main(String[] args){

        Five nesne = new Five();

        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Burak");
        myArrayList.add("Basketball");

        printHello();

        for(String i : myArrayList){
            System.out.println(i);
        }

    }
}
