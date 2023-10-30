import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nilaipertama,nilaikedua,pilih;
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();

        System.out.println("Masukkan angka pertama: ");
        nilaipertama = sc.nextInt();

        System.out.println("Masukkan angka kedua; ");
        nilaikedua = sc.nextInt();

        System.out.println("1. Penjumlahan \n");
        System.out.println("2. Pengurangan \n");
        System.out.println("3. Perkalian   \n");
        System.out.println("4. Pembagian   \n");
        System.out.println("Pilihan: ");
        pilih = sc.nextInt();

        if (pilih == 1)
            System.out.println("Hasil: " + obj.penjumlahan(nilaipertama,nilaikedua));
        else if (pilih == 2) {
            System.out.println("Hasil: "+ obj.pengurangan(nilaipertama,nilaikedua));
        } else if (pilih == 3) {
            System.out.println("Hasil: "+ obj.perkalian(nilaipertama,nilaikedua));
        } else if (pilih == 4) {
            System.out.println("Hasil: "+ obj.pembagian(nilaipertama,nilaikedua));
        }
    }

  public double penjumlahan (double x, double y){
  return x+y;
  }
  public double pengurangan (double x, double y){
  return x-y;
  }
  public double perkalian (double x, double y){
  return x*y;
  }
  public double pembagian (double x, double y){
  return x/y;
  }
}