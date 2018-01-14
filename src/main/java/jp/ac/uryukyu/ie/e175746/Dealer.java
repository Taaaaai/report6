package jp.ac.uryukyu.ie.e175746;
//Personクラスの継承をした子クラスDealer

public class Dealer extends Person{

    public Dealer(String name) {
        super(name);
    }

    public void burst(String name) {
        super.burst(getName());
    }
}
