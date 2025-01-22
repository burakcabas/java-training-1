package recap;

import java.util.HashMap;

public class Ten {

    public static void main(String[] args){

        HashMap<String, Integer> nameAge = new HashMap<String, Integer>();

        nameAge.put("Burak", 26);
        nameAge.put("Ali",3);
        nameAge.put("Veli", 99);

        for(String i : nameAge.keySet()){
            System.out.println("Key: " + i + " Value: " + nameAge.get(i) + nameAge.containsKey("Burak"));
        }


    }

}
