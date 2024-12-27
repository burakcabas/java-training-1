package recap;

public class three extends three_1 {

    private int number;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    @Override
    public int multiplyByTwo(int number){
        return number*2;
    }

    //Main Method below
    public static void main(String[] args){

    }

}
