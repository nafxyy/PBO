package pt6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static InputStreamReader inputsr = new InputStreamReader(System.in);
    static BufferedReader buff = new BufferedReader(inputsr);
    static Admin admin = new Admin("admin", "123");
    static ArrayList<datapemain> pemain =  Admin.listPemain();
    static ArrayList<datapelatih> pelatih = Admin.listPelatih();
    
    public static final void lihatData() throws IOException{
        System.out.println("=================================");
        System.out.println("1. Lihat Data Pelatih");
        System.out.println("2. Lihat Data Pemain");
        System.out.println("=================================");
        System.out.print("Masukkan Opsi Pilihan: ");
        int opsi = Integer.parseInt(buff.readLine());
        lihatData(opsi, -1);
    }
    
    public static final void lihatData(int opsi1, int opsi2) throws IOException{
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
    
    public static void main(String[]args) throws IOException, InterruptedException{
        int attemptLogin = 1;
        while(true){
            System.out.println("=================================");
            System.out.println("Program Pendataan Tim Basket");
            System.out.println("=================================");
            System.out.println("1. Login Admin");
            System.out.println("2. Staff Menu");
            System.out.println("3. Exit");
            System.out.println("=================================");
            System.out.print("Masukan pilihan: ");
            int pilihan = Integer.parseInt(buff.readLine());
            if (pilihan == 1) {
                System.out.println("=================================");
                System.out.print("Masukan Username: ");
                String username = buff.readLine();
                System.out.print("Masukan Password: ");
                String password = buff.readLine();
                if(username.equals(admin.getUsername()) && password.equals(admin.getPassword())){
                    System.out.println("=================================");
                    System.out.println("Selamat datang " + admin.getUsername());
                    admin.mainMenu();
                }
                else{
                    System.out.println("Username atau Password Salah!");
                    if (attemptLogin == 3) {
                        System.out.println("=================================");
                        System.out.println("Batas Login hanya 3x!");
                        System.out.println("=================================");
                        break;
                    }
                    attemptLogin++;
                }
            } else if (pilihan == 2){
                System.out.println("=================================");
                System.out.println("Staff Menu");
                lihatData();
                
            } else if (pilihan == 3){
                admin.Exit();
            } else {
                System.out.println("=================================");
                System.out.println("Pilihan Tidak Tersedia");
                System.out.println("=================================");
            }
        }
    }
}
