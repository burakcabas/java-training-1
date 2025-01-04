package recap;

public class four {

    public static int sum(int a, int b){
        if(a>b){
            return a + sum(a-1,b);
        }
        else{
            return a;
        }
    }

    public static void main(String[] args){

        int a = 5, b = 1;

        System.out.println(sum(a,b));

    }

}
