package Repository.DataSource;

import Model.*;

import java.util.List;

public interface DataSource {
    List<Airline> getAirlines();
    List<Airplane> getAirplanes();
    List<AirTicket> getAirTickets();
    List<Benefit> getBenefits();
    List<Cashier> getCashiers();
    List<City> getCities();
    List<Client> getClients();
    List<Flight> getFlights();
    List<Order> getOrders();
    List<Reservation> getReservations();
    List<SeatClass> getSeatClasses();

}
