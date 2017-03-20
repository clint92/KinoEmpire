package dao;

import model.TicketSale;
import sun.security.krb5.internal.Ticket;

/**
 * Created by Dave on 20/03/2017.
 */
public interface DaoTicketSale_Interface {

    void createTicketSaleParam(TicketSale ticketsale, int sale_status);

    void createTicketSale(TicketSale ticketsale);

    void getTicketSale(int ticketSale_id);

    void updateTicketSale(TicketSale ticketSale);

    void removeTicketSale(int ticketSale_id);
}
