package Repository.Logic;

import Model.AirTicket;
import Model.Order;

public interface Logic {
    double getAllPriceOfSoldAirTickets();
    double getPriceOfSoldAirTicketsInOrder(Order order);
    int getCountOfSoldAirTickets();
    AirTicket getAirTicketByID(int id);
}
