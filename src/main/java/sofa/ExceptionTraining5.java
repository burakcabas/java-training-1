package sofa;

public class ExceptionTraining5{

    public static void main(String[] args){

        try{
            int z = 5/0;
        }
        catch(ArithmeticException ae){
            System.out.println("Error: " + ae.getMessage());
        }

    }

}
