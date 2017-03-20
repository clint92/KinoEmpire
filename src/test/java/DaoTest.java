import dao.DaoTicket;
import model.TicketSale;

/**
 * Created by Dave on 17/03/2017.
 */
public class DaoTest {

    public static void main(String[] args) {

        DaoTicket daoTicket = new DaoTicket();

        TicketSale ticketSale = new TicketSale();

        ticketSale.setPrice(666.0);


        daoTicket.createTicketParam(ticketSale, 2);


        System.out.println(ticketSale);
    }

}
