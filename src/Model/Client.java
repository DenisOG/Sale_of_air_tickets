package Model;

import Model.Person;

public class Client extends Person {

    private String number;
    private int benefit_id;

    public Client(int id, String name, int age, String number, int benefit_id) {
        super(id, name, age);
        this.number=number;
        this.benefit_id=benefit_id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBenefit_id() {
        return benefit_id;
    }

    public void setBenefit_id(int benefit_id) {
        this.benefit_id = benefit_id;
    }
}
