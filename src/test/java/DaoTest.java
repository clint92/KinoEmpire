import dao.DaoTicket;
import model.Ticket;

/**
 * Created by Dave on 17/03/2017.
 */
public class DaoTest {

    public static void main(String[] args) {

        DaoTicket daoTicket = new DaoTicket();

        Ticket ticket = new Ticket();

        ticket = daoTicket.createTicket();

        //System.out.println(daoTicket.createTicket(ticket));
    }

}
