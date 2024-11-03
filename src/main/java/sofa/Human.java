package sofa;

public class Human extends Calories implements Running{

    public Human(double gained, double lost){
        gainedWeight = gained;
        lostWeight = lost;
    }

    @Override
    public void slowRunning(){
        System.out.println("Slow running.");
    }

    @Override
    public void fastRunning(){
        System.out.println("Fast running.");
    }

    @Override
    public void motivationWords(){
        System.out.println("Come on, you can do it!");
    }

    public static void main(String[] args){

        Human burak = new Human(20.34,3.01);

        System.out.println(burak.calorieDeficit());

        System.out.println(numberForNothing);

        burak.normalRunning();
        burak.slowRunning();
        burak.fastRunning();

        burak.motivationWords();

        double jouleValue1 = 15.0;
        double calorieValue1;

        double calorieValue2 = 23.55;
        double jouleValue2;

        calorieValue1 = jouleValue1 * jouleToCalorieMultiplier;

        jouleValue2 = calorieValue2 * calorieToJouleMultiplier;

        System.out.println((float)calorieValue1 + " calories");

        System.out.println((float)jouleValue2 + " joules");


    }

}