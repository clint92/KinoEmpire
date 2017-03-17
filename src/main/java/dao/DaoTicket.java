package dao;

import utility.SQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Dave on 17/03/2017.
 */
public class DaoTicket {

    private Connection conn;

    public DaoTicket() {
        conn = SQLConnection.getConnection();
    }



   // removeTicket

   // reserveTicket

    public void createTicket() {

        try {
            PreparedStatement prepStat = conn.prepareStatement("INSERT INTO ticket(price, sold, reserved) VALUES (?,?,?) ");

        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


}
