package jp.ac.uryukyu.ie.e175746;

//親クラスのPersonを作成し名前、手札、負け判定を加える
public class Person {
    private String name;
    private  int card = (int)(Math.random() * 13 + 1);
    private  int card2 = (int)(Math.random() * 13 + 1);
    private int sumCards = card + card2;
    private boolean lose;


    public Person(String name) {
        this.name = name;



        lose = false;

        System.out.printf("%sは現在カードを所持していません\n",name);


    }


    public boolean isLose(){return this.lose;}

    public void setloose(boolean lose){this.lose = lose;}

    public int getcard1(){return this.card;}

    public void setCard1(int card){this.card = card;}
    public int getCard2(){return this.card2;}
    public void setCard2(int card2){this.card2 = card2;}
    public int getSumCards(){return this.sumCards;}
    public void setSumCards(int sumCards){this.sumCards = sumCards;}

    public String getName() { return this.name;}

    public void setName(String name){this.name = name;}
//勝ち負け判定
    public void duel(Person Person){
        if(sumCards <= 21){
            System.out.println(getSumCards());
        }else{
            System.out.println(getName() + "の負けです");
        }
    }








}
