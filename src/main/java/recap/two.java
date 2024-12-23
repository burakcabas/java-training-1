package recap;

public class two {

    public static void main(String[] args){

        String txt = "My favorite animal is \"Purple Elephant\".";

        System.out.println(txt);

        int[][] arr = {{1,2,3,4},{5,6,7,8}};

        for(int[] row : arr){
            for(int i : row){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        char a = 'a';
        int b = a;
        System.out.println(b);

        System.out.println(Math.sqrt(64));

        boolean moment = true;

        switch(a){
            case 'a':{
                System.out.println("a");
                break;
            }
            default:
                System.out.println("something else");
        }

        if(a == 'a'){
            System.out.println("nd");
        }
        else{
            System.out.println("rr");
        }
    }

}
