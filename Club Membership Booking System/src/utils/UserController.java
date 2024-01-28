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
import model.User;

/**
 *
 * @author PC-01
 */
public class UserController {

    public void addUser(User u) {
        try {
            Connection c = DatabaseConnection.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO user (user_fname, user_mname, user_lname, user_contact, user_username, user_password) VALUES (?,?,?,?,?,?)");
            ps.setString(1, u.getUser_fname());
            ps.setString(2, u.getUser_mname());
            ps.setString(3, u.getUser_lname());
            ps.setString(4, u.getUser_contact());
            ps.setString(5, u.getUser_username());
            ps.setString(6, u.getUser_password());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully saved!");
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editUser(User u) {
        //always use PK
        try {
            Connection c = DatabaseConnection.getConnection();
            PreparedStatement ps = c.prepareStatement("UPDATE user SET user_fname = ?, user_mname = ?, user_lname = ?, user_contact =?, user_username = ?, user_password = ? WHERE user_id = ?");
            ps.setString(1, u.getUser_fname());
            ps.setString(2, u.getUser_mname());
            ps.setString(3, u.getUser_lname());
            ps.setString(4, u.getUser_contact());
            ps.setString(5, u.getUser_username());
            ps.setString(6, u.getUser_password());
            ps.setInt(7, u.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully updated!");

        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removeClientsProfile(User u) {

        try {
            Connection c = DatabaseConnection.getConnection();
            PreparedStatement ps = c.prepareStatement("DELETE FROM user WHERE user_id = ?");
            ps.setInt(1, u.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<User> getUserList(String n) {
        ArrayList<User> userList = new ArrayList<>();

        Connection c = DatabaseConnection.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("SELECT * FROM user WHERE (user_fname LIKE ?) OR (user_mname LIKE ?) OR (user_lname LIKE ?) OR (user_contact LIKE ?) OR (user_username LIKE ?) OR (user_password LIKE ?)");
            ps.setString(1, n + "%");
            ps.setString(2, n + "%");
            ps.setString(3, n + "%");
            ps.setString(4, n + "%");
            ps.setString(5, n + "%");
            ps.setString(6, n + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("user_id"));
                u.setUser_fname(rs.getString("user_fname"));
                u.setUser_mname(rs.getString("user_mname"));
                u.setUser_lname(rs.getString("user_lname"));
                u.setUser_contact(rs.getString("user_contact"));
                u.setUser_username(rs.getString("user_username"));
                u.setUser_password(rs.getString("user_password"));
                userList.add(u);
            }

        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return userList;

    }

    public ArrayList<User> getUserList() {
        ArrayList<User> userList = new ArrayList<>();

        Connection c = DatabaseConnection.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("SELECT * FROM user");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("user_id"));
                u.setUser_fname(rs.getString("user_fname"));
                u.setUser_mname(rs.getString("user_mname"));
                u.setUser_lname(rs.getString("user_lname"));
                u.setUser_contact(rs.getString("user_contact"));
                u.setUser_username(rs.getString("user_username"));
                u.setUser_password(rs.getString("user_password"));
                userList.add(u);
            }

        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return userList;
    }

    public boolean checkUser(String u, String p) {
        Connection c = DatabaseConnection.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("SELECT * from user WHERE user_username = ? and `user_password`= (?)");

            ps.setString(1, u);
            ps.setString(2, p);
            ResultSet rs = ps.executeQuery();
            rs.beforeFirst();
            if (rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
