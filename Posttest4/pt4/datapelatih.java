package pt4;

public class datapelatih extends TimBasket{
    private String namapelatih;
    private int lamamelatih;
    
    public datapelatih(String namatim, String lokasitim, int tahunbentuk, String namapelatih, int lamamelatih) {
        super(namatim, lokasitim, tahunbentuk);
        this.namapelatih = namapelatih;
        this.lamamelatih = lamamelatih;
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
    
    @Override
    public void show(){
        System.out.println("Nama Pelatih = " + this.getNamapelatih());
        System.out.println("Lama Melatih = " + this.getLamaMelatih() + " Tahun");
        System.out.println("Nama Tim = " + this.getNamatim());
        System.out.println("Lokasi Tim = " + this.getLokasiTim());
        System.out.println("Tahun Tim Terbentuk = " + this.getTahunBentuk());
    }
}
