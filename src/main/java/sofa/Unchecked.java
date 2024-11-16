package sofa;

public class Unchecked {

    public static void main(String[] args){
        
        String myString = null; // once we set it to null, the method below will cause an unchecked exception
        printLength(myString); //unchecked exception

    }

    public static void printLength(String myString){
        System.out.println(myString.length());
    }

}
