/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediasosialevent;

/**
 *
 * @author DMC
 */
public class Pesan {

    public String penerima;
    public String isiPesan;
    public String pesan[];
    public Akun a;

    public Pesan(String isiPesan) {
        this.isiPesan = isiPesan;
    }
    
    

    public void setPenerima(String penerima) {
        this.penerima = penerima;
        /**try(Exception e){
            System.out.println("");
        }**/
    }

    public void setIsiPesan(String isiPesan) {
        this.isiPesan = isiPesan;
    }

    public String getPenerima() {
        return penerima;
    }

    public String getIsiPesan() {
        return isiPesan;
    }

    public int kirimPesan(String id) {
        pesan = new String[20];
        int nPesan = 0;
        String temp = a.getIdAkun();
        boolean status = false;
        int i = 0;
        if (id.length() == temp.length()) {
            do {
                if (id.charAt(i) == temp.charAt(i)) {
                    status = true;
                    i++;
                } else {
                    status = false;
                }
            } while (status == false);
        } else {
            status = false;
        }
        if (status == true) {
            pesan[nPesan] = getIsiPesan();
            nPesan++;
        } else {
            throw new IllegalStateException("Akun yang anda cari tidak ditemukan");
        }
        return nPesan;
    }


    public String hapusPesan(String id) {
        String isi = "";
        String temp = a.getIdAkun();
        boolean status = false;
        int i = 0;
        if (id.length() == temp.length()) {
            do {
                if (id.charAt(i) == temp.charAt(i)) {
                    status = true;
                    i++;
                } else {
                    status = false;
                }
            } while (status == false);
        } else {
            status = false;
        }
        if (status == true) {
            for (int j = 0; j < kirimPesan(id); j++) {
                isi = isi + pesan[j];
            }
        }
        return isi;
        }
    
    
    }


