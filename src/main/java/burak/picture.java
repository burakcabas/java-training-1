package burak;

public abstract class picture {

    static final int price = 122;

    private int overpriced = 9;

    public void setOverpriced(int number){
        this.overpriced = number;
    }

    public int getOverpriced(){
        return overpriced;
    }


    public void game(){
        System.out.println("get it sexy");
    }

    public abstract void voice();

}
