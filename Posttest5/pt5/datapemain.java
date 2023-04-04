package pt5;

public final class datapemain extends TimBasket {
    private String nama;
    private String posisi;
    private int nopung;
    private int umur;
    
    public datapemain(String namatim, String lokasitim, int tahunbentuk, String nama, int umur, int nopung, String posisi) {
        this.nama = nama;
        this.umur = umur;
        this.nopung = nopung;
        this.posisi = posisi;
        this.namatim = namatim;
        this.lokasitim = lokasitim;
        this.tahunbentuk = tahunbentuk;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public int getNoPung() {
        return nopung;
    }
    
    public void setNoPung(int nopung) {
        this.nopung = nopung;
    }
    
    public String getPosisi() {
        return posisi;
    }
    
    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }
    
    public String getNamaTim() {
        return namatim;
    }
    
    public void setNamaTim(String namatim) {
        this.namatim = namatim;
    }
    
    public String getLokasiTim() {
        return lokasitim;
    }
    
    public void setLokasiTim(String lokasitim) {
        this.lokasitim = lokasitim;
    }
    
    public int getTahunBentuk() {
        return tahunbentuk;
    }
    
    public void setTahunBentuk(int tahunbentuk) {
        this.tahunbentuk = tahunbentuk;
    }
    
    @Override
    public void show(){
        System.out.println("Nama Pemain = " + this.getNama());
        System.out.println("Posisi Pemain = " + this.getPosisi());
        System.out.println("Nomor Punggung = " + this.getNoPung());
        System.out.println("Umur Pemain = " + this.getUmur());
        System.out.println("Nama Tim = " + this.getNamaTim());
        System.out.println("Lokasi Tim = " + this.getLokasiTim());
        System.out.println("Tahun Tim Terbentuk = " + this.getTahunBentuk());
    }
}