package salt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class OctoberTwentyFourth2 {

    public static void main(String[] args){

        ArrayList<Integer> coolNumbers = new ArrayList<Integer>();

        coolNumbers.add(5);
        coolNumbers.add(45);
        coolNumbers.add(42);
        coolNumbers.add(43);
        coolNumbers.add(44);
        coolNumbers.add(44);
        coolNumbers.add(47);
        coolNumbers.add(2,23);

        coolNumbers.set(0,34);

        System.out.println(coolNumbers.get(2));

        System.out.println(coolNumbers);

        coolNumbers.removeLast();

        System.out.println(coolNumbers.size());

        Collections.sort(coolNumbers);

        System.out.println(coolNumbers);

        Collections.sort(coolNumbers, Collections.reverseOrder());

        System.out.println(coolNumbers);


        LinkedList<String> names = new LinkedList<String>();

        names.add("Ali");
        names.add("Veli");
        names.add("48");
        names.add("50");
        names.add("top");

        names.removeLast();

        System.out.println(names);

        System.out.println(names.getFirst());

        names.set(0, "Derrick");

        System.out.println(names);

        System.out.println(names.size());

        Collections.sort(names);

        System.out.println(names);

        names.add("Zayn");
        names.add("Zet");

        Collections.sort(names, Collections.reverseOrder());

        System.out.println(names);



    }

}
