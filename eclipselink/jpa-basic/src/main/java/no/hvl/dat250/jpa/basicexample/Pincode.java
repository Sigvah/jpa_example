package no.hvl.dat250.jpa.basicexample;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id; //count
    private int pinNum;


    public int getId() {return id;};

    public void setId(int id) {this.id = id;}

    public int getPinNum() {return pinNum;}

    public void setPinNum(int pinNum) {this.pinNum = pinNum;}
}
