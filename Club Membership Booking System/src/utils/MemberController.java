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
import model.Member;

/**
 *
 * @author User
 */
public class MemberController {

    public void addMember(Member m) {
        try {
            Connection c = DatabaseConnection.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO member (member_name, member_date, member_level, member_registration, member_monthly, member_annual, member_reason) VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, m.getMem_name());
            ps.setString(2, m.getMem_date());
            ps.setString(3, m.getMem_level());
            ps.setString(4, m.getMem_reg());
            ps.setString(5, m.getMem_month());
            ps.setString(6, m.getMem_annual());
            ps.setString(7, m.getMem_reason());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully saved!");
        } catch (SQLException ex) {
            Logger.getLogger(MemberController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removeMemberProfile(Member m) {

        try {
            Connection c = DatabaseConnection.getConnection();
            PreparedStatement ps = c.prepareStatement("DELETE FROM member WHERE id_member = ?");
            ps.setInt(1, m.getMem_id());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MemberController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Member> getMemberList(String n) {
        ArrayList<Member> memberList = new ArrayList<>();

        Connection c = DatabaseConnection.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("SELECT * FROM member WHERE (member_name LIKE ?)");
            ps.setString(1, n + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Member m = new Member();
                m.setMem_id(rs.getInt("id_member"));
                m.setMem_name(rs.getString("member_name"));
                m.setMem_date(rs.getString("member_date"));
                m.setMem_level(rs.getString("member_level"));
                m.setMem_reg(rs.getString("member_registration"));
                m.setMem_month(rs.getString("member_monthly"));
                m.setMem_annual(rs.getString("member_annual"));
                m.setMem_reason(rs.getString("member_reason"));
                memberList.add(m);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

        return memberList;

    }

    public ArrayList<Member> getMemberList() {
        ArrayList<Member> memberList = new ArrayList<>();

        Connection c = DatabaseConnection.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("SELECT * FROM member");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Member m = new Member();
                m.setMem_id(rs.getInt("id_member"));
                m.setMem_name(rs.getString("member_name"));
                m.setMem_date(rs.getString("member_date"));
                m.setMem_level(rs.getString("member_level"));
                m.setMem_reg(rs.getString("member_registration"));
                m.setMem_month(rs.getString("member_monthly"));
                m.setMem_annual(rs.getString("member_annual"));
                m.setMem_reason(rs.getString("member_reason"));
                memberList.add(m);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

        return memberList;
    }

}
