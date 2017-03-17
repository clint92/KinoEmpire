package dao;

import utility.SQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Ticket;

/**
 * Created by Dave on 17/03/2017.
 */
public class DaoTicket {

    private Connection conn;

    public DaoTicket() {
        conn = SQLConnection.getConnection();
    }

    /** creating Ticket object in Database, with String as parameter to check if sold or reserved */
    public void createTicket(Ticket ticket, String sale) {

        try {
            PreparedStatement prepStat = conn.prepareStatement("INSERT INTO ticket(price, sold, reserved) VALUES (?,?,?)");

            if (sale.equalsIgnoreCase("sold")) {
                prepStat.setDouble(1, ticket.getPrice());
                prepStat.setInt(1, 1);
                prepStat.setInt(1, ticket.getReserved());
            }
            else if (sale.equalsIgnoreCase("reserved")) {
                prepStat.setDouble(1, ticket.getPrice());
                prepStat.setInt(1, ticket.getSold());
                prepStat.setInt(1, 1);
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    /** create Ticket object with sold field set to 1 */
    public void createSoldTicket(Ticket ticket) {

        try {
            PreparedStatement prepStat = conn.prepareStatement("INSERT INTO ticket(price, sold, reserved) VALUES (?,?,?)");

            prepStat.setDouble(1, ticket.getPrice());
            prepStat.setInt(1, 1);
            prepStat.setInt(1, ticket.getReserved());
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /** create Ticket object with reserved field set to 1 */
    public void createReservedTicket(Ticket ticket) {

        try {
            PreparedStatement prepStat = conn.prepareStatement("INSERT INTO ticket(price, sold, reserved) VALUES (?,?,?)");

            prepStat.setDouble(1, ticket.getPrice());
            prepStat.setInt(1, ticket.getSold());
            prepStat.setInt(1, 1);
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /** removing Ticket object from database, checking by id_ticket */
    public void removeTicket(int id_ticket) {

        try {
            PreparedStatement prepStat = conn.prepareStatement("DELETE FROM ticket WHERE id_ticket = ?");

            prepStat.setInt(1, id_ticket);
            prepStat.executeUpdate();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }



}
