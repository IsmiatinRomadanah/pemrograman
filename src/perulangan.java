import java.util.Scanner;

public class perulangan{
    
    public static void main(String[] args) {
        boolean run = true;
        int hitung = 0-1;
        String namaPenyakit;
        String kodePenyakit;
        Scanner sc = new Scanner(System.in);

        while(run){
            System.out.println("Nama Penyakit ");
            System.out.println("1. anemia");
            System.out.println("2. jantung");
            System.out.println("3. stroke");
            System.out.println("4. patah tulang");
            System.out.println("==================================");
            System.out.print("Masukkan nama penyakit : ");
            namaPenyakit = sc.nextLine();
            System.out.print("Masukkan Kode penyakit : ");
            kodePenyakit = sc.nextLine();
            
            if(namaPenyakit.equalsIgnoreCase("anemia") && kodePenyakit.equalsIgnoreCase("D50")){
                System.out.println("Selamat, nama penyakit dan kode penyakit anda masukkan valid");
                run =false;
            }else if(namaPenyakit.equalsIgnoreCase("jantung") && kodePenyakit.equalsIgnoreCase("I20")){
                System.out.println("Selamat, nama penyakit dan kode penyakit anda masukkan valid");
                run =false;
            }else if(namaPenyakit.equalsIgnoreCase("stroke") && kodePenyakit.equalsIgnoreCase("I63")){
                System.out.println("Selamat, nama penyakit dan kode penyakit anda masukkan valid");
                run =false;
            }else if(namaPenyakit.equalsIgnoreCase("patah tulang") && kodePenyakit.equalsIgnoreCase("S72")){
                 System.out.println("Selamat, nama penyakit dan kode penyakit anda masukkan valid");
                run =false;
            }else{
                System.out.println("Mohon maaf, nama penyakit dan kode penyakit anda masukkan invalid");
                System.out.println("==================================");
                run = true;
            }
            hitung++;
        }if(hitung > 1)
        System.out.println("Anda melakukan kesalahan memasukkan nama penyakit dan kode penyakit sebanyak "+hitung+" kali");
    }
}
