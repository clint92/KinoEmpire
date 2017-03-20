package kino.dao;

import kino.model.TicketSale;
import kino.utility.SQLConnection;

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

    /** creating TicketSale object in Database, with int as parameter to check if sold or reserved */
    public void createTicketParam(TicketSale ticketSale, int sale_status) {

        try {
            PreparedStatement prepStat = conn.prepareStatement("INSERT INTO ticket(price, sold, reserved, sale_date, movie_name, seat, row) VALUES (? ,? ,?, ?, ?, ?, ?)");

            if (sale_status == 0) {
                prepStat.setDouble(1, ticketSale.getPrice());
                prepStat.setInt(2, 1);
                prepStat.setInt(3, ticketSale.getReserved());

            }
            else if (sale_status == 1) {
                prepStat.setDouble(1, ticketSale.getPrice());
                prepStat.setInt(2, ticketSale.getSold());
                prepStat.setInt(3, 1);
            }
            else {
                throw new IllegalArgumentException("Error in parameter, must be 0 or 1");
            }
            prepStat.executeUpdate();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /** Create TicketSale object in Database */
    public void createTicket(TicketSale ticketSale) {

        try {
            PreparedStatement prepStat = conn.prepareStatement("INSERT INTO ticket(price, sold, reserved, sale_date, movie_name, seat, row) VALUES (? ,? ,?, ?, ?, ?, ?)");

            prepStat.setDouble(1, ticketSale.getPrice());
            prepStat.setInt(2, ticketSale.getSold());
            prepStat.setInt(3, ticketSale.getReserved());
            prepStat.executeUpdate();


        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    /** Update TicketSale object in Database */
    public void updateTicket(TicketSale ticketSale) {
        try {
            PreparedStatement prepStat = conn.prepareStatement("UPDATE ticket SET price = ?, sold = ?, reserved = ?" + "WHERE ticket_id = ?");

            prepStat.setDouble(1, ticketSale.getPrice());
            prepStat.setInt(2, ticketSale.getSold());
            prepStat.setInt(3, ticketSale.getReserved());
            prepStat.setInt(4, ticketSale.getId_ticketSale());
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /** Reads TicketSale object from Database */
    public void getTicket(int id_ticketSale) {

        try {
            PreparedStatement prepStat = conn.prepareStatement("SELECT FROM ticket WHERE id_ticketSale = ? ");

            prepStat.setInt(1, id_ticketSale);
            prepStat.executeUpdate();

            TicketSale ticketSale = new TicketSale();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /** Delete TicketSale object from database, checking by id_ticket */
    public void removeTicket(int id_ticketSale) {

        try {
            PreparedStatement prepStat = conn.prepareStatement("DELETE FROM ticket WHERE id_ticketSale = ? ");

            prepStat.setInt(1, id_ticketSale);
            prepStat.executeUpdate();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }



}
