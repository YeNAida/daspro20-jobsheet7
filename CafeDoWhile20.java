import java.util.Scanner;

public class CafeDoWhile20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kopi,teh,roti;
        String NamaPelanggan;
        double totalHarga,hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        
        do {
            System.out.print("Masukkan nama pelanggan (ketik'batal' untuk keluar):");
            NamaPelanggan = input.nextLine();
            if (NamaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalakan.");
                break;
            }
            System.out.print("Jumlah Kopi: ");
            kopi = input.nextInt();
            System.out.print("Jumlah Teh: ");
            teh = input.nextInt();
            System.out.print("Jumlah Roti: ");
            roti = input.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " +totalHarga);
            input.nextLine();

        } while (true);
        System.out.println("Semua Transaksi Selesai.");
    }
}
