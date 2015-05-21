/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediasosialevent;

import java.util.ArrayList;

/**
 *
 * @author DMC
 */
public abstract class Akun {

    public String idAkun;
    public String userName;
    public String password;
    
    /**
     *constructor akun menginstansiasi idAkun, userName,password dan menginstatnsiasi ArrayList pesan setiap pembuatan akun
     * @param idAkun
     * @param userName
     * @param password
     * 
     */
    public Akun(String idAkun, String userName, String password) {
        this.idAkun = idAkun;
        this.userName = userName;
        this.password = password;
    }

    /**
     * ini merupakan method abstract untuk membuat sebuah fungsi melihat akunnya
     * @param search
     * @return
     */
    public abstract String viewAkun(String search);

    /**
     * method setIdAkun akan menginstansiasi idAkun
     * @param idAkun
     */
    public void setIdAkun(String idAkun) {
        this.idAkun = idAkun;
    }

    /**
     *method setUserName akan menginstansiasikan userName
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * method setPassword untuk menginstansiasikan password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *method untuk mengembalikan idAkun 
     * @return
     */
    public String getIdAkun() {
        return idAkun;
    }

    /**
     *method getUserName untuk mengembalikan UseraName
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     *method ini akan mengembalikan password
     * @return
     */
    public String getPassword() {
        return password;
    }

}
