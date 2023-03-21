package pt3;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static ArrayList<TimBasket> tim = new ArrayList<>();
    static ArrayList<datapemain> pemain = new ArrayList<>();
    static ArrayList<datapelatih> pelatih = new ArrayList<>();
    
    static InputStreamReader inputsr = new InputStreamReader(System.in);
    static BufferedReader buff = new BufferedReader(inputsr);
    
    public static void main(String[]args) throws IOException, InterruptedException{
        while (true){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("=================================");
            System.out.println("Program Pendataan Tim Basket");
            System.out.println("=================================");
            System.out.println("1. List Tim");
            System.out.println("2. Tambah Data Tim");
            System.out.println("3. Edit Data Tim");
            System.out.println("4. Hapus Data Tim");
            System.out.println("5. Exit Program");
            System.out.println("=================================");
            System.out.print("Masukkan Opsi Pilihan: ");
            int opsi = Integer.parseInt(buff.readLine());
            if(opsi == 1){
                read();
            }
            else if(opsi == 2){
                add();
            }
            else if(opsi == 3){
                edit();
            }
            else if(opsi== 4){
                delete();
            }
            else if(opsi == 5){
                exit();
            }
            else{
                System.out.println("=================================");
                System.out.println("Opsi Pilihan Tidak Diketahui");
                System.out.println("=================================");
            }
        }
    }

    public static void read() throws IOException{
        System.out.println("=================================");
        System.out.println("1. Data Tim");
        System.out.println("2. Data Pelatih");
        System.out.println("3. Data Pemain");
        System.out.println("=================================");
        System.out.print("Masukkan Opsi Pilihan: ");
        int opsi = Integer.parseInt(buff.readLine());
        if (opsi == 1){
            if(tim.isEmpty()){
              System.out.println("=================================");
              System.out.println("Data Tim Kosong");
              System.out.println("=================================");
              }
              else{
                System.out.println("=================================");
                System.out.println("Data Tim Basket");
                System.out.println("=================================");
                for(int i = 0; i < tim.size(); i++){
                    System.out.println(i+1 + "." + "Nama Tim = " + tim.get(i).getNamatim());
                    System.out.println("Lokasi Tim = " + tim.get(i).getLokasiTim());
                    System.out.println("Tahun Tim Terbentuk = " + tim.get(i).getTahunBentuk());
                }
            }
        }
        
        else if(opsi == 2){
            if(pelatih.isEmpty()){
              System.out.println("=================================");
              System.out.println("Data Pelatih Kosong");
              System.out.println("=================================");
              }
              else{
                System.out.println("=================================");
                  System.out.println("Data Pelatih Basket");
                  System.out.println("=================================");
                  for(int i = 0; i < pemain.size(); i++){
                    System.out.println(i+1 + "." + "Nama Pelatih = " + pelatih.get(i).getNamapelatih());
                    System.out.println("Lama Melatih = " + pelatih.get(i).getLamaMelatih() + " Tahun");
                    System.out.println("Nama Tim = " + tim.get(i).getNamatim());
                    System.out.println("Lokasi Tim = " + tim.get(i).getLokasiTim());
                    System.out.println("Tahun Tim Terbentuk = " + tim.get(i).getTahunBentuk());
                }
           }      
        }
            else if(opsi == 3){
            if(pelatih.isEmpty()){
              System.out.println("=================================");
              System.out.println("Data Pemain Kosong");
              System.out.println("=================================");
              }
              else{
                System.out.println("=================================");
                  System.out.println("Data Pemain Basket");
                  System.out.println("=================================");
                  for(int i = 0; i < pemain.size(); i++){
                        System.out.println(i+1 + "." + "Nama Pemain = " + pemain.get(i).getNama());
                        System.out.println("Posisi Pemain = " + pemain.get(i).getPosisi());
                        System.out.println("Nomor Punggung = " + pemain.get(i).getNoPung());
                        System.out.println("Umur Pemain = " + pemain.get(i).getUmur());
                        System.out.println("Nama Tim = " + tim.get(i).getNamatim());
                        System.out.println("Lokasi Tim = " + tim.get(i).getLokasiTim());
                        System.out.println("Tahun Tim Terbentuk = " + tim.get(i).getTahunBentuk());
                        System.out.println("=================================");
                  }
                }
           }      
        }
    
