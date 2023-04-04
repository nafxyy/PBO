package pt5;

public final class datapelatih extends TimBasket{
    private String namapelatih;
    private int lamamelatih;
    
    public datapelatih(final String namatim, final String lokasitim, final int tahunbentuk, final String namapelatih, final int lamamelatih) {
        this.namapelatih = namapelatih;
        this.lamamelatih = lamamelatih;
        this.namatim = namatim;
        this.lokasitim = lokasitim;
        this.tahunbentuk = tahunbentuk;
    }
    
    public String getNamapelatih() {
        return namapelatih;
    }
    
    public void setNamapelatih(String namapelatih) {
        this.namapelatih = namapelatih;
    }
    
    public int getLamaMelatih() {
        return lamamelatih;
    }
    
    public void setLamaMelatih(int lamamelatih) {
        this.lamamelatih = lamamelatih;
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
        System.out.println("Nama Pelatih = " + this.getNamapelatih());
        System.out.println("Lama Melatih = " + this.getLamaMelatih() + " Tahun");
        System.out.println("Nama Tim = " + this.getNamaTim());
        System.out.println("Lokasi Tim = " + this.getLokasiTim());
        System.out.println("Tahun Tim Terbentuk = " + this.getTahunBentuk());
    }
}
