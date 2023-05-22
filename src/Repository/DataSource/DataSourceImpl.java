package Repository.DataSource;

import Model.*;
import sun.security.mscapi.CPublicKey;

import java.util.ArrayList;
import java.util.List;

public class DataSourceImpl implements DataSource{
    private List<Airline> airlines = new ArrayList<>();
    private List<Airplane> airplanes = new ArrayList<>();
    private List<AirTicket> airTickets = new ArrayList<>();
    private List<Benefit> benefits = new ArrayList<>();
    private List<Cashier> cashiers = new ArrayList<>();
    private List<City> cities = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();
    private List<Flight> flights = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();
    private List<SeatClass> seatClasses = new ArrayList<>();

    public DataSourceImpl(){
        initData();
    }

    public interface AddValue{
        void add();
    }

    public class AirLines implements AddValue{
        @Override
        public void add(){
            airlines.add(new Airline(1, "Qatar Airways"));
            airlines.add(new Airline(2, "Singapore Airlines"));
            airlines.add(new Airline(3, "Emirates"));
        }
    }

    public class Airplanes implements AddValue{
        @Override
        public void add(){
            airplanes.add(new Airplane(1, "Airbus A319"));
            airplanes.add(new Airplane(2, "Airbus A320"));
            airplanes.add(new Airplane(3, "Airbus A321"));
        }
    }

    public abstract class ValueGenerator{
        public void addValue(){
            AddValue addValue = createValue();
            addValue.add();
        }
        public abstract AddValue createValue();
    }

    public class AirLinesGenerator extends ValueGenerator{
        @Override
        public AddValue createValue(){
            return new AirLines();
        }
    }

    public class AirplanesGenerator extends ValueGenerator{
        @Override
        public AddValue createValue(){
            return new Airplanes();
        }
    }

    private void initData(){

        List<ValueGenerator> generatorList = new ArrayList<>();
        generatorList.add(new AirLinesGenerator());
        generatorList.add(new AirplanesGenerator());
        ValueGenerator valueGenerator = generatorList.get(0);
        valueGenerator.addValue();

        //льготы
        benefits.add(new Benefit(1, "Молодёжь до 23", 10));
        benefits.add(new Benefit(2, "Многодетная семья", 20));
        benefits.add(new Benefit(3, "Ветераны", 30));
        //продавцы
        cashiers.add(new Cashier(1, "Азонов Михаил", 30));
        cashiers.add(new Cashier(2, "Кутузов Олег", 34));
        cashiers.add(new Cashier(3, "Остапенко Наталья", 26));
        //города
        cities.add(new City(1,"Сургут"));
        cities.add(new City(2,"Тюмень"));
        cities.add(new City(3,"Москва"));
        cities.add(new City(4,"Салехард"));
        //клиенты
        clients.add(new Client(1, "Иванов Пётр", 21, "+79226718320", 1));
        clients.add(new Client(2, "Самарова Мария", 36, "+79228903813", 2));
        clients.add(new Client(3, "Осипов Александр", 73, "+79228705534", 3));
        //рейсы
        flights.add(new Flight(1,"DP-959"));
        flights.add(new Flight(2,"SU-4941"));
        //резервирования
        reservations.add(new Reservation(1, "Res1"));
        reservations.add(new Reservation(2, "Res2"));
        reservations.add(new Reservation(0, "Null"));
        //классы посадочных мест
        seatClasses.add(new SeatClass(1, "Эконом-класс",5000));
        seatClasses.add(new SeatClass(2, "Бизнес-класс",6000));
        seatClasses.add(new SeatClass(3, "Первый класс",8000));
        //авиабилеты
        airTickets.add(new AirTicket(1,1,1,1,2,1,1,"20.04.2022 10:00:00", "20.04.2022 12:00:00", true, 1, 4500, true));
        airTickets.add(new AirTicket(2,2,2,1,3,2,2,"21.04.2022 10:00:00", "21.04.2022 12:00:00", false, 0, 4800, true));
        airTickets.add(new AirTicket(3,3,2,1,3,2,3,"22.04.2022 10:00:00", "22.04.2022 12:00:00", true, 2, 5600, true));
        //заказы
        orders.add(new Order(1,1, new int[]{1,2}));
        orders.add(new Order(2,2, new int[]{3}));
    }

    @Override
    public List<Airline> getAirlines() {
        return airlines;
    }

    @Override
    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    @Override
    public List<AirTicket> getAirTickets() {
        return airTickets;
    }

    @Override
    public List<Benefit> getBenefits() {
        return benefits;
    }

    @Override
    public List<Cashier> getCashiers() {
        return cashiers;
    }

    @Override
    public List<City> getCities() {
        return cities;
    }

    @Override
    public List<Client> getClients() {
        return clients;
    }

    @Override
    public List<Flight> getFlights() {
        return flights;
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public List<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public List<SeatClass> getSeatClasses() {
        return seatClasses;
    }
}
