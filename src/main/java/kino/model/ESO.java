package kino.model;


import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ahmed Fadhel on 16-03-2017.
 */
public class ESO {

    private TicketSale ticketSale;
    private ArrayList<TicketSale> ticketSales = new ArrayList<>();

    public boolean isReserved(){
        if (ticketSale.getReserved() == 1){
            return true;
        }
        return false;
    }

    public boolean isSold(){
        if (ticketSale.getSold() == 1){
            return true;
        }
        return false;
    }

    public ArrayList<TicketSale> generateTicket(int ticketNr){
        Random r = new Random();
        for (int i = 0; i < ticketNr ; i++) {
            TicketSale ticketSale = new TicketSale(r.nextInt(2),r.nextInt(2), 180);
            ticketSales.add(ticketSale);
        }
        return ticketSales;
    }

}
