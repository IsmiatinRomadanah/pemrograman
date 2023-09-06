
import java.util.Scanner;

public class Operator {
    int bil1;
    int bil2;
    
void tambah() {
        int hasil = bil1 + bil2;
        System.out.println("Hasil penjumlahan: " + hasil);
    }
void kurang() {
        int hasil = bil1 - bil2;
        System.out.println("Hasil pengurangan: " + hasil);
    }
void kali() {
        int hasil = bil1 * bil2;
        System.out.println("Hasil perkalian: " + hasil);
    }
void bagi() {
        int hasil = bil1 / bil2;
        System.out.println("Hasil pembagian: " + hasil);
    }

    public static void main(String[] ismun) {
        Scanner sc = new Scanner(System.in);
        Operator op = new Operator();
        
        System.out.print("Masukkan bilangan 1 : ");
        op.bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan 2 : ");
        op.bil2 = sc.nextInt();
        
        System.out.println("==================");
        op.tambah();
        System.out.println("------------------");
        op.kurang();
        System.out.println("------------------");
        op.kali();
        System.out.println("------------------");
        op.bagi();
        System.out.println("------------------");
    }
}
