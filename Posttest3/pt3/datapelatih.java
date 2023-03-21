package pt3;

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
}
