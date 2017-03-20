package model;


import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ahmed Fadhel on 16-03-2017.
 */
public class ESO {


    TicketSale ticketSale;
    ArrayList<TicketSale> ticketSales1 = new ArrayList<>();
    ArrayList<TicketSale> ticketSales2 = new ArrayList<>();

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


    public void generateTicketTheater1(int ticketNr, String movieName){
        Random r = new Random();
        for (int i = 0; i < ticketNr ; i++) {
            int row = r.nextInt(20) + 1;
            int seat = r.nextInt(12) + 1;
            for (int j = 0; j < ticketSales1.size() ; j++) {
                if (ticketSales1.get(j).getRow() != row || ticketSales1.get(j).getSeat() != seat){
                    this.ticketSale = new TicketSale(r.nextInt(2), r.nextInt(2), 180, movieName, seat, row, 2017);
                    ticketSales1.add(ticketSale);
                }
            }
        }
    }

    public void generateTicketTheater2(int ticketNr, String movieName) {
        Random r = new Random();
        for (int i = 0; i < ticketNr ; i++) {
            int row = r.nextInt(25) + 1;
            int seat = r.nextInt(16) + 1;
            for (int j = 0; j < ticketSales2.size() ; j++) {
                if (ticketSales2.get(j).getRow() != row || ticketSales2.get(j).getSeat() != seat){
                    this.ticketSale = new TicketSale(r.nextInt(2), r.nextInt(2), 180, movieName, seat, row, 2017);
                    ticketSales2.add(ticketSale);
                }
            }
        }
    }
}
