package dao;
import model.Movie;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import utility.SQLConnection;
import java.sql.*;

/**
 * Created by ronnilenvighansen on 17/03/2017.
 */
public class MovieDao implements MovieDaoInterface {
    private Connection connection;
    public MovieDao(){
        connection = SQLConnection.getConnection();
    }
    public void createMovie(String genre, String name, int age, int id, String password, int date, int length){
        try{
            PreparedStatement prepstat = connection.prepareStatement(
                    "INSERT INTO Employee(genre, name, age, id, password, date, length) VALUES (?,?,?,?,?,?,?)");
            prepstat.setString(1, genre);
            prepstat.setString(2, name);
            prepstat.setInt(3, age);
            prepstat.setInt(4, id);
            prepstat.setString(5, password);
            prepstat.setInt(6, date);
            prepstat.setInt(7, length);
            prepstat.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    public void deleteMovie(int ID){
        try {
            PreparedStatement prepstat = connection.prepareStatement("DELETE FROM Movie WHERE ID = ?");
            prepstat.setInt(1, ID);
            prepstat.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
