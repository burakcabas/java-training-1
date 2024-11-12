package sofa;

import java.util.ArrayList;

public class ExceptionTraining1 {

    public static void main(String[] args){

        try{
            ArrayList<Integer> randomArrayList = new ArrayList<Integer>();

            randomArrayList.add(5);
            randomArrayList.add(14);
            randomArrayList.add(25);

            for(int i : randomArrayList){
                System.out.println(i);
            }

            randomArrayList.get(3);
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            System.out.println("Try-Catch is finished. This is finally.");
        }

    }

}
