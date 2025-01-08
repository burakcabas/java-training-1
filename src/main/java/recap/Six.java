package recap;

    public class Six {

    private String name;
    private String surname;
    private int age;

    public String getSurname() {
            return surname;
        }

    public void setSurname(String surname) {
            this.surname = surname;
        }

    public int getAge() {
            return age;
        }

    public void setAge(int age) {
            this.age = age;
        }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Six(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        System.out.println("Constructor from Six is called!");
    }

    public Six(){} //default constructor


}
