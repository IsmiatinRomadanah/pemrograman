
import java.util.Scanner;

public class percabangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a;
        
        System.out.println("Penyakit Jantung ");
        System.out.println("A. Gejala");
        System.out.println("B. Cara Pengobatan");
        System.out.println("C. Dampak");
        System.out.println("==================================");
        System.out.print("Masukkan kode huruf [A-C/a-c]  : ");
        a = sc.next().charAt(0);
        
        if(a == 'a' || a == 'A'){
            System.out.println("Nyeri pada dada,batuk, sakit kepala");
        }else if(a == 'b' || a == 'B'){
            System.out.println("Perbaikan gaya hidup, obat-obatan, operasi, dll");
        }else if(a == 'c' || a == 'C'){
            System.out.println("Gangguan irama jantung,gagal jantung, kematian");
        }else{
            System.out.println("Inputan tidak valid");
        }
    }
    
}
