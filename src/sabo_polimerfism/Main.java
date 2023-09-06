
package sabo_polimerfism;

public class Main {

    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        persegi p = new persegi(4);
        segitiga s = new segitiga(6, 3);
        lingkaran l = new lingkaran(50);
        
        //memanggil method dan keliling
        bd.luas();
        bd.keliling();
        
        System.out.println("Luas persegi = "+p.luas());
        System.out.println("Keliling persegi = "+p.keliling());
        System.out.println("Luas segitiga = "+s.luas());
        System.out.println("Keliling segitiga = "+s.keliling());
        System.out.println("Luas lingkaran = "+l.luas());
        System.out.println("Keliling lingkaran = "+l.keliling());
    }
    
}
