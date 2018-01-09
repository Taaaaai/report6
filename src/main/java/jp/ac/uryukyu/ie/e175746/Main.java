package jp.ac.uryukyu.ie.e175746;
//簡単なブラックジャックを作りたい

public class Main {
    public static void main(String[] args){
        Guests guests   = new Guests("あなた");
        Dealer dealer = new Dealer("DEALER");
        System.out.println(guests.getName() + "の所持カードは" + guests.getcard1() + "と"+ guests.getCard2() + "で合計は" + guests.getSumCards()+ "です");

    }

}
