package recap;

public class Seven {
    int x = 10;

    public void printOuter(){
        System.out.println("outer class print");
    }

    public class SevenInnerClass{

        int y = 5;

        public void printInner(){
            System.out.println("inner class print");
        }

    }

    public static void main(String[] args){

        Seven outerObj = new Seven();
        Seven.SevenInnerClass innerObj = outerObj.new SevenInnerClass();

        outerObj.printOuter();
        //outerObj.printInner(); gives an error

       // innerObj.printOuter(); gives an error
        innerObj.printInner();

        System.out.println(innerObj.y + outerObj.x);

    }

}
