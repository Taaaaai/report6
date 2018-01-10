package jp.ac.uryukyu.ie.e175746;

//親クラスのPersonを作成し名前、手札を加える
public class Person {
    private String name;
    private  int card = (int)(Math.random() * 13+ 1);
    private  int card2 = (int)(Math.random() * 13 + 1);
    private int sumCards = card + card2;
    private boolean lose;



    public Person(String name) {
        this.name = name;



        lose = false;






    }


    public boolean isLose(){return this.lose;}



    public int getcard1(){return this.card;}


    public int getCard2(){return this.card2;}

    public int getSumCards(){return this.sumCards;}

    public String getName() { return this.name;}

/*バーストの判定
    sumCards が21を超えた場合バーストする
*/


    public void burst(String name){
        if(sumCards>21){
            System.out.printf("バーストしました。%sの負けです。\n",getName());
            lose = true;
        }

    }





}
