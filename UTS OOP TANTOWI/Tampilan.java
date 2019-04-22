import data.Laptop;
import service.Proces;
import java.util.Scanner;

public class Tampilan {
    private static Scanner scn;
    private static Proces op;
    
    public static void main(String args[]){
        int m;
        scn = new Scanner(System.in);
        op = new Proces();

        do {
            menu();
            m = scn.nextInt();
            pilih(m);
        }while (m !=5);
    }
    private static void pilih(int p){
        if (p==1) {
            tambah();
        }
        else if (p==2) {
            ubah();
        }
        else if (p==3) {
            hapus();
        }
        else if (p==4) {
            op.LapTampil();
        }
    }
    private static void ubah(){
        scn = new Scanner(System.in);
        String kode, nama;
        int harga, stok;

        System.out.println("Ubah Data");
        System.out.print("Kode Produk     : ");
        kode = scn.nextLine();
        System.out.print("Nama Laptop     : ");
        nama = scn.nextLine();
        System.out.print("Harga           : ");
        harga = Integer.parseInt(scn.nextLine());
        System.out.print("Jumlah Stok     : ");
        stok = Integer.parseInt(scn.nextLine());
        op.ubah(new Laptop(kode, nama, harga, stok));
    }
    private static void hapus(){
        scn = new Scanner(System.in);
        String kode, nama = null;
        int harga = 0, stok = 0;

        System.out.println("Tambah Data");
        System.out.println("Kode Proudk     : ");
        kode = scn.nextLine();
        op.hapus(new Laptop(kode, nama, harga, stok));
    }

    private static void tambah(){
        scn = new Scanner(System.in);
        String kode, nama;
        int harga, stok;

        System.out.println("Tambah Data");
        System.out.print("Kode Produk         : ");
        kode = scn.nextLine();
        System.out.print("Nama Laptop         : ");
        nama = scn.nextLine();
        System.out.print("Harga               : ");
        harga = Integer.parseInt(scn.nextLine());
        System.out.print("Jumlah Stok         : ");
        stok = Integer.parseInt(scn.nextLine());
        op.simpan(new Laptop(kode, nama, harga, stok));
    }

    private static void menu(){
        System.out.println("Toko Laptop");
        System.out.println("Menu");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. Kkeluar\n");
        System.out.print("Pilih Menu >");

    }
}