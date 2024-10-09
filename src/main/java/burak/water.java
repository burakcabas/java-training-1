package burak;

public class water extends picture{

    @Override
    public void voice(){
        System.out.println("i'll holla at ya");
    }

    public static void main(String[] args){

        water nesne = new water();
        int a = price;
        int b = nesne.getOverpriced();
        nesne.setOverpriced(44);   

        nesne.voice();
        nesne.game();
        System.out.println(a);




    }
}


