package burak;

public class ThreadTraining {

public static void main(String[] args){

    MyThreadClass thread1 = new MyThreadClass();
    thread1.start();
    System.out.println("This is in the main function");

}

}
