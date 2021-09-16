package no.hvl.dat250.jpa.basicexample;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Name;
import javax.persistence.*;

@Entity
public class Person2 {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String name;
    private String nonsenseField = "";

    private  List<CreditCard> creditCardList = new ArrayList<CreditCard>();
    //private  List<Adress> adressList = new ArrayList<Adress>();

    @ManyToMany
    @JoinTable(name = "Person2_adress")
    private List<Adress> adress = new ArrayList<Adress>();

    public List<Adress> getAdress() {
        return adress;
    }

    public void addAdress(Adress adress1) {
        this.adress.add(adress1);
    }

    public void setAdress(List<Adress> adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }


    @Transient
    public String getNonsenseField() {
        return nonsenseField;
    }

    public void setNonsenseField(String nonsenseField) {
        this.nonsenseField = nonsenseField;
    }

    @OneToMany
    public  List<CreditCard> getCreditCardList() { return this.creditCardList;}

/*    @ManyToMany
    public List<Adress> getAdressList() {return this.adressList;}
    public void setAdressList(List<Adress> adress) {this.adressList = adress;}
*/
}
