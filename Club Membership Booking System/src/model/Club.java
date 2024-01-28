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
public class Club {

    private int club_id;
    private String club_date;
    private String club_name;
    private String club_mem_fee;

    /**
     * @return the club_id
     */
    public int getClub_id() {
        return club_id;
    }

    /**
     * @param club_id the club_id to set
     */
    public void setClub_id(int club_id) {
        this.club_id = club_id;
    }

    /**
     * @return the club_date
     */
    public String getClub_date() {
        return club_date;
    }

    /**
     * @param club_date the club_date to set
     */
    public void setClub_date(String club_date) {
        this.club_date = club_date;
    }

    /**
     * @return the club_name
     */
    public String getClub_name() {
        return club_name;
    }

    /**
     * @param club_name the club_name to set
     */
    public void setClub_name(String club_name) {
        this.club_name = club_name;
    }

    /**
     * @return the club_mem_fee
     */
    public String getClub_mem_fee() {
        return club_mem_fee;
    }

    /**
     * @param club_mem_fee the club_mem_fee to set
     */
    public void setClub_mem_fee(String club_mem_fee) {
        this.club_mem_fee = club_mem_fee;
    }

}
