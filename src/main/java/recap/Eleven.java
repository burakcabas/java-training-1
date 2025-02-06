package recap;

import java.util.ArrayList;
import java.util.Iterator;

public class Eleven {

    public static void main(String[] args){

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Ferrari");

        Iterator<String> it = cars.iterator();

        while(it.hasNext()){
            String nesne = it.next();

            if(nesne.equalsIgnoreCase("Mercedes")){
                it.remove();
            }
        }

        for(String i : cars){
            System.out.println(i);
        }

    }

}
