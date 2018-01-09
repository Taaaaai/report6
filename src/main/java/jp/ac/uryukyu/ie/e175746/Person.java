package jp.ac.uryukyu.ie.e175746;

public class Person {
    private String name;
    private int[] cards;
    private boolean lose;

    public Person(String name, int[] nowcards) {
        this.name = name;
        cards = nowcards;
        lose = false;
        if (cards.length == 0) {
            System.out.printf("%sさんは現在カードを所持していません\n",name);
        }else{
            System.out.printf("%sさんの手札は%dです。\n",name, nowcards);
        }

    }
}
