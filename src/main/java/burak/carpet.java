package burak;

public class carpet {

    private String name;
    private int size;

    public int a = 0;

    public carpet(String newName, int newSize){
        this.name = newName;
        this.size = newSize;
    }


    public void setName(String settedName){
        this.name = settedName;
    }

    public String getName(){
        return this.name;
    }

    public void setSize(int settedSize){
        this.size = settedSize;
    }

    public int getSize(){
        return size;
    }

}
