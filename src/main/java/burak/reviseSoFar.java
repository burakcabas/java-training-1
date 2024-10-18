package burak;

import salt.war;
import salt.coolInterface;
import salt.coolAbstractClass;


public class reviseSoFar extends coolAbstractClass implements coolInterface {

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
    public void breathe(){
        System.out.println("Breathe in child class");
    }

public static void main(String[] args){

    war nesne = new war(5,"BMW",13.7);

    System.out.println(nesne.getNumber() + " " + nesne.getName() + " " + nesne.getWonky());

    nesne.setNumber(26);

    System.out.println(nesne.getNumber() + " " + nesne.getName() + " " + nesne.getWonky());

    nesne.scream();
    System.out.println(nesne.luckyNumber(35));
    nesne.bark();

    reviseSoFar nesne2 = new reviseSoFar();
    nesne2.bark();
    System.out.println(nesne.constantNumber);
    System.out.println(nesne2.constantNumber);

    System.out.println("******************************");

    nesne2.breathe();
    nesne2.fart();
    System.out.println(coolConstant);
    nesne2.setBrand("lcw");
    nesne2.setCharacter('v');
    nesne2.setOutcome(true);
    System.out.println(nesne2.getOutcome() +" " + nesne2.getBrand() + " " + nesne2.getCharacter());


}


}
