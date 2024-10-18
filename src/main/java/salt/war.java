package salt;

import salt.coolInterface;

public class war implements coolInterface{

    @Override
    public void scream(){
        System.out.println("An overriden scream");
    }

    @Override
    public int luckyNumber(int a){
        a = a + a;
        return a;
    }

    @Override
    public void bark(){
        System.out.println("An overriden bark, my goodness!");
    }

    private int number;
    private String name;
    private double wonky;


    public void setNumber(int a){
        this.number = a;
    }
    public int getNumber(){
        return this.number;
    }
    public void setName(String b){
        this.name = b;
    }
    public String getName(){
        return this.name;
    }
    public void setWonky(double d){
        this.wonky = d;
    }
    public double getWonky(){
        return this.wonky;
    }

    public war(){
        System.out.println("The default constructor is called!");
    }

    public war(int a, String b, double c){
        this.number = a;
        this.name = b;
        this.wonky = c;

        System.out.println("A constructor with parameters is called and the object is created!");

    }

}
