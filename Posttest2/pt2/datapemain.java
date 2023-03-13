package pt2;

public class datapemain {
    private String nama, tim;
    private int nopung, umur;
    
    public datapemain(String nama, String tim, int nopung, int umur){
        this.nama = nama;
        this.tim = tim;
        this.nopung = nopung;
        this.umur = umur;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTim() {
        return tim;
    }

    public void setTim(String tim) {
        this.tim = tim;
    }

    public int getNopung() {
        return nopung;
    }

    public void setNopung(int nopung) {
        this.nopung = nopung;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
}
