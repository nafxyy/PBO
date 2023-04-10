package pt6;

import java.io.IOException;

public interface AdminTask {
    void mainMenu() throws IOException, InterruptedException;
    void tambahData() throws IOException;
    void tambahData(String namapelatih, int lamamelatih, String namatim, String lokasitim, int tahunbentuk) throws IOException;
    void tambahData(String nama, String posisi, int nopung, int umur, String namatim, String lokasitim, int tahunbentuk) throws IOException;
    
    void lihatData() throws IOException;
    void lihatData(int opsi1, int opsi2) throws IOException;
    void ubahData() throws IOException;
    void hapusData() throws IOException;
    void Exit() throws IOException;
}