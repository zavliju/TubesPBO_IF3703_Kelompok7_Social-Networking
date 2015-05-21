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
public class DataBase {

    public ArrayList<PublicUser> Pusers;
    public ArrayList<Group> Gusers;
    public ArrayList<EventOrganizer> Eusers;
    public int nUser;
    boolean stat = false;

    /**
     * constructor DataBase menginstansiasi array user , array group dan array
     * EventOrganizer
     */
    public DataBase() {
        Pusers = new ArrayList<>();
        Eusers = new ArrayList<>();
        Gusers = new ArrayList<>();
        PublicUser user1 = new PublicUser("Rexy", "Saputra", "irexys@yahoo.com", "irexys", "1234");
        System.out.println("bisa");
        PublicUser user2 = new PublicUser("Rahayu", "Purnamardianti", "rpdti.com", "ayuayu", "1234");
        Pusers.add(user1);
        Pusers.add(user2);
        System.out.println("bisa add");
    }

    /**
     * method register untuk user untuk menginstansiasikan
     * namaDepan,namaBelakang,idAkun, userName dan password
     *
     * @param namaDepan
     * @param namaBelakang
     * @param idAkun
     * @param userName
     * @param password
     */
    public void Pregistrasi(String namaDepan, String namaBelakang, String idAkun, String userName, String password) {
        PublicUser user = new PublicUser(namaDepan, namaBelakang, idAkun, userName, password);
        Pusers.add(user);
    }

    /**
     * method register untuk user untuk menginstansiasikan
     * namaDepan,namaBelakang,idAkun, userName dan password
     *
     * @param namaDepan
     * @param namaBelakang
     * @param idAkun
     * @param userName
     * @param password
     */
    public void Gregistrasi(String namaDepan, String namaBelakang, String idAkun, String userName, String password) {
        Group user = new Group(namaDepan, namaBelakang, idAkun, userName, password);
        Gusers.add(user);
    }

    /**
     * method register untuk user untuk menginstansiasikan
     * namaDepan,namaBelakang,idAkun, userName dan password
     *
     * @param namaDepan
     * @param namaBelakang
     * @param idAkun
     * @param userName
     * @param password
     */
    public void Eregistrasi(String namaDepan, String namaBelakang, String idAkun, String userName, String password) {
        EventOrganizer user = new EventOrganizer(namaDepan, namaBelakang, idAkun, userName, password);
        Eusers.add(user);
    }

    /**
     * fungsi User menginstansiasi mendapatkan searchUser berdasarkan id
     *
     * @param id
     * @return
     */
    public PublicUser PsearchUserByID(String id) {
        String temp = id;
        PublicUser get = null;
        for (int i = 0; i < Pusers.size(); i++) {
            if (temp.equals(Pusers.get(i).getIdAkun())) {
                get = Pusers.get(i);
            }
        }
        return get;
    }

    /**
     * fungsi User menginstansiasi mendapatkan searchUser berdasarkan Name
     *
     * @param id
     * @return
     */
    public PublicUser PseachUserByName(String id) {
        String temp = id;
        PublicUser get = null;
        for (int i = 0; i < Pusers.size(); i++) {
            if (temp.equals(Pusers.get(i).getNamaDepan())) {
                get = Pusers.get(i);
            }
        }
        return get;
    }

    /**
     * fungsi Group menginstansiasi mendapatkan searchUser berdasarkan id
     *
     * @param id
     * @return
     */
    public Group GsearchUserByID(String id) {
        String temp = id;
        Group get = null;
        for (int i = 0; i < Gusers.size(); i++) {
            if (temp.equals(Gusers.get(i).getIdAkun())) {
                get = Gusers.get(i);
            }
        }
        return get;
    }

    /**
     * fungsi Group menginstansiasi mendapatkan searchUser berdasarkan Name
     *
     * @param id
     * @return
     */
    public Group GseachUserByName(String id) {
        String temp = id;
        Group get = null;
        for (int i = 0; i < Gusers.size(); i++) {
            if (temp.equals(Gusers.get(i).getNamaDepan())) {
                get = Gusers.get(i);
            }
        }
        return get;
    }

    /**
     * fungsi EventOrganizer menginstansiasi mendapatkan searchUser berdasarkan
     * id
     *
     * @param id
     * @return
     */
    public EventOrganizer EsearchUserByID(String id) {
        String temp = id;
        EventOrganizer get = null;
        for (int i = 0; i < Eusers.size(); i++) {
            if (temp.equals(Eusers.get(i).getIdAkun())) {
                get = Eusers.get(i);
            }
        }
        return get;
    }

    /**
     * fungsi EventOrganizer menginstansiasi mendapatkan searchUser berdasarkan
     * Name
     *
     * @param id
     * @return
     */
    public EventOrganizer EseachUserByName(String id) {
        String temp = id;
        EventOrganizer get = null;
        for (int i = 0; i < Eusers.size(); i++) {
            if (temp.equals(Eusers.get(i).getNamaDepan())) {
                get = Eusers.get(i);
            }
        }
        return get;
    }

    public PublicUser PLogin(String userName, String password) {
        PublicUser get = null;
        for (int i = 0; i < Pusers.size(); i++) {
            if (userName.equals(Pusers.get(i).getUserName()) && password.equals(Pusers.get(i).getPassword())) {
                get = Pusers.get(i);
                stat = true;
            }
        }

        return get;
    }

    public boolean PStat(String userName, String password) {
        for (int i = 0; i < Pusers.size(); i++) {
            System.out.println("bisa");
            if (userName.contentEquals(userName) && password.contentEquals(password)) {
                System.out.println("bisa;login");
                stat = true;
            }
        }
        return stat;
    }

    public Group GLogin(String userName, String password) {
        Group get = null;
        for (int i = 0; i < Gusers.size(); i++) {
            if (userName.equals(Gusers.get(i).getUserName()) && password.equals(Gusers.get(i).getPassword())) {
                get = Gusers.get(i);
            }
        }

        return get;
    }

    public EventOrganizer ELogin(String userName, String password) {
        EventOrganizer get = null;
        for (int i = 0; i < Eusers.size(); i++) {
            if (userName.equals(Eusers.get(i).getUserName()) && password.equals(Eusers.get(i).getPassword())) {
                get = Eusers.get(i);
                stat = true;
            }
        }

        return get;
    }

}
