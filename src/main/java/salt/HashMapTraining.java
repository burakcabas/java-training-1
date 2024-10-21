package salt;

import java.util.HashMap;

public class HashMapTraining {

    public static void main(String[] args){

        //key-value pairs, the first one is always the key and the second one is always the value

        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("John", 32);
        people.put("Alice", 12);
        people.put("Rogers", 55);
        people.put("Dennis", 100);
        people.put("Ali", 44);

        System.out.print("Key Set: ");
        for(String i: people.keySet()){
            System.out.print(i + " ");
        }

        System.out.println();

        people.remove("Ali");

        System.out.print("Values: ");
        for(int i: people.values()){
            System.out.print(i + " ");
        }

        System.out.println();

        for(String i: people.keySet()){
            System.out.println("Key: " + i + " Value: " + people.get(i));
        }

        System.out.println(people.get("Ali"));

        System.out.println("Size: " + people.size());

        people.clear();

        System.out.println("Size: " + people.size());

    }

}
