package recap;

import java.util.ArrayList;
import java.util.Collections;

public class Nine {

    public static void main(String[] args){

        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.addFirst("Burak");
        myArrayList.add("Ali");
        myArrayList.add("Veli");
        myArrayList.add("48");
        myArrayList.add("50");

        myArrayList.removeLast();

        System.out.println(myArrayList.get(1));

        myArrayList.set(1,"John");

        System.out.println(myArrayList.get(1));

        System.out.println(myArrayList.size());

        for(String i : myArrayList){
            System.out.println(i);
        }

        Collections.sort(myArrayList);

        for(String i : myArrayList){
            System.out.println(i);
        }

        Collections.sort(myArrayList, Collections.reverseOrder());

        for(String i : myArrayList){
            System.out.println(i);
        }

    }

}
