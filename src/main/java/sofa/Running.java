package sofa;

public interface Running {

    public static final int numberForNothing = 9;

    public void fastRunning();
    public void slowRunning();

    public default void normalRunning(){
        System.out.println("Normal running.");
    }
}
