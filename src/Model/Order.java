package Model;

public class Order {
    private int id;
    private int cashier_id;
    private int[] airTickets;

    public Order(int id, int cashier_id, int[] airTickets) {
        this.id = id;
        this.cashier_id = cashier_id;
        this.airTickets = airTickets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCashier_id() {
        return cashier_id;
    }

    public void setCashier_id(int cashier_id) {
        this.cashier_id = cashier_id;
    }

    public int[] getAirTickets() {
        return airTickets;
    }

    public void setAirTickets(int[] airTickets) {
        this.airTickets = airTickets;
    }
}
