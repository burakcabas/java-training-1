package salt;

public interface coolInterface {

    public static final int constantNumber = 237;

    public void scream();

    public default void bark(){
        System.out.println("A bark is always the same, wof!");
    }

    public int luckyNumber(int a);

}
