class Tv{
    //Tv의 속성(멤버변수)
    String color; //색상
    boolean power; // 전원상태(on/off)
    int channel; //채널

    void power() {power = !power;} // Tv를 켜거나 끄는 기능을 하는 메서드
    void channelUp() {++channel;} // Tv의 채널을 높이는 기능을 하는 메서드
    void channelDown(){--channel;} // Tv의 채널을 낮추는 기능을 하는 메서드
}


public class week2 {
    static{
        System.out.println("static()");
    }

    {
        System.out.println("{ }");
    }

    public week2(){ 
        System.out.println("생성자");
    }
    public static void main(String[] args) throws Exception {
       //객체의 생성 및 속성이용하기 예제1
       /*  
       Tv t;// Tv인스턴스를 참조하기위한 변수 t를 선언
        t =  new Tv(); // Tv인스턴스를 생성
        t.channel = 7; // t의 channel 7로 설정
        t.channelUp(); // 채널을 -1
        t.channelDown(); //  채널을 
        System.out.println("현재 채널은" + t.channel + "입니다.");
        */

        // 객체의 생성 및 속성 이용하기 예제2
        /* 
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
        */

        // 객체의 생성 및 속성 이용하기 예제3
        /*
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t2 =t1;
        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
        */


        // 여러개의 객체 생성 및 사용
        /* 
        Tv[] tvArr = new Tv[3];

        for(int i=0; i< 3; i++){
            tvArr[i]  = new Tv();
            tvArr[i].channel = i+10;
        }

        for(int i=0; i < tvArr.length; i++){
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d\n",i,tvArr[i].channel);
        }
        */

        //  클래스 변수와 인스턴스 변수
        /* 
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card,height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heard";
        c1.number = 7;

        Card c2 =  new Card();
        c2.kind = "Spade";
        c2.number =4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 크기는 (" +c1.width +", "+ c1.height+ ")" );
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며 크기는 (" +c2.width +", "+ c2.height+ ")" );
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 크기는 (" +c1.width +", "+ c1.height+ ")" );
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며 크기는 (" +c2.width + ", "+c2.height+ ")" );
        */
    
        //예제 6-6 메서드의 호출
        /*     
        MyMath mm = new MyMath();
        long result1 = mm.add(5l, 3l);
        long result2 = mm.subtract(5l, 3l);
        long result3 = mm.multiply(5l, 3l);
        double result4 = mm.divide(5L, 3L);
        
        System.out.println("add(5l,3l) : " + result1);
        System.out.println("subtract(5l,3l) : " + result2);
        System.out.println("multiply(5l,3l) : " + result3);
        System.out.println("divide(5l,3l) : " + result4);
        */

        // 메서드 호출 예제
        /* 
        System.out.println("main(String[] args)가 시작되었음");
        firstMethod();
        System.out.println("main(String[] args)가 종료되었음");
        


    }

    static void firstMethod(){
        System.out.println("firstMethod()가 시작되었음");
        secondMethod();
        System.out.println("secondMethod()가 시작되었음");
    }

    static void secondMethod(){
        System.out.println("secondMethod()가 시작되었음");
        System.out.println("secondMethod()가 종료되었음");
    }
    */

    // 기본형 매개변수 예제
    /* 
    Data d = new Data();
    d.x = 10;
    System.out.println("main() : x = " + d.x);

    change(d.x);
    System.out.println("After change(d.x)");
    System.out.println("main() : x = " + d.x);
    */

    // 참조형 매개변수 에제
    /* 
    Data d = new Data();
    d.x = 10;
    System.out.println("main() : x = " + d.x);

    Change(d);
    System.out.println("After change(d.x)");
    System.out.println("main() : x = " + d.x);
    */

    // 배열(참조형 변수)예제
    /* 
    int[] arr = new int[] {3,2,1,6,5,4};

    printArr(arr);
    sortArr(arr);
    printArr(arr);
    System.out.println("sum = " + sumArr(arr));
    */

    // 참조형 반환타입 예제
    /* 
    Data d = new Data();
    d.x = 10;

    Data d2 = copy(d);
    System.out.println("d.x = " + d.x);
    System.out.println("d2.x = " + d2.x);
    */

    // 재귀호출 팩토리얼 예제
    /* 
    int result = factorial(4);

    System.out.println(result);
    */

    //팩토리얼+유효성 검사 예제
    /* 
    int n = 21;
    long result = 0;

    for(int i =1; i<=n; i++){
        result = lfactorial(i);

        if(result == -1){
            System.out.printf("유효하지 않은 값입니다. (0<n<=20: %d\n)",n);
            break;
        }

        System.out.printf("%2d!=%20d\n",i ,result);

    }
    */

    // 거듭제곱의 합을 구하는 프로그램
    /* 
    int x = 2; //  밑
    int n = 5; // 최대 지수
    long result =0;

    for(int i=1; i<=n;i++){
        result +=power(x, i);
        }

    System.out.println(result);
    */

    // 클래스 메서드와 인스턴스 메서드 예제
    /* 
    // 클래스 메서드 호출
    System.out.println(MyMath2.add(200l,100l));
    System.out.println(MyMath2.subtract(200l,100l));
    System.out.println(MyMath2.multiply(200l, 100l));
    System.out.println(MyMath2.divied(200l,100l));
    // 인스턴스 메서드 호출

    MyMath2 mm = new MyMath2();
    mm.a=200l;
    mm.b=100l;

    System.out.println(mm.add());
    System.out.println(mm.subtract());
    System.out.println(mm.multiply());
    System.out.println(mm.divied());
    */

    // 가변인자와 오버로딩 예제
    /*
    String[] strArr = {"100","200","300"};

    System.out.println(concatenate(" ","100","200","100"));
    System.out.println(concatenate("-", strArr));
    System.out.println(concatenate(",", new String[] {"1","2","3"}));
    System.out.println("[" +concatenate(",", new String[0] )+ "]");
    System.out.println("[" + concatenate(",",new String[0])+"]");
    */

    // 기본생성자 예제
    /*
    Data1 d1 = new Data1();
    //Data2 d2 = new Data2();
    Data2 d2 = new Data2(10);
    */

    // 매개변수가 있는 생성자 예제
    /* 
    Car c1 = new Car();
    Car c2 = new Car("white","auto",4);

    System.out.println(c1.color + c1.gearType + c1.door);
    System.out.println(c2.color + c2.gearType + c2.door);
    */

    System.out.println("week2 wk  = new week2()");

    week2 wk = new week2();

    System.out.println("week2 wk  = new week2()");

    week2 wk1 = new week2();



}

static String concatenate(String delim, String... args){
    String result = "";

    for(String str : args){
        result +=str + delim;
    }

    return result;
}

static long power(int x, int n){
    if(n==1)return x;
    
    return x*power(x,n-1);
}

static long lfactorial (int n){
    if(n<=0 || n > 20)return -1; // 유효성 검사
    if(n<=1)return 1;

    return n*lfactorial(n-1);
}

static int factorial(int n){
    int result=0;

    if(n==1){
        result = 1;
    }else{
        result = n*factorial(n-1);
    }

    return result;
}

static Data copy(Data d){
    Data tmp = new Data(); // 객체 생성
    tmp.x = d.x; // 생성한 객체에 값을 입력

    return tmp;// 생성한 객체의 주소값을 반환
}

static void change(int x){ // 매개변수로 기본형을 입력 받았을 때 값을 변경해보는 메서드 --> 메서드 안에서만 변경됨
        x = 1000;
        System.out.println("change() : x = " + x);
    }

static void Change(Data d){ // 매개변수로 참조형을 입력 받았을 때 값을 변경해보는 메서드 --> 참조형 변수의 주소를 이용 값변강 가능
    d.x = 1000;
    System.out.println("chage() : x = " + d.x);
}

static void printArr(int arr[]){ // 배열의 모든 요소 출력하는 메서드
    System.out.print("[");

    for(int i=0; i <  arr.length; i++){
        System.out.print(arr[i]);
    }
    System.out.println("]");
}

static int sumArr(int[] arr){ // 배열의 모든 요소의 합을 반환하는 메서드
    int sum =0;
    for(int i =0; i<arr.length; i++){
        sum +=arr[i];
    }
    return sum;
}

static void sortArr(int[] arr){ // 배열을 정렬하는 메서드 버블 정렬
    for(int i =0; i<arr.length; i++){
        for(int j=0; j<arr.length-1-i;j++){
            if(arr[j] > arr[j+1]){
                int tmp =  arr[j+1];
                arr[j+1] =arr[j];
                arr[j] =tmp;
            }
        }
    }
}

}

