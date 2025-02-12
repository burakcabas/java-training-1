package recap;

import static recap.ThreadAndException.scream1;


public class ThreadRecap implements Runnable{

    @Override
    public void run(){
        System.out.println("Implemented thread is running");
        scream1();
    }

}
