package dao;

import model.Employee;
import utility.SQLConnection;
import java.sql.*;
/**
 * Created by ronnilenvighansen on 16/03/2017.
 */
public class EmployeeDao implements EmployeeDaoInterface {

    private Connection connection;

    public EmployeeDao(){
        connection = SQLConnection.getConnection();
    }

    public void createEmployee(String name, String username, int ID, String status, String password){
        try{
            PreparedStatement prepstat = connection.prepareStatement(
                    "INSERT INTO Employee(name, username, ID, status, password) VALUES (?,?,?,?,?)");
            prepstat.setString(1, name);
            prepstat.setString(2, username);
            prepstat.setInt(3, ID);
            prepstat.setString(4, status);
            prepstat.setString(5, password);
            prepstat.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }

    }
    public void deleteEmployee(int ID){
        try {
            PreparedStatement prepstat = connection.prepareStatement("DELETE FROM Employee WHERE ID = ?");
            prepstat.setInt(1, ID);
            prepstat.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    public void updateEmployee(Employee employee){
        try {
            PreparedStatement prepstat = connection.prepareStatement(("UPDATE Employee SET name = ?, username = ?, ID = ?, status = ?, password = ?"));
            prepstat.setString(1, employee.getName());
            prepstat.setString(2, employee.getUsername());
            prepstat.setInt(3, employee.getID());
            prepstat.setString(4, employee.getStatus());
            prepstat.setString(5, employee.getPassword());
            prepstat.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
