/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediasosialevent;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author andrenugroho
 */
public class Group extends Profile implements Kategori{

    ArrayList<PublicUser> member;
    ArrayList<String> posts;
    
    public Group(String namaDepan, String namaBelakang, String idAkun, String userName, String password) {
        super(namaDepan, namaBelakang, idAkun, userName, password);
        member = new ArrayList<>();
        posts = new ArrayList<>();
        
    }

    /**
     *method AddMember untuk menambahkan member 
     * @param a
     */
    public void AddMember (PublicUser a){
        member.add(a);
    }
    
    public void Posting(String post){
        String a = getNamaDepan()+" "+getNamaBelakang()+"\n"+post;
        posts.add(a);
    }

    @Override
    public String viewAkun(String search) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     *
     */
    public void allMemberGabung(){
        
    }

    @Override
    public String kategori() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
