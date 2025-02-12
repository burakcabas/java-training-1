package recap;

import static recap.ThreadAndException.scream1;

public class ThreadExtends extends Thread{
    @Override
    public void run(){
        System.out.println("Extended thread is running");
        scream1();
    }
}
