package jp.ac.uryukyu.ie.e175746;
//簡単なブラックジャックを作りたい
//強制的に２枚ドローしその２枚で勝負する

public class Main {
    public static void main(String[] args){
        Guests guests   = new Guests("あなた");
        Dealer dealer = new Dealer("DEALER");
        System.out.println(guests.getName() + "の所持カードは" + guests.getcard1() + "と"+ guests.getCard2() + "で合計は" + guests.getSumCards()+ "です");
        System.out.println(dealer.getName() + "の所持カードは" + dealer.getcard1() + "と"+ dealer.getCard2() + "で合計は" + dealer.getSumCards()+ "です");

        dealer.burst(dealer.getName());
        guests.burst(guests.getName());
         if(guests.isLose() == true && dealer.isLose() == true){
            System.out.println("両方の負けです");

        }else{
            if(guests.getSumCards() < 21){
                if(dealer.getSumCards() < 21){
                    if(guests.getSumCards() > dealer.getSumCards()){
                        System.out.printf("%sの勝ちです\n",guests.getName());
                    }else if(guests.getSumCards() == dealer.getSumCards()) {
                        System.out.println("引き分けです");
                    }else {
                        System.out.printf("%sの勝ちです\n",dealer.getName());
                    }
                }
            }
        }

    }

}
