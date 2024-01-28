/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC-01
 */
public class DatabaseConnection {
    
    private static Connection c;

    public static Connection getConnection() {
        if (c == null) {
            try {
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmbs", "root", "root");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return c;

    }
    
}
