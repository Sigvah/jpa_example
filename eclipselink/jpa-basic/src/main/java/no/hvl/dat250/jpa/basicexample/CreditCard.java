package no.hvl.dat250.jpa.basicexample;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private int balance;
    private int limit;
    private Pincode pincode;

    //private List<Pincode> pincodeList = new ArrayList<Pincode>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
    // @OneToMany
    //public List<Pincode> getPinCodeList() {return this.pincodeList;}
    //public void setPincodeList(List<Pincode> pin) {this.pincodeList = pin;}
    @OneToOne
    public Pincode getPincode() {return pincode;}

    public void setPincode(Pincode pincode) {
        this.pincode = pincode;
    }
}
