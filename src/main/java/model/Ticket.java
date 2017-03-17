package model;

/**
 * Created by Ahmed Fadhel on 14-03-2017.
 */
public class Ticket {

    int id_ticket;
    int reserved;
    int sold;
    double price;

    public Ticket() {

    }

    public Ticket(int reserved, int sold, double price) {
        this.reserved = reserved;
        this.sold = sold;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReserved() {
        return reserved;
    }

    public void setReserved(int reserved) {
        this.reserved = reserved;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public String toString () {

        return "Ticket ID: " + id_ticket + "Reserved: " + reserved + "Sold: " + sold + "";

    }

}
