import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class week4 {
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
        /*
        Deck d = new Deck(); // deck객체 생성 --> 카드 한 벌을 만든다.
        Card c = d.pick(0);//섞기 전에  제일 위의 카드를 뽑음
        System.out.println(c); //card정보 출력

        d.shuffle(); // deck 셔플
        c = d.pick(0); // 카드 맨윗장 뽑기
        System.out.println(c);
        */

        //this와 super
        /*
        Child c = new Child();
        c.method();
        */

        //  super예제
        /*
        Point3D_v2 p3 = new Point3D_v2();
        System.out.println("p3.x = " + p3.x);
        System.out.println("p3.y = " + p3.y);
        System.out.println("p3.z = " + p3.z);
        */

        //import문 예제
        /*
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat();
        SimpleDateFormat time = new SimpleDateFormat();

        System.out.println("오늘 날짜는 " + date.format(today));
        System.out.println("현재 시간은" + time.format(today)); 
        */

        // static import 예제
        /*
        //System.out.println(Math.random());
        out.println(random());

        //System.out.println("Math.Pi : " + Math.PI)l
        out.println("Math.PI: " + PI);
        */

        // final 예제
        /*
        Card c = new Card("HEART", 10);
        //c.number = 5; // --> 오류발생 final이기 때문에 초기화 불가능
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c); // System.out.println(c.toString());
        */

        //private 실습 예제
        /*
        TimeTest t1 = new TimeTest(12, 35, 35);
        System.out.println(t1);
       // t1.hour = 13;//에러발생 --> 접근제어자가 private이므로 접근할 수 없음
        t1.setHour(t1.getHour()+1);
        System.out.println(t1); // toString과 같음
        */

        // 생성자의 접근제어자 예제
       // Singleton s = new Singleton(); //--> 생성자의 접근제어자가 private이므로 객체를 생성할 수 없음
        //Singleton s = Singleton.getInstance();

        // 참조변수 형변환 예제
        /*
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car =fe;
       //  car.water(); //에러 발생!! Car타입의 참조변수로는 자손 타입의 메서드를 호출할 수 없음
        fe2 = (FireEngine)car; // 자손타입 <-- 조상타입 다운 캐스팅 형변환 생략x
        fe2.water();
        */

        // instanceof 예제
        /*
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine){
            System.out.println("This is a FireEngine instance.");
        }
        if(fe instanceof Car){
            System.out.println("This is a Car instance.");
        }

        if(fe instanceof Object){
            System.out.println("This is a Objcet instacne");
        }

        System.out.println(fe.getClass().getName()); // 클래스 이름 출력        
        */
        // 참조변수와 인스턴스의 연결 예제1
        /*
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
        */

        // 참조변수와 인스턴스의 연결 예제2,3
        /*
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
        */

        // 매개변수의 다형성 예제
        /*
        Buyer b = new Buyer();

        b.Buy(new Tv());
        b.Buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
        */

        //여로 종류의 객체를 배열로다루기 예제1
        /*
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();
        */

        // 여러 종류의 객체를 배열로다루기 예제2
        /*
        Buyer b =new Buyer();
        Tv tv = new Tv();
        Computer com = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
        */

        //인터페이스의 구현예제
        /*
        Fighter f = new Fighter();
        
        if(f instanceof Unit){
            System.out.println("f는 Unit클래스의 자손입니다.");
        }
        if(f instanceof Fightable){
            System.out.println("f는 fightable를 구현합니다.");
        }
        if(f instanceof Movable){
            System.out.println("f는 Movable를 구현합니다.");
        }
        if(f instanceof Attackable){
            System.out.println("f는 Attackalbe를 구현합니다.");
        }
        if(f instanceof Object){
            System.out.println("f는 Object를 구현합니다.");
        }
        */

        //인터페이스를 이용한 다형성예제
        /*
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
        */
        
        //인터페이스의 장점 reparable예제
        /*
        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
        // scv.repair(marine); // --> 에러발생
        */

        // 인터페이스의 이해 예제
        /*A a = new A();
        a.autoPlay(new B());
        a.autoPlay(new C());
        */

        // 인터페이스의 이해 예제2
        //A a = new A();
        //a.methodA();


        // default메서드와 static메서드 예제
        /*
        Child_v2 c = new Child_v2();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
        */


    }


} // end of main


/*class Tv{
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() { channel++;}
    void channelDown() {channel--;}
}

class VCR{
    boolean power;
    int counter =0;
    void power(){}
    void play(){}
    void stop(){}
    void rew(){}
    void ff(){}
}
//단일 상속예제
class TVCR{
    VCR vcr = new VCR();

    void play(){
        vcr.play();
    }
    void stop(){
        vcr.stop();
    }
    void rew(){
        vcr.rew();
    }
    void ff(){
        vcr.ff();
    }

}

class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption){ // caption이 있다면 즉 true라면 text 자막을 보여줌
            System.out.println(text);
        }
    }
}*/

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

