import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua   : ");
        int b = input.nextInt();

        System.out.println("Pilih untuk melakukan operasi  : " +
                "1. Penjumlahan " +
                "2. Pengurangan " +
                "3. Perkalian " +
                "4. Pembagian ");
        int operasi = input.nextInt();


        switch (operasi) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("operasi tidak ditemukan");
        }
    }
}