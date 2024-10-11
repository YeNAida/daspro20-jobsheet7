import java.util.Scanner;
public class Bioskop20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalTiket =0;
        double totalPenjualan=0;
        int jumlahtiketTerjual;
        double hargatiket = 50000;
    
        

        while (true) {
            System.out.print("Masukkan jumlah tiket yang terjual (ketik 0 untuk selesai): ");
            jumlahtiketTerjual = input.nextInt();


            if (jumlahtiketTerjual == 0) {
                break;
            }


            if (jumlahtiketTerjual < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan ulang.");
                continue;
            }


            double totalHarga = jumlahtiketTerjual * hargatiket;
            if (jumlahtiketTerjual>=4){
                totalHarga *= 0.10;
                System.out.println("Diskon 10%");
            }
            else if (jumlahtiketTerjual>=10) {
                totalHarga *= 0.15;
                System.out.println("Diskon 15%");
            } else {
                System.out.println("Coba berikan jawaban lainnya yang sesuai!");
            }
            totalTiket += jumlahtiketTerjual;
            totalPenjualan += totalHarga;


            System.out.println("Total harga tiket untuk " + jumlahtiketTerjual + " tiket: Rp " + totalHarga);
        }



        System.out.println("\nTotal tiket yang terjual hari ini: " + totalTiket);
        System.out.println("Total penjualan tiket: Rp " + totalPenjualan);
            
        } 
        
    }

