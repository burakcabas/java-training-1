package sofa;

import burak.pastry;

public class baking extends pastry {

    public int getBanger() {
        return banger;
    }

    public void setBanger(int banger) {
        this.banger = banger;
    }

    int banger;

    public baking(){}

    public baking(String a, double b) {
        super(a, b);
    }

    public baking(String a, double b, int c){
        super(a,b);
        this.banger = c;
    }

    @Override
    public void scream() {
        System.out.println("AAAAA!");
    }

    public static void main(String[] args){

        baking member = new baking("Worker", 150.38, 25);
        member.shout();
        member.shout(4);

    }
}
