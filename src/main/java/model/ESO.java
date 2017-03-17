package model;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ahmed Fadhel on 16-03-2017.
 */
public class ESO {

    Ticket ticket;
    ArrayList<Ticket> tickets = new ArrayList<>();

    public boolean isReserved(){
        if (ticket.getReserved() == 1){
            return true;
        }
        return false;
    }

    public boolean isSold(){
        if (ticket.getSold() == 1){
            return true;
        }
        return false;
    }

    public ArrayList<Ticket> generateTicket(int ticketNr){
        Random r = new Random();
        for (int i = 0; i < ticketNr ; i++) {
            Ticket ticket = new Ticket(r.nextInt(2),r.nextInt(2), 180);
            tickets.add(ticket);
        }
        return tickets;
    }

}
