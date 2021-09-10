package no.hvl.dat250.jpa.basicexample;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String id;
    private  List<CreditCard> creditCardList = new ArrayList<CreditCard>();


    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
    }
    @OneToMany
    public  List<CreditCard> getCreditCardList() { return this.creditCardList;}
    public void setCreditCardList(List<CreditCard> number) {this.creditCardList = number;}
}
