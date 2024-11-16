package sofa;

public class ExceptionTraining4 {

    public static void main(String[] args) {

        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println("An age problem occurred: " + e.getMessage());
        }
        finally{
            System.out.println("This is finally");
        }

    }

    public static void checkAge(int age) throws AgeException{
        if(age < 18 && age >= 0){
            throw new AgeException("You can't enter if you are below 18 years of age");
        }
        else if(age < 0){
            throw new AgeException("Your age cant be lower than 0");
        }
        else if(age >= 18){
            System.out.println("You are in, welcome");
        }
    }

}
