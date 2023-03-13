package pt2;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Posttest2 {
    static ArrayList<datapemain> pemain = new ArrayList<>();
    static InputStreamReader inputsr = new InputStreamReader(System.in);
    static BufferedReader buff = new BufferedReader(inputsr);
    
    public static void main(String[]args) throws IOException, InterruptedException{
        while (true){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("=================================");
            System.out.println("Program Pendataan Pemain Basket");
            System.out.println("=================================");
            System.out.println("1. List Pemain");
            System.out.println("2. Tambah Pemain");
            System.out.println("3. Edit Pemain");
            System.out.println("4. Hapus Pemain");
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
        System.out.println("Data Pemain Basket");

        if(pemain.isEmpty()){
            System.out.println("=================================");
            System.out.println("Data Pemain Kosong");
            System.out.println("=================================");
        }
        else{
            System.out.println("=================================");
            for(int i = 0; i < pemain.size(); i++){
                System.out.println(i+1 + "." + "Nama Pemain = " + pemain.get(i).getNama());
                System.out.println("Nama Tim = " + pemain.get(i).getTim());
                System.out.println("Nomor Punggung = " + pemain.get(i).getNopung());
                System.out.println("Umur Pemain = " + pemain.get(i).getUmur());
                System.out.println("=================================");
            }
        }
    }

    public static void add() throws IOException{
        String nama, tim;
        int nopung, umur;
        
        System.out.println("=================================");
        System.out.println("Opsi Tambah Data Pemain");
        System.out.println("=================================");
        System.out.print("Masukkan Nama Pemain: ");
        nama = buff.readLine();
        System.out.print("Masukkan Nama Tim: ");
        tim = buff.readLine();
        System.out.print("Masukkan Nomor Punggung: ");
        nopung = Integer.parseInt(buff.readLine());
        System.out.print("Masukkan Umur Pemain: ");
        umur = Integer.parseInt(buff.readLine());

        datapemain dp = new datapemain(nama, tim, nopung, umur);
        pemain.add(dp);

        System.out.println("=================================");
        System.out.println("Data Pemain Berhasil Ditambahkan");
        System.out.println("=================================");
    }

    public static void delete() throws IOException{
        read();
        Delete del = new Delete();
        del.tanya();
        int hapus = Integer.parseInt(buff.readLine());
        pemain.remove(hapus-1);

        System.out.println("=================================");
        System.out.println("Data Pemain Berhasil Dihapus");
        System.out.println("=================================");
    }

    public static void edit() throws IOException {

        System.out.println("============================");
        System.out.println("Opsi Edit Data Pemain");
        System.out.println("============================");
        read();
        
        Edit edt = new Edit();
        edt.lama();
        int idx = Integer.parseInt(buff.readLine());
        
        System.out.println("=================================");
        System.out.print("Masukkan Nama Baru: ");
        pemain.get(idx-1).setNama(buff.readLine());
        System.out.print("Masukkan Tim Baru: ");
        pemain.get(idx-1).setTim(buff.readLine());
        System.out.print("Masukkan Nomor Punggung Baru: ");
        pemain.get(idx-1).setNopung(Integer.parseInt(buff.readLine()));
        System.out.print("Masukkan Umur Baru: ");
        pemain.get(idx-1).setUmur(Integer.parseInt(buff.readLine()));
        System.out.println("=================================");
        
        edt.selamat();
        }
    
    public static void exit() throws IOException{
        System.out.println("=================================");
        System.out.println("Terima Kasih Telah Menggunakan Kami \nMengeluarkan Program... ");
        System.out.println("=================================");
        System.exit(0);
    }

}