package pt3;

public class datapemain extends TimBasket {
    private String nama;
    private String posisi;
    private int nopung;
    private int umur;
    
    public datapemain(String namatim, String lokasitim, int tahunbentuk, String nama, int umur, int nopung, String posisi) {
        super(namatim, lokasitim, tahunbentuk);
        this.nama = nama;
        this.umur = umur;
        this.nopung = nopung;
        this.posisi = posisi;
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
}
