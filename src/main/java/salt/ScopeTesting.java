package salt;

public class ScopeTesting {

    int i = 99;

    public static void main(String[] args){

        for(int i = 0; i < 10 ; i++){
            System.out.print("a " + i + " ");
        }

        System.out.println();

        for(int i = 0; i < 15 ; i++){
            System.out.print("b " + i + " ");
        }

        System.out.println();

        int i = 400;

        System.out.println("Output inside main: " + i);

        ScopeTesting test = new ScopeTesting();

        System.out.println("Output outside main: " + test.i);

        System.out.println(Math.max(25,26));

    }

}
