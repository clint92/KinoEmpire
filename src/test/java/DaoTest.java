
import kino.dao.DaoTicketSale;
import kino.dao.EmployeeDao;
import kino.model.TicketSale;


/**
 * Created by Dave on 17/03/2017.
 */
public class DaoTest {

    public static void main(String[] args) {

        DaoTicketSale daoTicketSale = new DaoTicketSale();

        TicketSale ticketSale = new TicketSale();

        ticketSale.setPrice(123.0);


        daoTicketSale.createTicketSaleParam(ticketSale, 0);

        EmployeeDao empDao = new EmployeeDao();

        empDao.createEmployee("Clint", "1", "a", "1");

        System.out.println(ticketSale);
    }

}
