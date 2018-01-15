package jp.ac.uryukyu.ie.e175746;

import org.junit.Test;

import static org.junit.Assert.*;

class DealerTest {
    @Test
    void burst() {
        Guests guests   = new Guests("testあなた");
        if(guests.getSumCards()>21){
            System.out.printf("バーストしました。%sの負けです。\n",guests.getName());
            guests.setLose(true);

        }else{
                System.out.println("あなたの合計は" + guests.getSumCards() + "です"
                );
            guests.setLose(false);

        }


    }

}