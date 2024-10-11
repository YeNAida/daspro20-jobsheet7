import java.util.Scanner;

/**
 * SistemParkir20
 */
public class SistemParkir20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis,durasi,total=0;



        while (true) {
            System.out.println("jenis kendaraan : ");
            System.out.println("1. mobil");
            System.out.println("2. motor ");
            System.out.println("0. keluar");
            System.out.println("Masukkan jenis kendaraan anda:");
            jenis = input.nextInt();


            if (jenis == 0) {
                System.out.println("Total pembayaran Parkir anda: Rp " + total);
                break;
            }


            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam) : ");
                durasi = input.nextInt();
                total = 0;
                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else if (jenis == 2) {
                        total += durasi * 2000;
                    }
                }
                System.out.println("Total pembayaran : Rp " + total);
                total = 0;


            } else {
                System.out.println("Jenis kendaraan yang anda masukkan tidak valid. Silakan coba lagi!");
            }
        }

    }
}
