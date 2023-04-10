package pt6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Admin implements AdminTask {
    static ArrayList<datapemain> pemain = new ArrayList<>();
    static ArrayList<datapemain>listPemain(){
        return pemain;
    }
    static ArrayList<datapelatih> pelatih = new ArrayList<>();
    static ArrayList<datapelatih>listPelatih(){
        return pelatih;
    }
    
    static InputStreamReader inputsr = new InputStreamReader(System.in);
    static BufferedReader buff = new BufferedReader(inputsr);
    
    private final String status = "Admin";
    private String username;
    private String password;
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getStatus() {
        return status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public final void lihatData() throws IOException{
    System.out.println("=================================");
    System.out.println("1. Lihat Data Pelatih");
    System.out.println("2. Lihat Data Pemain");
    System.out.println("=================================");
    System.out.print("Masukkan Opsi Pilihan: ");
    int opsi = Integer.parseInt(buff.readLine());
    lihatData(opsi, -1);
    }
    
    @Override
    public final void lihatData(int opsi1, int opsi2) throws IOException{
        if(opsi1 == 1){
            if(pelatih.isEmpty()){
              System.out.println("=================================");
              System.out.println("Data Pelatih Kosong");
              System.out.println("=================================");
            }
            else{
                System.out.println("=================================");
                  System.out.println("Data Pelatih Basket");
                  System.out.println("=================================");
                  for(int i = 0; i < pelatih.size(); i++){
                    System.out.print(i+1 + ". ");
                    pelatih.get(i).show();
                    System.out.println("=================================");
                  }
            }      
        }
        else if(opsi1 == 2){
            if(pemain.isEmpty()){
                System.out.println("=================================");
                System.out.println("Data Pemain Kosong");
                System.out.println("=================================");
              }
              else{
                System.out.println("=================================");
                System.out.println("Data Pemain Basket");
                System.out.println("=================================");
                for(int i = 0; i < pemain.size(); i++){
                  System.out.print(i+1 + ". ");
                  pemain.get(i).show();
                  System.out.println("=================================");
                }
            }      
        }
        else{
            System.out.println("=================================");
            System.out.println("Opsi Tidak Diketahui");
            System.out.println("=================================");
        }
    }
    
    @Override
    public void tambahData(String namapelatih, int lamamelatih, String namatim, String lokasitim, int tahunbentuk) throws IOException{
        final datapelatih dpel = new datapelatih(namatim, lokasitim, tahunbentuk, namapelatih, lamamelatih);
        pelatih.add(dpel);

        System.out.println("=================================");
        System.out.println("Data Pelatih Berhasil Ditambahkan");
        System.out.println("================================="); 
    }
    
    @Override
    public void tambahData(String nama, String posisi, int nopung, int umur, String namatim, String lokasitim, int tahunbentuk) throws IOException{
        final datapemain dp = new datapemain(namatim, lokasitim, tahunbentuk, nama, umur, nopung, posisi);
        pemain.add(dp);

        System.out.println("=================================");
        System.out.println("Data Pemain Berhasil Ditambahkan");
        System.out.println("=================================");     
    }
    
    @Override
    public void tambahData() throws IOException{
        // attribut pemain
        String nama, posisi;
        int nopung, umur;
   
        // atribut pelatih
        String namapelatih;
        int lamamelatih;
       
        // atribut tim
        String namatim, lokasitim;
        int tahunbentuk;
        
        System.out.println("=================================");
        System.out.println("Tambah Data Basket");
        System.out.println("=================================");
        System.out.println("1. Tambah Data Pelatih");
        System.out.println("2. Tambah Data Pemain");
        System.out.println("=================================");
        System.out.print("Masukkan Opsi Pilihan: ");
        int opsi = Integer.parseInt(buff.readLine());
        if(opsi == 1){
            System.out.println("=================================");
            System.out.println("Opsi Tambah Data Pelatih Basket");
            System.out.println("=================================");
            System.out.print("Masukkan Nama Pelatih: ");
            namapelatih = buff.readLine();
            System.out.print("Masukkan Lama Melatih (Dalam Tahun): ");
            lamamelatih = Integer.parseInt(buff.readLine());
            System.out.print("Masukkan Nama Tim: ");
            namatim = buff.readLine();
            System.out.print("Masukkan Lokasi Tim: ");
            lokasitim = buff.readLine();
            System.out.print("Masukkan Tahun Tim Terbentuk: ");
            tahunbentuk = Integer.parseInt(buff.readLine());

            tambahData(namapelatih, lamamelatih, namatim, lokasitim, tahunbentuk);
            
        }
        else if(opsi == 2){
            System.out.print("Masukkan Nama Pemain: ");
            nama = buff.readLine();
            System.out.print("Masukkan Posisi Pemain: ");
            posisi = buff.readLine();
            System.out.print("Masukkan Nomor Punggung: ");
            nopung = Integer.parseInt(buff.readLine());
            System.out.print("Masukkan Umur Pemain: ");
            umur = Integer.parseInt(buff.readLine());
            System.out.print("Masukkan Nama Tim: ");
            namatim = buff.readLine();
            System.out.print("Masukkan Lokasi Tim: ");
            lokasitim = buff.readLine();
            System.out.print("Masukkan Tahun Tim Terbentuk: ");
            tahunbentuk = Integer.parseInt(buff.readLine());
            
            tambahData(nama, posisi, nopung, umur, namatim, lokasitim, tahunbentuk);
        }
        else{
            System.out.println("=================================");
            System.out.println("Opsi Pilihan Tidak Diketahui");
            System.out.println("=================================");
        }
    
    }
    
    @Override
    public void hapusData() throws IOException{
        System.out.println("=================================");
        System.out.println("1. Hapus Data Pelatih");
        System.out.println("2. Hapus Data Pemain");
        System.out.println("=================================");
        System.out.print("Pilih Opsi: ");
        int pilihan = Integer.parseInt(buff.readLine());
        if(pilihan == 1){
            lihatData();
            Delete del = new Delete();
            del.tanya();
            int hapus = Integer.parseInt(buff.readLine());
            pelatih.remove(hapus-1);
            
            System.out.println("=================================");
            System.out.println("Data Pelatih Berhasil Dihapus");
            System.out.println("=================================");
        }
        else if(pilihan == 2){
            lihatData();
            Delete del = new Delete();
            del.tanya();
            int hapus = Integer.parseInt(buff.readLine());
            pemain.remove(hapus-1);

            System.out.println("=================================");
            System.out.println("Data Pemain Berhasil Dihapus");
            System.out.println("=================================");
        }
        else{
            System.out.println("=================================");
            System.out.println("Pilihan Tidak Diketahui");
            System.out.println("=================================");
        }
    }
    
    @Override
    public void Exit() throws IOException{
        System.out.println("=================================");
        System.out.println("Terima Kasih Telah Menggunakan Program Kami \nMengeluarkan Program... ");
        System.out.println("=================================");
        System.exit(0);
    }
    
    @Override
    public void ubahData() throws IOException {
        System.out.println("=================================");
        System.out.println("Opsi Edit Data");
        System.out.println("=================================");
        System.out.println("1. Edit Data Pelatih");
        System.out.println("2. Edit Data Pemain");
        System.out.println("=================================");
        System.out.print("Pilih Opsi: ");
        int pilihan = Integer.parseInt(buff.readLine());
        if(pilihan == 1){
            lihatData();
        
            Edit edt = new Edit();
            edt.lama();
            int idx = Integer.parseInt(buff.readLine());
            
            System.out.println("=================================");
            System.out.print("Masukkan Nama Pelatih Baru: ");
            pelatih.get(idx-1).setNamapelatih(buff.readLine());
            System.out.print("Masukkan Lama Melatih Baru (Dalam Tahun): ");
            pelatih.get(idx-1).setLamaMelatih(Integer.parseInt(buff.readLine()));
            System.out.print("Masukkan Nama Tim Baru: ");
            pelatih.get(idx-1).setNamaTim(buff.readLine());
            System.out.print("Masukkan Lokasi Tim Baru: ");
            pelatih.get(idx-1).setLokasiTim(buff.readLine());
            System.out.print("Masukkan Tahun Tim Terbentuk Baru: ");
            pelatih.get(idx-1).setTahunBentuk(Integer.parseInt(buff.readLine()));
            System.out.println("=================================");
            
            edt.selamat();
        }
        else if(pilihan == 2){
            lihatData();
        
            Edit edt = new Edit();
            edt.lama();
            int idx = Integer.parseInt(buff.readLine());
  
            System.out.println("=================================");
            System.out.print("Masukkan Nama Baru: ");
            pemain.get(idx-1).setNama(buff.readLine());
            System.out.print("Masukkan Posisi Baru: ");
            pemain.get(idx-1).setPosisi(buff.readLine());
            System.out.print("Masukkan Nomor Punggung Baru: ");
            pemain.get(idx-1).setNoPung(Integer.parseInt(buff.readLine()));
            System.out.print("Masukkan Umur Baru: ");
            pemain.get(idx-1).setUmur(Integer.parseInt(buff.readLine()));
            System.out.print("Masukkan Nama Tim Baru: ");
            pemain.get(idx-1).setNamaTim(buff.readLine());
            System.out.print("Masukkan Lokasi Tim Baru: ");
            pemain.get(idx-1).setLokasiTim(buff.readLine());
            System.out.print("Masukkan Tahun Tim Terbentuk Baru: ");
            pemain.get(idx-1).setTahunBentuk(Integer.parseInt(buff.readLine()));
            System.out.print("=================================");

            edt.selamat();
        }
        else{
            System.out.println("=================================");
            System.out.println("Pilihan Tidak Diketahui");
            System.out.println("=================================");
        }
    }
    
    @Override
    public void mainMenu() throws IOException, InterruptedException{
        while (true){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("=================================");
            System.out.println("Program Pendataan Tim Basket");
            System.out.println("=================================");
            System.out.println("1. List Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar Admin");
            System.out.println("6. Exit Program");
            System.out.println("=================================");
            System.out.print("Masukkan Opsi Pilihan: ");
            int opsi = Integer.parseInt(buff.readLine());
            if(opsi == 1){
                lihatData();
            }
            else if(opsi == 2){
                tambahData();
            }
            else if(opsi == 3){
                ubahData();
            }
            else if(opsi== 4){
                hapusData();
            }
            else if(opsi == 5){
                System.out.println("=================================");
                System.out.println("Mengeluarkan Mode Admin...");
                System.out.println("=================================");
                return;
            }
            else if(opsi == 6){
                Exit();
            }
            else{
                System.out.println("=================================");
                System.out.println("Opsi Pilihan Tidak Diketahui");
                System.out.println("=================================");
            }
        }
    }
}

