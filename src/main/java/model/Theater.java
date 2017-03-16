package model;

/**
 * Created by Ali on 14-03-2017.
 */

public class Theater {
    int rows = 0;
    int seats = 0;
    int id;

    public Theater(int rows, int seats) {
        this.rows = rows;
        this.seats = seats;
        this.id = id;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "theaterClass{" +
                "rows=" + rows + ", seats=" + seats + ", id=" + id +
                '}';
    }
}
