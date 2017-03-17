package dao;

import model.Employee;

/**
 * Created by ronnilenvighansen on 16/03/2017.
 */
public interface EmployeeDaoInterface {
    public void createEmployee(String name, String username, int ID, String status, String password);
    public void deleteEmployee(int ID);
    public void updateEmployee(Employee employee);
}
