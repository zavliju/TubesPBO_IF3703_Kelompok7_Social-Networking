/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediasosialevent;

/**
 *
 * @author andrenugroho
 */
public class EventOrganizer extends Profile implements Kategori{

    public  String Alamat;

    public EventOrganizer(String namaDepan, String namaBelakang, String idAkun, String userName, String password) {
        super(namaDepan, namaBelakang, idAkun, userName, password);
        
    }
    
/**
 * method yang digunakan untuk mem-view akun
 * @param search
 * @return 
 */
    @Override
    public String viewAkun(String search) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
/**
 * method untuk mengeset alamat dari EO
 * @param Alamat 
 */
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
/**
 * method untuk memreturn alamat dari EO
 * @return 
 */
    public String getAlamat() {
        return Alamat;
    }
    
    /**
     *method untuk mengeset follow pada event 
     */
    public void FolEvent (){
        super.setFollower();
    }

    /**
     
     * @return
     */
    @Override
    public String kategori() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
