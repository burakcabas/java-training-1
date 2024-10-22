package salt;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetTraining {

    public static void main(String[] args){

        HashSet<String> surnames = new HashSet<String>();
        Scanner scan = new Scanner(System.in);

        surnames.add("Çabaş");
        surnames.add("Öztürk");
        surnames.add("Yılmaz");
        surnames.add("Demirel");

        for(String i : surnames){
            System.out.print(i + " ");
        }

        System.out.println();

        surnames.remove("Demirel");

        for(String i : surnames){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("HashSet'te olup olmadığını kontrol etmek için bir soyadı yazın: ");

        String check = scan.nextLine();

        if(surnames.contains(check)){
            System.out.println("Evet, bu soyadı var: " + check);
        }
        else {
            System.out.println("Hayır, bu soyadı yok: " + check);
        }

        System.out.println("HashSet'in Boyutu: " + surnames.size());

        surnames.clear();

        System.out.println("HashSet'in Boyutu: " + surnames.size());

    }

}
