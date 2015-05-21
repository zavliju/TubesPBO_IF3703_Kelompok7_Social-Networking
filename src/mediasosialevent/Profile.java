/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediasosialevent;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DMC
 */
public abstract class Profile extends Akun {

    public String namaDepan;
    public String namaBelakang;
    public String update;
    public Akun a;
    public ArrayList status;
    public int nStatus = 0;
    public Scanner sSt = new Scanner(System.in);
    public Scanner sInt = new Scanner(System.in);
    public String userPicture;
    public int following;
    public int follower;
    

    public Profile(String namaDepan, String namaBelakang, String idAkun, String userName, String password) {
        super(idAkun, userName, password);
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        following = 0;
        follower = 0 ;
    }

    public void setFollowing() {
        this.following = following + 1;
    }

    public void setFollower() {
        this.follower = follower + 1;
    }

    public int getFollowing() {
        return following;
    }

    public int getFollower() {
        return follower;
    }
    
    
      
    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public String getUpdate() {
        return update;
    }

    public void editProfile(String un, String pass) {
        String tempUN = a.getUserName();
        String tempPass = a.getPassword();
        boolean status = false;
        if ((tempUN == un) && (tempPass == pass)) {
            status = true;
        } else {
            status = false;
        }

        if (status == true) {
            int pil = 0;
            do {
                System.out.println("Menu Edit Profile :");
                System.out.println("1. Ubah Nama Depan");
                System.out.println("2. Ubah Nama Belakang");
                System.out.println("0. Exit");
                System.out.println("Pilihan : ");
                pil = sInt.nextInt();
            } while (pil == 0);
            switch (pil) {
                case 1:
                    System.out.println("Nama Sebelumnya : " + getNamaDepan());
                    System.out.print("Nama Baru : ");
                    if ((sSt.nextLine() != null)){
                        setNamaDepan(sSt.nextLine());
                    } else {
                        System.out.println("Dilarang Mengosongkan Nama");
                    }
                    break;
                case 2:
                    System.out.println("Nama Sebeumnya : " + getNamaBelakang());
                    System.out.print("Nama Baru : ");
                    if ((sSt.nextLine() != "") || (sSt.nextLine() != " ")) {
                        setNamaBelakang(sSt.nextLine());
                    } else {
                        System.out.println("Dilarang Mengosongkan Nama");
                    }
                    break;
                default:
                    System.out.println("Anda Salah memasukkan Pilihan, Coba lagi");
            }
        } else {
            System.out.println("Username dan Password tidak sesuai!!");
        }
    }

    public void updateStatus() {
        status.set(nStatus, getUpdate());
        nStatus++;
    }
    
    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }
}
