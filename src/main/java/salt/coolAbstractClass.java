package salt;

public abstract class coolAbstractClass {

    private boolean outcome;
    private char character;
    private String brand;


    public static final int coolConstant = 6666;

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setOutcome(boolean a){
        this.outcome = a;
    }
    public boolean getOutcome(){
        return outcome;
    }

    public abstract void breathe();

    public void fart(){
        System.out.println("Farted from coolAbstractClass");
    }





}