class Card{
    String kind; // 무늬 -  인스턴스 변수
    int number; // 숫자 - 인스텬스 변수
    static int width = 100; // 폭 - 클래스 변수
    static int height = 250; // 높이 - 클래스 변수
}

class MyMath{
    long add(long a, long b){
        return a+b;
    }

    long subtract(long a, long b){
        return a-b;
    }

    long multiply(long a, long b){
        return a*b;
    }

    double divide(double a, double b){
        return a / b;
    }
}

class Data{
    int x;
}

class MyMath2{
    long a,b;

    long add(){return a+b;}
    long subtract(){return a-b;}
    long multiply(){return a*b;}
    double divied(){return a/b;}

    static long add(long a, long b){return a+b;}
    static long subtract(long a, long b){return a-b;}
    static long multiply(long a, long b){return a*b;}
    static double divied(long a, long b){return a/b;}
}

class MemberCall{
    int iv =10;
    static int cv = 20;

    int iv2 = cv;
 // static int cv2 = iv; // 클래스 변수는 객체생성 없이 인스턴스 변수 참조 불가능 --> 에러 발생
    
    static void staticMethod1(){
        System.out.println(cv);
        //System.out.println(iv); // 클래스메서드에서 인스턴스변수 사용 불가 --> 에러
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    void instaceMethod1(){
        System.out.println(cv);
        System.out.println(iv); // 인스턴스메서드에서는 인스턴스 변수 바로 사용 가능
    }
    
    static void staticMethod2(){
        staticMethod1();
        // instanceMethod1(); // 클래스 메서드에서는 인스탠스 메서드 사용 불가
        MemberCall c = new MemberCall();
        c.instaceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instaceMethod1();
    }
}

class Data1{
    int value;
}

class Data2{
    int value;

    Data2(int x){ //매개변수가 있는 생성자
        value = x;
    }
}

class Car{
    String color;
    String gearType;
    int door;

    Car() {
        this("white","auto",4);
    }
    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }
}

