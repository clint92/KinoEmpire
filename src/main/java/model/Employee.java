package model;

/**
 * Created by Ahmed Fadhel on 14-03-2017.
 */
public class Employee {
    String name;
    String username;
    int ID;
    String status;
    String password;



    public Employee(String name, String username, int ID, String status, String password) {
        this.name = name;
        this.username = username;
        this.ID = ID;
        this.status = status;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        username = username;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return " name = " + name + '\n' +
                " ID = " + ID + '\n' +
                " username = " + username + '\n' +
                " password =  " + password + '\n' +
                " status = " + status;
    }
}
