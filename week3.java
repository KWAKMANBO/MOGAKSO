import java.util.*;

public class week3 {
    public static void main(String[] args) throws Exception {

        // 상속관계에서 멤버 접근에 대한 예제
        /* 
        CaptionTv ctv = new CaptionTv();

        ctv.channel = 10;
        ctv.channelUp();
        ctv.channelDown();
        
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, World");
        ctv.caption =  true;
        ctv.displayCaption("Hellw, World");
        */

        // 클래스간의 관계 결정에대한 예제
        /*
        Point[] p = {new Point(100,200),
                     new Point(140,50),
                     new Point(200,100)
        };
        

        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150,150),50);

        t.draw();
        c.draw();
        */
        
        // 클래스간의 관계 결정에대한 예제2
        Deck d = new Deck(); // deck객체 생성 --> 카드 한 벌을 만든다.
        Card c = d.pick(0);//섞기 전에  제일 위의 카드를 뽑음
        System.out.println(c); //card정보 출력

        d.shuffle(); // deck 셔플
        c = d.pick(0); // 카드 맨윗장 뽑기
        System.out.println(c);

    }
}

class Tv{
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() { channel++;}
    void channelDown() {channel--;}
}

class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption){ // caption이 있다면 즉 true라면 text 자막을 보여줌
            System.out.println(text);
        }
    }
}

class Shape{
    String color = "black";
    void darw(){
        System.out.printf("[color = %s]\n",color);
    }
}

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(){
        this(0,0);
    }

    String getXY() {
        return "(" +  x   +", "+y+ ")";
    }
}

class Circle extends Shape{
    Point center =  new Point();
    int r;

    Circle(){
        this(new Point(0,0),100);
    }

    Circle(Point center, int r){
        this.center = center;
        this.r = r;
    }

    void draw(){
        System.out.printf("[center = %d ,%d), r= %d, color %s]\n",center.x,center.y,r,color);
    }

}

class Triangle extends Shape{
    Point[] p = new Point[3];
    Triangle(Point[] p){
        this.p = p;
    }

    void draw() {
        System.out.printf("p1 = %s , p2 = %s,  p3 = %s, color = %s\n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
    }
}

// Deck클래스
class Deck{
    final int CARD_NUM = 52; // 카드 개수
    Card cardArr[] = new Card[CARD_NUM]; // Card객체 배열 포함

    Deck(){ //Deck의 카드를 초기화
        int i=0;

        for(int k = Card.KIND_MAX; k > 0 ;k--){ // k는 4부터 0까지 for문을 반복 수행
            for(int n=0; n < Card.NUM_MAX; n++){ // n은 0부터 13까지 for문 반복수행
                cardArr[i++]= new Card(k, n+1); // i--> kind, n+1--> 카드의 숫자 초기화 과정
            }
        }
    }


    Card pick(int index){ // 지정된 위치에(index)에 있는 카드 하나를 꺼내서 반환
            return cardArr[index];
    }

    Card pick(){
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for(int i=0; i < cardArr.length; i++){
            int r = (int)(Math.random()*CARD_NUM);

            Card Temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] =  Temp;

        }
    }

    }


// Card클래스
class Card{
    static final int KIND_MAX =4; //  무늬의 수
    static final int NUM_MAX = 13; // 무늬별 카드수

    static final int SPADE =4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER =1;

    int kind;
    int number;

    Card(){
        this(SPADE,1);
    }

    Card(int kind, int number){
        this.kind = kind; // 종류 정의
        this.number = number; // 카드 숫자
    }

    public String toString(){
        String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
        String numbers = "0123456789XJQK"; // 숫자10은 x로 표현

        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);// 카드의 종류와 숫자를 반환

    }

}