class Point3D extends Point{
    int z;

    String getXY(){
       // return "x : " + x + ", y : " + y + ", z : "+ z;
       return super.getXY() + "z";
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
/*
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
    */


// Card클래스
/* 
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
*/

/*class Parent{
    int x = 10;
}

class Child extends Parent{
    int x =20;

    void method(){
        System.out.println("x = "+  x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);

    }
}*/

class Point_v2{
    int x =10;
    int y = 20;
    
    Point_v2(int x, int y){
        
        this.x = x;
        this.y = y;
    }

    String getLocation(){
        return "x : " + x + ", y : " + y;
    }

}

class Point3D_v2 extends Point_v2{
    int z = 30;
    
    Point3D_v2(){
        this(100,200,300);
    }

    Point3D_v2(int x, int y, int z){
        super(x,  y);
        this.z = z;
    }

    String getLocation(){
        return "x : " + x + ", y: " + y +", z: " + z;
    }

}

//static class 예제
class StaticTest{
    static int width = 200; // 클래스 변수
    static int height = 120; // 클래스 변수
    static{
        // static변수의 복잡한 초기화를 수행
    }

    static int max(int a, int b){
        return a > b ? a: b; // 클래스 메서드
        }
}

// final 예제
final class FinalTest{ // 조상이 될 수 없는 클래스
    final int MAX_SIZE = 10; // 값을 변경할 수 없는 멤버변수

    final void getMaxSize(){ // 오버라이딩 할 수 없는 메서드
        final int LV = MAX_SIZE; // 값을 변경할 수 없는 지역변수
    }
}

// final 예제
class Card{
    final int NUMBER;
    final String KIND;

    static int width = 100;
    static int height = 250;

    Card(String kind, int num){
        //final이 붙은 변수를 생성자에서 초기화 할 수 있음
        KIND = kind;
        NUMBER = num;
    }

    Card(){
        this("HEART",1);
    }

    public String toString(){
        return KIND + " " + NUMBER;
    }
}

class TimeTest{
    private int hour;
    private int minute;
    private int second;

    TimeTest(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour(){ return hour;}
    public void setHour(int hour){
        if(hour < 0 || hour >23)return;
        this.hour =hour;
    }
    public int getMinute(){return minute;}
    public void setMinute(int minute){
        if(minute < 0 || minute > 59) return;
        this.minute = minute;
    }
    public int getSecond(){return second;}
    public void setSecond(int second){
        if(second < 0 || second > 59)return;
        this.second = second;
    }

    public String toString(){
        return hour +": " + minute + ": " + second;
    }
}

class Singleton{
    private static Singleton s = new Singleton();

    private  Singleton() {
        // ...
    }

    public static Singleton getInstance(){
        if(s==null){
            s = new Singleton();
        }
        return s;
    }
    //....
}

// 참조변수 형변환 예제
class Car{
    String color;
    int door;

    void drive(){ // 운전하는 기능
        System.out.println("drive, Brrrr~");
    }

    void stop(){
        System.out.println("stop!!!");
    }

}

class FireEngine extends Car{
    void water(){
        System.out.println("water!!!");
    }
}

// 참조변수와 인스턴스의 연결 예제1
/*
class Parent{
    int x =100;

    void method(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    int x = 200;

    void method(){
    System.out.println("Child Method");
    }
}
*/

//참조변수와 인스턴스의 연결 예제2
/*
class Parent{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent{

}
*/

// 참조변수와 인스턴스의 연결 예제3
class Parent{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    int x =200;

    void method(){
        System.out.println("x=" + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}
// 매개변수의 다형성 예제
/*
class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price=price;
        bonusPoint = (int)(price/10);
    }
}
class Tv extends Product{
    Tv(){
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}
class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void Buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
    

    money -=p.price;
    bonusPoint+=p.bonusPoint;
    System.out.println(p+"을/를 구입하셨습니다.");
    }
}
*/

/*
class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint +=(int)(price/10);
    }

    Product(){}
}
class Tv extends Product{
    Tv(){
        super(100);
    }
    public String toString(){ return "Tv";}
}
class Computer extends Product{
    Computer() {super(200);}
    public String toString(){return "Computer";}
}
class Audio extends Product{
    Audio(){super(50);}
    public String toString(){return "Audio";}
}
class Buyer{
    int money =1000;
    int bonusPoint = 0;
    Product[] item = new Product[10];
    int i =0;

    void buy(Product p){
        if(money < p.price){
        System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
        return;
    }

    money -=p.price;
    bonusPoint +=p.bonusPoint;
    item[i++] =p;
    System.out.println(p+ "을/를 구입하셨습니다.");
    }

    void summary(){
        int sum =0;
        String itemList = "";

        for(int i=0; i<item.length; i++){
            if(item[i]==null)break;
            sum+=item[i].price;
            itemList +=item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum +"만원입니다.");
        System.out.println("구입하신 제품은 " +itemList + "입니다.");
    }
}
*/

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

Product(){}
}

class Tv extends Product{
    Tv(){
        super(100);
    }
    public String toString(){return "Tv";}
}

class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){return "Computer";}
}
class Audio extends Product{
    Audio(){
        super(50);
    }
    public String toString(){return "Audio";}
}
class Buyer{
    int money = 1000;
    int bonusPoint =0;
    Vector item = new Vector();// 구입한 제품을 저장하는데 사용하는 Vector객체

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
        }
        money -=p.price;
        bonusPoint +=p.bonusPoint;
        item.add(p);
        System.out.println(p + "을/를 구입하셨습니다.");
    }
    void refund(Product p){
        if(item.remove(p)){
            money +=p.price;
            bonusPoint -=p.bonusPoint;
            System.out.println(p+ "을/를 반품하셨습니다.");
        }else{
            System.out.println("구입하신 제품중 해당 제품이 없습니다.");
        }
    }

