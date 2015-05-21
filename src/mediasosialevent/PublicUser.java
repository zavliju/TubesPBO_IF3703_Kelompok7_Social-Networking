/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediasosialevent;

import java.util.ArrayList;

/**
 *
 * @author andrenugroho
 */
public class PublicUser extends Profile implements Kategori {

    public String jenisKelamin;
    public String hobi;
    public int nTeman = 0;
    public ArrayList<Profile> teman;
    public DataBase db;
    public Group g;
    public EventOrganizer e;

    public PublicUser(String namaDepan, String namaBelakang, String idAkun, String userName, String password) {
        super(namaDepan, namaBelakang, idAkun, userName, password);
        teman = new ArrayList<>();
    }

    @Override
    public String viewAkun(String search) {
        String a = "Nama : " + super.getNamaDepan() + " " + super.getNamaBelakang()+"\n"+kategori();
        return a;
    }

    public int wantIt(String id) {
        return 0;
    }

    public void AddFriend(String id) {
        db.Pusers.add(db.PsearchUserByID(id));
        setFollowing();
        (db.PsearchUserByID(id)).setFollower();
    }

    public void joinGroub(String id) {
        g = (db.GsearchUserByID(id));
        g.AddMember(db.PsearchUserByID(this.idAkun));
    }

    public void followEO(String id) {
        e = (db.EsearchUserByID(idAkun));
        e.FolEvent();

    }

    @Override
    public String kategori() {
        String a = "Kategori : Public User";
        return a;
    }

}
