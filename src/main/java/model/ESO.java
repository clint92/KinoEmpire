package model;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ahmed Fadhel on 16-03-2017.
 */
public class ESO {

    int sold;
    String reserved;
    int sale_date;
    int seat;
    int row;
    String movie_name;
    Ticket ticket;
    ArrayList<Ticket> tickets = new ArrayList<>();

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public int getSale_date() {
        return sale_date;
    }

    public void setSale_date(int sale_date) {
        this.sale_date = sale_date;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }


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
