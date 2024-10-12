package burak;

import static java.lang.Math.*;

class smart_television extends television implements cleaning {

    @Override
    protected void open() {

        System.out.println(brand + " Smart tv is open");
    }

    protected void open(int a){

        System.out.print("This is an overloaded method calling technique for the method 'open' in the smart tv class");
    }

    smart_television(int genişlik, int uzunluk, double fiyat, String marka){
        width = genişlik;
        length = uzunluk;
        price = fiyat;
        brand = marka;
    }

    @Override
    public void clean() {
        System.out.println("You cannot clean a smart TV");
    }

    public static void main(String[] args){

        smart_television ürün1 = new smart_television(15,20,236.25,"Grundig");
        System.out.print(ürün1.brand);
        ürün1.open();
        ürün1.open(1);
        ürün1.clean();

        boolean isItThis = true;

        System.out.println(isItThis);

        System.out.println(max(5,223));

    }

}
