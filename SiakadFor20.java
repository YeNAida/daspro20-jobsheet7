import java.util.Scanner;

public class SiakadFor20 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double nilai, tertinggi =0,terendah=100;

        double nilaiMinimal=60.0;
        int jumlahMahasiwaLulus=0,Jumlahmahasiswatidaklulus=0;
        
        for (int i = 1;i <= 10;i++){
            System.out.println("Masukkan nilai mahasiswa ke-"+i+":");
            nilai = input.nextDouble();
            if (nilai>tertinggi) {
                tertinggi = nilai;
            }
            if (nilai<terendah) {
                terendah = nilai;
            }
            if (nilai >= nilaiMinimal) {
                Jumlahmahasiswatidaklulus++;
            } else {
                jumlahMahasiwaLulus++;
            }  
        }System.out.println("Nilai tertinggi:" + tertinggi);
        System.out.println("Nilai terendah:" + terendah);
        System.out.println("Jumlah Mahasiswa lulus:" + jumlahMahasiwaLulus);
        System.out.println("Jumlah Mahasiswa yang tidak lulus:" +Jumlahmahasiswatidaklulus);
    }
}
