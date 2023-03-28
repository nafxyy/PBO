package pt4;

public class TimBasket {
    protected String namatim;
    protected String lokasitim;
    protected int tahunbentuk;
    
    public TimBasket(String namatim, String lokasitim, int tahunbentuk) {
        this.namatim = namatim;
        this.lokasitim = lokasitim;
        this.tahunbentuk = tahunbentuk;
    }
    
    public String getNamatim() {
        return namatim;
    }
    
    public void setNamatim(String namatim) {
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
    
    public void show(){
        System.out.println("Nama Tim = " + this.getNamatim());
        System.out.println("Lokasi Tim = " + this.getLokasiTim());
        System.out.println("Tahun Tim Terbentuk = " + this.getTahunBentuk());
    }
}
