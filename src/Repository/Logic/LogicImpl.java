package Repository.Logic;

import Model.AirTicket;
import Model.Order;
import Repository.DataSource.DataSource;

public class LogicImpl implements Logic{

    private final DataSource dataSource;

    public LogicImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //общая сумма заказов
    public double getAllPriceOfSoldAirTickets(){
        double price = 0;
        for(Order order : dataSource.getOrders()){
            price += getPriceOfSoldAirTicketsInOrder(order);
        }
        return  price;
    }

    //для 1 заказа
    public double getPriceOfSoldAirTicketsInOrder(Order order){
        double price = 0;
        for(int airTicketId : order.getAirTickets()){
            AirTicket airTicket = getAirTicketByID(airTicketId);
            if(airTicket != null) {
                price += airTicket.getPrice();
            }
        }
        return price;
    }

    //сколько всего билетов в заказах
    public int getCountOfSoldAirTickets(){
        int count = 0;
        for(Order order : dataSource.getOrders()){
            count += order.getAirTickets().length;
        }
        return count;
    }

    public AirTicket getAirTicketByID(int id){
        AirTicket current = null;
        for(AirTicket airTicket : dataSource.getAirTickets()){
            if(airTicket.getId() == id){
                current = airTicket;
                break;
            }
        }
        return current;
    }
}
