package appkrs;


public class DataKeluar {
    int kode;
    String nama;
    String jumlah;
    int tanggal;
    String tanggal2;
    String kategori;
    
    public DataKeluar(){
        
    }

    public DataKeluar(int kode, String nama, String jumlah, int tanggal, String tanggal2, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
        this.tanggal2 = tanggal2;
        this.kategori = kategori;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }
    
        public String getTanggal2() {
        return tanggal2;
    }

    public void setTanggal2(String tanggal2) {
        this.tanggal2 = tanggal2;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    
    
}
