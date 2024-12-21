package recap;

import java.util.*;
import java.lang.*;
import java.io.*;

public class one {

    public static void main(String[] args){

        // Java is case-sensitive

        System.out.println("Two times two is: " + 2*2);

        //this is a single-line comment

        /*
        this
        is
        a
        multi-line
        comment
         */

        String text = "Comrade";
        byte como = 3; // çok küçük aralıkta sayılar, -128 +127
        float floatNumber = 3.32f; // f koymayınca hata veriyor
        double doubleNumber = 3.32d; // d koymasan da olur
        int intNumber = 56, crazyNumber = 49, lastButNotLeast = 100;
        /*
        int a = b = c = 19;
        the code above will get us an error, gotta do it like line 26
        */
        char singleLetter = 'b';
        boolean isItTrue = false;

        System.out.println(intNumber + " " + crazyNumber + " " + lastButNotLeast);

        int a = 9;
        double b = a;

        System.out.println(a + " " + b);

        double d = 10.86;
        int i = (int) d; // (int) kısmını yazmazsak hata alıyoruz

        System.out.println(d + " " + i);

        int sayi = 15;
        String yazi = "46das";
        String sonuc = sayi + yazi;
        System.out.println(sonuc);

    }

}
