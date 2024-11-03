package sofa;

public abstract class Calories {

    protected double gainedWeight;
    protected double lostWeight;

    protected double calorieDeficit(){
        return gainedWeight-lostWeight;
    }

    protected abstract void motivationWords();

    protected static final double calorieToJouleMultiplier = 4.18400;
    protected static final double jouleToCalorieMultiplier = 0.239005736;

}
