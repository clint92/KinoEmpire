package kino.model;

import kino.dao.EmployeeDao;

/**
 * Created by clint on 21-03-2017.
 */
public class Login {
EmployeeDao employeeDao = new EmployeeDao();
Employee e;
Boolean existingUser = false;

    public Login(){}

    public Boolean checkLogin(String username, String password)
    {
        e = employeeDao.checkForEmployee(username,password);
        if(e.getID() != 0 )
        {
            existingUser = true;
        }
        return existingUser;
    }

    public Employee getEmployee()
    {
        return this.e;
    }
}
