package Model;

import java.util.Date;

public class AirTicket {
    private int id;
    private int client_id;
    private int flight_id;
    private int city_from_id;
    private int city_where_id;
    private int airline_id;
    private int seat_class_id;
    private String date_start;
    private String date_finish;
    private boolean reserved;
    private int reservation_id;
    private double price;
    private boolean paid;

    public AirTicket(int id, int client_id, int flight_id, int city_from_id, int city_where_id, int airline_id, int seat_class_id, String date_start, String date_finish, boolean reserved, int reservation_id, double price, boolean paid) {
        this.id = id;
        this.client_id = client_id;
        this.flight_id = flight_id;
        this.city_from_id = city_from_id;
        this.city_where_id = city_where_id;
        this.airline_id = airline_id;
        this.seat_class_id = seat_class_id;
        this.date_start = date_start;
        this.date_finish = date_finish;
        this.reserved = reserved;
        this.reservation_id = reservation_id;
        this.price = price;
        this.paid = paid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public int getCity_from_id() {
        return city_from_id;
    }

    public void setCity_from_id(int city_from_id) {
        this.city_from_id = city_from_id;
    }

    public int getCity_where_id() {
        return city_where_id;
    }

    public void setCity_where_id(int city_where_id) {
        this.city_where_id = city_where_id;
    }

    public int getAirline_id() {
        return airline_id;
    }

    public void setAirline_id(int airline_id) {
        this.airline_id = airline_id;
    }

    public int getSeat_class_id() {
        return seat_class_id;
    }

    public void setSeat_class_id(int seat_class_id) {
        this.seat_class_id = seat_class_id;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_finish() {
        return date_finish;
    }

    public void setDate_finish(String date_finish) {
        this.date_finish = date_finish;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
