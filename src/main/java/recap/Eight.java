package recap;

public class Eight extends Eight_2 implements Eight_3{

    @Override
    public void scream(){
        System.out.println("i am screaming");
    }

    @Override
    public void sing(){
        System.out.println("i am singing");
    }

    public static void main(String[] args){

        Eight nesne = new Eight();

        nesne.running();
        nesne.scream();
        nesne.sing();
        nesne.defaultMethod();

    }

}
