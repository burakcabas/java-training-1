package burak;

public class desk implements cleaning {

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    private String marka;

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    private int uzunluk;
    private double fiyat;
    desk(String brand, int length, double price) {

        this.marka = brand;
        uzunluk = length;
        fiyat = price;

        System.out.println("Masa oluşturuldu");
        System.out.println("Masanın markası: " + marka);
        System.out.println("Masanın uzunluğu: " + uzunluk);
        System.out.println("Masanın fiyatı: " + fiyat);

    }

    @Override
    public void clean(){
        System.out.println("Your desk is cleaned");
    }



    desk(){

    }
    /*public static void main(String[] args){

        desk masa1 = new desk("Eufy",100,199.99);
        desk masa2 = new desk();
        masa2.fiyat = 145.69;
        masa2.marka = "Inflame";
        masa2.setUzunluk(56);

        System.out.println(masa2.fiyat + " " + masa2.marka + " " + masa2.uzunluk);

    }*/
}
