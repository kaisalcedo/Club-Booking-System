/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Club;
/**
 *
 * @author User
 */
public class ClubController {
    
    public void addClub(Club cl) {
        try {
            Connection c = DatabaseConnection.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO club (club_date, club_name, club_mem_fee) VALUES (?,?,?)");
            ps.setString(1, cl.getClub_date());
            ps.setString(2, cl.getClub_name());
            ps.setString(3, cl.getClub_mem_fee());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully saved!");
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Club> getClubList() {
        ArrayList<Club> clubList = new ArrayList<>();

        Connection c = DatabaseConnection.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("SELECT * FROM club");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Club cl = new Club();
                cl.setClub_id(rs.getInt("id_club"));
                cl.setClub_date(rs.getString("club_date"));
                cl.setClub_name(rs.getString("club_name"));
                cl.setClub_mem_fee(rs.getString("club_mem_fee"));
                clubList.add(cl);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Club.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clubList;
    }
    
}
