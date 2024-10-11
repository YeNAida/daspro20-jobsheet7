import java.util.Scanner;

/**
 * SiakadWhile20
 */
public class SiakadWhile20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai,jumlah=0,i=0;

        System.out.println("Masukkan Jumlah nilai Mahasiswa: ");
        jumlah = input.nextInt();
        
        
        while (i < jumlah) {
            
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+": ");;
            nilai = input.nextInt();
            
            if (nilai<0||nilai>100) {
                System.out.println("nilai tidak valid. masukkan lagi nilai yang valid!");
                continue;
            }

            if (nilai>80 && nilai <=100) {
                System.out.println("Nilai mahasiswa ke-"+(i + 1)+"adalah A");
                System.out.println("Nilai anda Bagus sekali, Pertahankan!!");
            } else if (nilai>73 && nilai<=80) {
                System.out.println("Nilai mahasiswa ke-"+(i + 1)+"adalah B+");
            }else if (nilai >65 && nilai<=73) {
                System.out.println("Nilai mahasiswa ke-"+(i + 1)+"adalah B");
            }else if(nilai>60 && nilai <=65){
                System.out.println("Nilai mahasiswa ke-"+(i + 1)+"adalah C+");
            }else if (nilai>50 && nilai <=60) {
                System.out.println("Nilai mahasiswa ke-"+(i + 1)+"adalah D");
            }else if (nilai>39 && nilai <=50) {
                System.out.println("Nilai mahasiswa ke-"+(i + 1)+"adalah E");
            }
            i++;
        }
    }
}