    void summary(){
        int sum=0;
        String itemList = "";

        if(item.isEmpty()){
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        //반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for(int i=0; i<item.size();i++){
            Product p = (Product)item.get(i); // vector의 i번째에 있는 객체를 얻어온다.
            sum +=p.price;
            itemList += (i==0) ? "" + p : ", " +p; 
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은" + itemList + "입니다.");
    }
}

// 인터페이스 예제
class Fighter extends Unit implements Fightable{
    public void move(int x, int y){ /*내용생략*/}
    public void attack(Unit u){ /* 내용생략 */}
}
class Unit{
    int currentHp;
    int x;
    int y;
}
interface Fightable extends Movable,Attackable{ }
interface Movable {void move(int x, int y);}
interface Attackable {void attack(Unit u);}

//인터페이스를 이용한 다형성 예제
interface Parseable{
    //구문분석작업을 수행
    public abstract void parse(String fileName);
}
class ParserManager{
    //리턴타입이 Parseable이다.
    public static Parseable getParser(String type){
        if(type.equals("XML")){
            return new XMLParser();
        }else{
            Parseable p = new HTMLParser();
            return p;
            // return new HTMLParser();
        }
    }
}
class XMLParser implements Parseable{
    public void parse(String fileName){
        /* 구문 분석잡업을 수행하는 코드 */
        System.out.println(fileName + " - XML parsing completed.");
    }
}
class HTMLParser implements Parseable{
    public void parse(String fileName){
        System.out.println(fileName + "- HTML parsing completed");
    }
}

// 인터페이스  repairable예제
interface Reparable{};
class GroundUnit extends Unit_v2{
    GroundUnit(int hp){
        super(hp);
    }
}

class AirUnit extends Unit_v2{
    AirUnit(int hp){
        super(hp);
    }
}


class Unit_v2 {
    int hitPoint;
    final int MAX_HP;
    Unit_v2(int hp){
        MAX_HP = hp;
    }
}

class Tank extends GroundUnit implements Reparable{
    Tank(){
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString(){
        return "Tank";
    }
}

class Dropship extends AirUnit implements Reparable{
    Dropship(){
        super(125);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "Dropship";
    }
}

class Marine extends GroundUnit{
    Marine(){
        super(40);
        hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit implements Reparable{
    SCV(){
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Reparable r){
        if(r instanceof Unit_v2){
            Unit_v2 u = (Unit_v2)r;
            while(u.hitPoint !=MAX_HP){
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
}

// 인터페이스의 이해 예제
/*class A{
    void autoPlay(I i){
        i.play();
    }
}

interface I{
    public abstract void play();
}

class B implements I{
    public void play(){
        System.out.println("Play in B class");
    }
}

class C implements I{
    public void play(){
        System.out.println("Play in C class");
    }
}
*/

//인터페이스의 이해 예제2
class A{
    void methodA(){
        I i = InstacneManager.getInstacne();
        i.methodB();
        System.out.println(i.toString());
    }
}

interface I{
    public abstract void methodB();
}

class B implements I{
    public void methodB(){
        System.out.println("methodB in B class");
    }

    public String toString(){return "class B";}

}

class InstacneManager{
    public static I getInstacne() {
        return new B();
    }
}

//default메서드와 static메서드 예제
class Child_v2 extends Parent_v2 implements MyInterface, MyInterface2{
    public void method1(){
        System.out.println("method2() in child");
    } 
}
class Parent_v2{
    public void method2(){
        System.out.println("mewthod2() in parent");
    }
}
interface MyInterface{
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterfact");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterfact");
    }
}

interface MyInterface2{
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface2");
    }
}


