package service;

import data.Laptop;
import java.util.LinkedList;
import java.util.List;

public class Proces {
    private static List<Laptop> data = new LinkedList<Laptop>();
    public void simpan(Laptop d){
        data.add(d);
        System.out.println("Data Telah Ditambahkan");
    }

    public void ubah(Laptop d){
        int idx = data.indexOf(d);
        if (idx >=0){
            data.set(idx, d);
            System.out.println("Data Telah Diubah");
        } else
            System.out.println("Tidak Ditemukan Data yang Cocok");
    }

    public void hapus(Laptop d){
        int idx = data.indexOf(d);
        if (idx >=0){
            data.remove(idx);
            System.out.println("Data Telah Dihapus");
        } else
            System.out.println("Tidak Ditemukan Data yang Cocok dengan Kode Yang Dimasukkan");
    }

    public void LapTampil(){
        System.out.println("Data Laptop");
            int i = 1;
            for (Laptop l : data){
                System.out.println("Data ke- "+ i++);
                System.out.println("Data Kosong");
                System.out.println("Kode Produk     : "+ l.getKode());
                System.out.println("Nama Laptop     : "+ l.getNama());
                System.out.println("Harga           : "+ l.getHarga());
                System.out.println("Jumlah Stok     : "+ l.getStok());
            }
    }
        
}
    
