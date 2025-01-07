package recap;

import recap.Five;

//import static recap.Five.printHello;

public class four {

    public static int sum(int a, int b){
        if(a>b){
            return a + sum(a-1,b);
        }
        else{
            return a;
        }
    }

    public static void main(String[] args){

        int a = 5, b = 1;

        System.out.println(sum(a,b));

        Five.printHello(); //this is from "Five" class
        // if we used line 5 as an import (import static recap.Five.printHello;) we would not need to write "Five." before using the method
    }

}
