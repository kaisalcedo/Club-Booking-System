/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PC-01
 */
public class User {

    private int id;
    private String user_fname;
    private String user_mname;
    private String user_lname;
    private String user_contact;
    private String user_username;
    private String user_password;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the user_fname
     */
    public String getUser_fname() {
        return user_fname;
    }

    /**
     * @param user_fname the user_fname to set
     */
    public void setUser_fname(String user_fname) {
        this.user_fname = user_fname;
    }

    /**
     * @return the user_mname
     */
    public String getUser_mname() {
        return user_mname;
    }

    /**
     * @param user_mname the user_mname to set
     */
    public void setUser_mname(String user_mname) {
        this.user_mname = user_mname;
    }

    /**
     * @return the user_lname
     */
    public String getUser_lname() {
        return user_lname;
    }

    /**
     * @param user_lname the user_lname to set
     */
    public void setUser_lname(String user_lname) {
        this.user_lname = user_lname;
    }

    /**
     * @return the user_contact
     */
    public String getUser_contact() {
        return user_contact;
    }

    /**
     * @param user_contact the user_contact to set
     */
    public void setUser_contact(String user_contact) {
        this.user_contact = user_contact;
    }

    /**
     * @return the user_username
     */
    public String getUser_username() {
        return user_username;
    }

    /**
     * @param user_username the user_username to set
     */
    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    /**
     * @return the user_password
     */
    public String getUser_password() {
        return user_password;
    }

    /**
     * @param user_password the user_password to set
     */
    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

}
