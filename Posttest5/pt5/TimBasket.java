package pt5;

public abstract class TimBasket {
    protected String namatim;
    protected String lokasitim;
    protected int tahunbentuk;
    
    protected abstract void show();
    
    protected abstract void setNamaTim(String namatim);
    protected abstract String getNamaTim();
    protected abstract void setLokasiTim(String lokasitim);
    protected abstract String getLokasiTim();
    protected abstract void setTahunBentuk(int tahunbentuk);
    protected abstract int getTahunBentuk();
    
}