package kino.model;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static kino.utility.SQLConnection.getConnection;


/**
 * Created by Ahmed Fadhel on 16-03-2017.
 */
public class ESO {

    Ticket ticket;
    private java.sql.Connection Connection;
    private Statement statement;

    public ESO() {
    }

    public boolean TicketSold(int seat, int row, String theather, String dato){
        try {
            Connection = getConnection();

            statement = Connection.createStatement();

            String sql;
            sql = "SELECT * FROM ticket WHERE seatNr = '" + seat + "' AND rowNr = '" + row + " AND Theather = '" + theather + " AND dato = '" + dato + "'";

            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()){
                return true;
            }
            resultSet.close();
            statement.close();
            Connection.close();

        }catch (SQLException e){
            e.printStackTrace();
        }

        return false;
    }

    public void SellTicket(){
        try {
            Connection = getConnection();

            statement = Connection.createStatement();

            String sql;

            sql = "INSERT INTO ticket (price,MoiveName,seatNr,rowNr,Theather,dato)"; //virker ikke endnu lav lige databasen.

            statement.executeUpdate(sql);

            statement.close();
            Connection.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
