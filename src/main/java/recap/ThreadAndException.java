package recap;

public class ThreadAndException {

    public static synchronized void scream1(){
        System.out.println("Scream!");
    }

    public static void main(String[] args) throws ExceptionRecap, InterruptedException {

        ThreadRecap runnable1 = new ThreadRecap();
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        thread1.join();

        while(thread1.isAlive()){
            System.out.println("We are waiting thread1 to stop...");
        }

        ThreadExtends thread2 = new ThreadExtends();
        thread2.start();

        while(thread2.isAlive()){
            System.out.println("We are waiting thread2 to stop...");
        }

        throw new ExceptionRecap("This is a custom exception");

    }

}
