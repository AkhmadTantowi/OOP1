package data;

public class Laptop{
    private String kode;
    private String nama;
    private int harga;
    private int stok;

    public Laptop(String kode, String nama, int harga, int stok){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    @Override
    public boolean equals(Object o) {
        Laptop lp = (Laptop) o;
        return kode.equals(lp.getKode());
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}