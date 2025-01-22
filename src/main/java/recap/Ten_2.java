package recap;

import java.util.HashSet;
import java.util.Iterator;

public class Ten_2 {

    public static void main(String[] args){

        HashSet<String> countries = new HashSet<String>();

        countries.add("Brazil");
        countries.add("Turkey");
        countries.add("England");
        countries.add("France");
        countries.add("Spain");
        countries.add("Argentina");
        countries.add("China");


        countries.remove("Turkey");

        System.out.println(countries.contains("Brazil") + " " + countries.contains("Turkey"));

        System.out.println(countries.size());

        for(String i : countries){
            System.out.println(i);
        }

        System.out.println("**********");

        Iterator<String> it = countries.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("**********");

        Iterator<String> it2 = countries.iterator();

        while(it2.hasNext()){
            String i = it2.next();

            if(i.equalsIgnoreCase("spain")){
                it2.remove();
            }

        }
        for(String i : countries){
            System.out.println(i);
        }


    }

}