//        System.out.println("=================================");
//        System.out.println("Data Tim Basket");
//
//        if(tim.isEmpty()){
//            System.out.println("=================================");
//            System.out.println("Data Tim Kosong");
//            System.out.println("=================================");
//        }
//        else if(pemain.isEmpty()){
//            System.out.println("=================================");
//            System.out.println("Data Pemain Kosong");
//            System.out.println("=================================");
//        }
//        else if(pelatih.isEmpty()){
//            System.out.println("=================================");
//            System.out.println("Data Pelatih Kosong");
//            System.out.println("=================================");
//        }
//        else {
//            System.out.println("=================================");
//            System.out.println("Data Tim Basket");
//            for(int i = 0; i < tim.size(); i++){
//                System.out.println(i+1 + "." + "Nama Tim = " + tim.get(i).getNamatim());
//                System.out.println("Lokasi Tim = " + tim.get(i).getLokasiTim());
//                System.out.println("Tahun Tim Terbentuk = " + tim.get(i).getTahunBentuk());
//            }
//            System.out.println("=================================");
//            System.out.println("Data Pelatih");
//            for(int i = 0; i < pemain.size(); i++){
//                System.out.println("Nama Pelatih = " + pelatih.get(i).getNamapelatih());
//                System.out.println("Lama Melatih = " + pelatih.get(i).getLamaMelatih());
//            }
//            System.out.println("=================================");
//            System.out.println("Data Pemain");
//            for(int i = 0; i < pemain.size(); i++){
//                System.out.println("Nama Pemain = " + pemain.get(i).getNama());
//                System.out.println("Posisi Pemain = " + pemain.get(i).getPosisi());
//                System.out.println("Nomor Punggung = " + pemain.get(i).getNoPung());
//                System.out.println("Umur Pemain = " + pemain.get(i).getUmur());
//                System.out.println("=================================");
//            }
//        }
//    }

    public static void add() throws IOException{
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
        System.out.println("Tambah Data Tim Basket");
        System.out.println("=================================");
        System.out.println("1. Tambah Data Tim");
        System.out.println("2. Tambah Data Pelatih");
        System.out.println("3. Tambah Data Pemain");
        System.out.println("=================================");
        System.out.print("Masukkan Opsi Pilihan: ");
        int opsi = Integer.parseInt(buff.readLine());
        if(opsi == 1){
            System.out.println("=================================");
            System.out.println("Opsi Tambah Data Tim Basket");
            System.out.println("=================================");
            System.out.print("Masukkan Nama Tim: ");
            namatim = buff.readLine();
            System.out.print("Masukkan Lokasi Tim: ");
            lokasitim = buff.readLine();
            System.out.print("Masukkan Tahun Tim Terbentuk: ");
            tahunbentuk = Integer.parseInt(buff.readLine());
            
            TimBasket tb = new TimBasket(namatim, lokasitim, tahunbentuk);
            tim.add(tb);
            
            System.out.println("=================================");
            System.out.println("Data Tim Berhasil Ditambahkan");
            System.out.println("================================="); 
        }
        else if(opsi == 2){
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
            
            datapelatih dpel = new datapelatih(namatim, lokasitim, tahunbentuk, namapelatih, lamamelatih);
            pelatih.add(dpel);
            
            System.out.println("=================================");
            System.out.println("Data Pelatih Berhasil Ditambahkan");
            System.out.println("================================="); 
        }
        else if(opsi == 3){
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

            datapemain dp = new datapemain(namatim, lokasitim, tahunbentuk, nama, umur, nopung, posisi);
            pemain.add(dp);

            System.out.println("=================================");
            System.out.println("Data Pemain Berhasil Ditambahkan");
            System.out.println("=================================");     
        }
        else{
            System.out.println("=================================");
            System.out.println("Opsi Pilihan Tidak Diketahui");
            System.out.println("=================================");
        }
    
    }

    public static void delete() throws IOException{
        System.out.println("=================================");
        System.out.println("1. Hapus Data Tim");
        System.out.println("2. Hapus Data Pelatih");
        System.out.println("3. Hapus Data Pemain");
        System.out.println("=================================");
        System.out.print("Pilih Opsi: ");
        int pilihan = Integer.parseInt(buff.readLine());
        if(pilihan == 1){
            read();
            Delete del = new Delete();
            del.tanya();
            int hapus = Integer.parseInt(buff.readLine());
            tim.remove(hapus-1);
            
            System.out.println("=================================");
            System.out.println("Data Tim Berhasil Dihapus");
            System.out.println("=================================");
        }
        else if(pilihan == 2){
            read();
            Delete del = new Delete();
            del.tanya();
            int hapus = Integer.parseInt(buff.readLine());
            pelatih.remove(hapus-1);
            
            System.out.println("=================================");
            System.out.println("Data Pelatih Berhasil Dihapus");
            System.out.println("=================================");
        }
        else if(pilihan == 3){
            read();
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

    public static void edit() throws IOException {
        System.out.println("=================================");
        System.out.println("Opsi Edit Data");
        System.out.println("=================================");
        System.out.println("1. Edit Data Tim");
        System.out.println("2. Edit Data Pelatih");
        System.out.println("3. Edit Data Pemain");
        System.out.println("=================================");
        System.out.print("Pilih Opsi: 2");
        int pilihan = Integer.parseInt(buff.readLine());
        if (pilihan == 1){
            read();
        
            Edit edt = new Edit();
            edt.lama();
            int idx = Integer.parseInt(buff.readLine());
            
            System.out.println("=================================");
            System.out.print("Masukkan Nama Tim Baru: ");
            tim.get(idx-1).setNamatim(buff.readLine());
            System.out.print("Masukkan Lokasi Baru: ");
            tim.get(idx-1).setLokasiTim(buff.readLine());
            System.out.print("Masukkan Tahun Bentuk Baru: ");
            tim.get(idx-1).setTahunBentuk(Integer.parseInt(buff.readLine()));
            
            edt.selamat();
        }
        else if(pilihan == 2){
            read();
        
            Edit edt = new Edit();
            edt.lama();
            int idx = Integer.parseInt(buff.readLine());
            
            System.out.println("=================================");
            System.out.print("Masukkan Nama Pelatih Baru: ");
            pelatih.get(idx-1).setNamapelatih(buff.readLine());
            System.out.print("Masukkan Lokasi Baru: ");
            pelatih.get(idx-1).setLamaMelatih(Integer.parseInt(buff.readLine()));
            
            edt.selamat();
        }
        else if(pilihan == 3){
            read();
        
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
            System.out.println("=================================");

            edt.selamat();
        }
        else{
            System.out.println("=================================");
            System.out.println("Pilihan Tidak Diketahui");
            System.out.println("=================================");
        }
    }
    
    public static void exit() throws IOException{
        System.out.println("=================================");
        System.out.println("Terima Kasih Telah Menggunakan Program Kami \nMengeluarkan Program... ");
        System.out.println("=================================");
        System.exit(0);
    }
}
