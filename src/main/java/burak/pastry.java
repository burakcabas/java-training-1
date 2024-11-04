package burak;

public abstract class pastry {

    public static int crazyNumber = 88;
    private String secretFormula;
    private double neededPastryHeat;

    public String getSecretFormula(){
        return secretFormula;
    }

    public void setSecretFormula(String formula){
        this.secretFormula = formula;
    }

    public double getNeededPastryHeat(){
        return neededPastryHeat;
    }

    public void setNeededPastryHeat(double doubleNumber){
        this.neededPastryHeat = doubleNumber;
    }

    public abstract void scream();

    protected void shout(){
        System.out.println("SHOUT!");
    }

    protected void shout(int a){
        System.out.println("SHOUT! " + a + " times.");
    }

    public pastry(){}

    public pastry(String a, double b){
        this.secretFormula = a;
        this.neededPastryHeat = b;
    }

}
